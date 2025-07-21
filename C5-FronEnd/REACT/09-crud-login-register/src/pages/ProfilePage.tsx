import React, { useState, useContext, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import { AuthContext } from "../context/AuthContext";
import { updateUser, deleteUser, getUser } from "../services/database";

const ProfilePage: React.FC = () => {
  const navigate = useNavigate();
  const { user, setUser } = useContext(AuthContext);
  const [name, setName] = useState(user?.name || "");
  const [email, setEmail] = useState(user?.email || "");
  const [profile, setProfile] = useState(user?.profile || "");
  const [statusMsg, setStatusMsg] = useState<string | null>(null);

  useEffect(() => {
    // Opcional: cargar usuario más actualizado desde la DB
    const loadUser = async () => {
      if (user?.id) {
        try {
          const freshUser = await getUser(user.id);
          if (freshUser) {
            setUser(freshUser);
            setName(freshUser.name);
            setEmail(freshUser.email);
            setProfile(freshUser.profile);
          }
        } catch (err) {
          console.error("No se pudo refrescar usuario", err);
        }
      }
    };
    loadUser();
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, [user?.id]);

  if (!user) {
    // Si no hay usuario (por seguridad adicional), redirigimos a login
    navigate("/login");
    return null;
  }

  const handleUpdate = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!user.id) return;
    try {
      // Actualizar en Firebase
      await updateUser(user.id, { name, email, profile });
      // Actualizar también el contexto local con nuevos datos
      const updatedUser = { ...user, name, email, profile };
      setUser(updatedUser);
      setStatusMsg("Perfil actualizado correctamente.");
    } catch (err) {
      console.error(err);
      setStatusMsg("Error al actualizar perfil.");
    }
  };

  const handleLogout = () => {
    setUser(null);
    navigate("/login");
  };

  const handleDelete = async () => {
    if (!user.id) return;
    const confirm = window.confirm("¿Seguro que deseas eliminar tu cuenta? Esta acción no se puede deshacer.");
    if (!confirm) return;
    try {
      await deleteUser(user.id);
      alert("Tu cuenta ha sido eliminada.");
      setUser(null);
      navigate("/register");
    } catch (err) {
      console.error(err);
      alert("Ocurrió un error al eliminar la cuenta.");
    }
  };

  return (
    <div>
      <h2>Perfil de Usuario</h2>
      <form onSubmit={handleUpdate}>
        <div>
          <label>Nombre:</label><br/>
          <input 
            type="text" 
            value={name} 
            onChange={e => setName(e.target.value)} 
            required 
          />
        </div>
        <div>
          <label>Email:</label><br/>
          <input 
            type="email" 
            value={email} 
            onChange={e => setEmail(e.target.value)} 
            required 
          />
        </div>
        <div>
          <label>Perfil:</label><br/>
          <input 
            type="text" 
            value={profile} 
            onChange={e => setProfile(e.target.value)} 
            required 
          />
        </div>
        <button type="submit">Guardar Cambios</button>
        {statusMsg && <p>{statusMsg}</p>}
      </form>

      <button onClick={handleLogout}>Cerrar sesión</button>
      <br/>
      <button onClick={handleDelete} style={{ color: "red", marginTop: "10px" }}>
        Eliminar cuenta
      </button>
    </div>
  );
};

export default ProfilePage;

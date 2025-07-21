import React, { useState, useContext } from "react";
import { useNavigate, Link } from "react-router-dom";
import { createUser } from "../services/database";
import { AuthContext } from "../context/AuthContext";

const RegisterPage: React.FC = () => {
  const navigate = useNavigate();
  const { setUser } = useContext(AuthContext);  // podemos no usar setUser aquí si no logueamos automáticamente
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [profile, setProfile] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState<string | null>(null);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setError(null);
    try {
      const newUser = await createUser({ name, email, profile, password });
      // Opcional: podríamos hacer login automático:
      // setUser(newUser);
      // navigate("/profile");
      // En este caso, solo redirigimos a login:
      alert("Usuario creado exitosamente. Por favor inicia sesión.");
      navigate("/login");
    } catch (err: any) {
      console.error(err);
      setError("Ocurrió un error durante el registro.");
    }
  };

  return (
    <div>
      <h2>Registro de Usuario</h2>
      <form onSubmit={handleSubmit}>
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
            placeholder="p. ej. Estudiante, Docente..." 
            required 
          />
        </div>
        <div>
          <label>Contraseña:</label><br/>
          <input 
            type="password" 
            value={password} 
            onChange={e => setPassword(e.target.value)} 
            required 
          />
        </div>
        {error && <p style={{color: "red"}}>{error}</p>}
        <button type="submit">Registrarse</button>
      </form>
      <p>¿Ya tienes cuenta? <Link to="/login">Inicia sesión aquí</Link></p>
    </div>
  );
};

export default RegisterPage;

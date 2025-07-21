import React, { useState, useContext } from "react";
import { useNavigate, Link } from "react-router-dom";
import { loginUser } from "../services/database";
import { AuthContext } from "../context/AuthContext";

const LoginPage: React.FC = () => {
  const navigate = useNavigate();
  const { setUser } = useContext(AuthContext);
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [error, setError] = useState<string | null>(null);

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setError(null);
    try {
      const user = await loginUser(email, password);
      if (user) {
        // Credenciales correctas
        setUser(user);
        navigate("/profile");
      } else {
        // No se encontró usuario con esas credenciales
        setError("Email o contraseña incorrectos");
      }
    } catch (err) {
      console.error(err);
      setError("Ocurrió un error al iniciar sesión");
    }
  };

  return (
    <div>
      <h2>Iniciar Sesión</h2>
      <form onSubmit={handleSubmit}>
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
          <label>Contraseña:</label><br/>
          <input 
            type="password" 
            value={password} 
            onChange={e => setPassword(e.target.value)} 
            required 
          />
        </div>
        {error && <p style={{color: "red"}}>{error}</p>}
        <button type="submit">Ingresar</button>
      </form>
      <p>¿No tienes cuenta? <Link to="/register">Regístrate aquí</Link></p>
    </div>
  );
};

export default LoginPage;

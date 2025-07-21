import React, { useContext } from "react";
import { Routes, Route, Navigate, Link } from "react-router-dom";
import { AuthContext } from "./context/AuthContext";
import RegisterPage from "./pages/RegisterPage";
import LoginPage from "./pages/LoginPage";
import ProfilePage from "./pages/ProfilePage";

const App: React.FC = () => {
  const { user } = useContext(AuthContext);

  return (
    <div className="App">
      {/* Navegación básica */}
      <nav style={{ padding: "10px" }}>
        {user ? (
          // Si hay usuario logueado, mostramos saludo y link a perfil
          <>
            <span>Hola, {user.name} | </span>
            <Link to="/profile">Perfil</Link>
          </>
        ) : (
          // Si no está autenticado, links a Login/Registro
          <>
            <Link to="/login">Iniciar Sesión</Link> |{" "}
            <Link to="/register">Registrarse</Link>
          </>
        )}
      </nav>

      {/* Definición de rutas */}
      <Routes>
        <Route path="/" element={<Navigate to="/login" replace />} />
        <Route path="/register" element={<RegisterPage />} />
        <Route path="/login" element={<LoginPage />} />
        {/* Ruta protegida: perfil solo accesible si hay usuario, sino redirige a login */}
        <Route 
          path="/profile" 
          element={user ? <ProfilePage /> : <Navigate to="/login" replace />} 
        />
        {/* Opcional: ruta para no encontradas */}
        <Route path="*" element={<Navigate to="/login" replace />} />
      </Routes>
    </div>
  );
};

export default App;

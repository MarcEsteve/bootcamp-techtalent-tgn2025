import React from 'react';
import { Link, useNavigate } from 'react-router-dom';
import Cookies from 'js-cookie';

interface NavBarProps {
  user: { name: string; email: string } | null;
  setUser: (user: any) => void;
}

const NavBar: React.FC<NavBarProps> = ({ user, setUser }) => {
  const navigate = useNavigate();

  const handleLogout = () => {
    Cookies.remove('loggedUser');
    setUser(null);
    navigate('/');
  };

  return (
    <nav style={{ padding: '1rem', backgroundColor: '#eee' }}>
      <Link to="/" style={{ marginRight: '1rem' }}>Inicio</Link>
      {!user ? (
        <>
          <Link to="/login" style={{ marginRight: '1rem' }}>Iniciar sesión</Link>
          <Link to="/register">Registrarse</Link>
        </>
      ) : (
        <>
          <span style={{ marginRight: '1rem' }}>👋 Hola, {user.name}</span>
          <button onClick={handleLogout}>Cerrar sesión</button>
        </>
      )}
    </nav>
  );
};

export default NavBar;

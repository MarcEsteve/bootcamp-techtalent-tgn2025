import { Link, useNavigate } from 'react-router-dom';
import '../styles/NavBar.css';

const NavBar = () => {
  const isAuthenticated = document.cookie.includes('redactor=');
  const navigate = useNavigate();

  const handleLogout = () => {
    document.cookie = 'redactor=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;';
    navigate('/login');
  };

  return (
    <nav className="navbar">
      <div className="navbar-left">
        <Link to="/">Blog</Link>
      </div>

      <div className="navbar-right">
        {!isAuthenticated && <Link to="/login">Login</Link>}
        {!isAuthenticated && <Link to="/register">Registro</Link>}
        {isAuthenticated && <Link to="/nuevo">Nuevo artículo</Link>}
        {isAuthenticated && (
          <button onClick={handleLogout} className="logout-btn">
            Cerrar sesión
          </button>
        )}
      </div>
    </nav>
  );
};

export default NavBar;

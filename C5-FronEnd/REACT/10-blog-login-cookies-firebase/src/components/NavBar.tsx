import { Link, useNavigate } from 'react-router-dom';
import Cookies from 'js-cookie';
import '../styles/NavBar.css';

function NavBar() {
  const navigate = useNavigate();
  const userCookie = Cookies.get('redactor');
  const redactor = userCookie ? JSON.parse(userCookie) : null;

  const handleLogout = () => {
    Cookies.remove('redactor');
    navigate('/');
    window.location.reload(); // Forzar recarga de la app sin sesión
  };

  return (
    <nav className="navbar">
      <div className="navbar__left">
        <Link to="/" className="navbar__logo">📝 MicroBlog</Link>
      </div>

      <div className="navbar__right">
        {redactor ? (
          <>
            <span className="navbar__user">Hola, <strong>{redactor.username}</strong></span>
            <Link to="/create" className="navbar__link">Nuevo artículo</Link>
            <button onClick={handleLogout} className="navbar__logout">Cerrar sesión</button>
          </>
        ) : (
          <>
            <Link to="/login" className="navbar__link">Login</Link>
            <Link to="/register" className="navbar__link">Registro</Link>
          </>
        )}
      </div>
    </nav>
  );
}

export default NavBar;

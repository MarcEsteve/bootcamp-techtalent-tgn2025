import {
  Outlet
} from 'react-router-dom';
import CustomLink from './CustomLink';
import "./Layout.css";

function Layout() {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <CustomLink to="/">Inicio</CustomLink>
          </li>
          <li>
            <CustomLink to="/nosotros">Nosotros</CustomLink>
          </li>
          <li>
            <CustomLink to="/servicios">Servicios</CustomLink>
          </li>
        </ul>
      </nav>

      <hr />

      <Outlet />
    </div>
  );
}

export default Layout;

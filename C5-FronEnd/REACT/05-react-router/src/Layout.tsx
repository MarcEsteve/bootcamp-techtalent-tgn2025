import {
  Outlet
} from 'react-router-dom';
import CustomLink from './CustomLink';

function Layout() {
  return (
    <div>
      <nav>
        <ul>
          <li>
            <CustomLink to="/">Inicio</CustomLink>
          </li>
          <li>
            <CustomLink to="/about">Nosotros</CustomLink>
          </li>
        </ul>
      </nav>

      <hr />

      <Outlet />
    </div>
  );
}

export default Layout;

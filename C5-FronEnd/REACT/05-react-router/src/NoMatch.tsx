import {
  Link,
} from 'react-router-dom';

function NoMatch() {
  return (
    <div>
      <h1>Página no encontrada</h1>
      <p>Error 404</p>
      <p>
        <Link to="/">Volver a Inicio</Link>
      </p>
    </div>
  );
}

export default NoMatch;
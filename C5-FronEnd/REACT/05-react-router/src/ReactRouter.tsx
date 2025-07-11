import {
  Routes,
  Route
} from 'react-router-dom';
import Layout from './Layout';
import Inicio from './Inicio';
import Nosotros from './Nosotros';
import NoMatch from './NoMatch';
import Servicios from './Servicios';


//npm install react-router-dom

function ReactRouter() {
  return (
    <div>
      <h1>Custom Link Example</h1>

      <p>
        This example demonstrates how to create a custom{' '}
        <code>&lt;Link&gt;</code> component that knows whether or not it is
        "active" using the low-level <code>useResolvedPath()</code> and{' '}
        <code>useMatch()</code> hooks.
      </p>

      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Inicio />} />
          <Route path="nosotros" element={<Nosotros />} />
          <Route path="servicios" element={<Servicios />} />
          <Route path="*" element={<NoMatch />} />
        </Route>
      </Routes>
    </div>
  );
}

export default  ReactRouter;
import {
  Routes,
  Route
} from 'react-router-dom';
import Layout from './Layout';
import Home from './Home';
import About from './About';
import NoMatch from './NoMatch';


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
          <Route index element={<Home />} />
          <Route path="about" element={<About />} />
          <Route path="*" element={<NoMatch />} />
        </Route>
      </Routes>
    </div>
  );
}

export default  ReactRouter;
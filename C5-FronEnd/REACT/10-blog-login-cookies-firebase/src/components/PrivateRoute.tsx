import type { JSX } from 'react';
import { Navigate } from 'react-router-dom';

interface Props {
  children: JSX.Element;
}

const PrivateRoute = ({ children }: Props) => {
  const isAuthenticated = document.cookie.includes('redactor=');
  return isAuthenticated ? children : <Navigate to="/login" />;
};

export default PrivateRoute;

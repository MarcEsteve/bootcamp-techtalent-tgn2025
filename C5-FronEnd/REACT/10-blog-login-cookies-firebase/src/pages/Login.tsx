import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import Cookies from 'js-cookie';
import '../styles/Login.css';

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    try {
      const response = await fetch(
        'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/redactores.json'
      );
      const data = await response.json();

      const foundUser = Object.values(data).find(
        (user: any) => user.email === email && user.password === password
      );

      if (foundUser) {
        Cookies.set('loggedInUser', JSON.stringify(foundUser), { expires: 1 });
        navigate('/');
      } else {
        setError('Correo o contraseña incorrectos.');
      }
    } catch (err) {
      setError('Error al iniciar sesión. Inténtalo de nuevo.');
    }
  };

  return (
    <div className="login-container">
      <div className="login-box">
        <h2>Iniciar sesión</h2>
        {error && <p className="login-error">{error}</p>}
        <form onSubmit={handleSubmit}>
          <label>Correo electrónico</label>
          <input
            type="email"
            value={email}
            onChange={e => setEmail(e.target.value)}
            required
          />

          <label>Contraseña</label>
          <input
            type="password"
            value={password}
            onChange={e => setPassword(e.target.value)}
            required
          />

          <button type="submit">Acceder</button>
        </form>
      </div>
    </div>
  );
}

export default Login;

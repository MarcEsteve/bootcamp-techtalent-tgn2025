import React, { useState } from 'react';
import '../styles/Auth.css';
import '../styles/Login.css';

interface Redactor {
  username: string;
  email: string;
  password: string;
}

const Login: React.FC = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleLogin = async (e: React.FormEvent) => {
    e.preventDefault();

    try {
      const res = await fetch(
        'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/redactores.json'
      );
      const data = await res.json();

      const found = Object.values(data).find(
        (redactor: any) => redactor.email === email && redactor.password === password
      );

      if (found) {
        localStorage.setItem('loggedUser', JSON.stringify(found));
        window.location.href = '/';
      } else {
        setError('Correo o contraseña incorrectos.');
      }
    } catch (err) {
      console.error(err);
      setError('Error al iniciar sesión.');
    }
  };

  return (
    <div className="auth-container">
      <h2>Iniciar sesión</h2>
      <form onSubmit={handleLogin}>
        <input type="email" placeholder="Correo" value={email} onChange={e => setEmail(e.target.value)} required />
        <input type="password" placeholder="Contraseña" value={password} onChange={e => setPassword(e.target.value)} required />
        <button type="submit">Entrar</button>
        {error && <p className="error">{error}</p>}
      </form>
    </div>
  );
};

export default Login;

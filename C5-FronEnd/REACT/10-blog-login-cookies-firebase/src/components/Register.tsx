import React, { useState } from 'react';
import '../styles/Auth.css';

const Register: React.FC = () => {
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const [success, setSuccess] = useState(false);

  const handleRegister = async (e: React.FormEvent) => {
    e.preventDefault();

    const newUser = {
      username,
      email,
      password
    };

    try {
      await fetch(
        'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/redactores.json',
        {
          method: 'POST',
          body: JSON.stringify(newUser),
          headers: {
            'Content-Type': 'application/json'
          }
        }
      );
      setSuccess(true);
      setUsername('');
      setEmail('');
      setPassword('');
    } catch (err) {
      console.error(err);
      setError('Error al registrar usuario.');
    }
  };

  return (
    <div className="auth-container">
      <h2>Registro</h2>
      <form onSubmit={handleRegister}>
        <input type="text" placeholder="Nombre de usuario" value={username} onChange={e => setUsername(e.target.value)} required />
        <input type="email" placeholder="Correo" value={email} onChange={e => setEmail(e.target.value)} required />
        <input type="password" placeholder="Contraseña" value={password} onChange={e => setPassword(e.target.value)} required />
        <button type="submit">Registrarse</button>
        {error && <p className="error">{error}</p>}
        {success && <p className="success">Usuario registrado con éxito</p>}
      </form>
    </div>
  );
};

export default Register;
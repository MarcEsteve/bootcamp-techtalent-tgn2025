import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/Register.css';

function Register() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [profile, setProfile] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');
  const navigate = useNavigate();

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    const newUser = {
      name,
      email,
      profile,
      password
    };

    try {
      const response = await fetch(
        'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/redactores.json',
        {
          method: 'POST',
          body: JSON.stringify(newUser)
        }
      );

      if (!response.ok) {
        throw new Error('Error al registrar');
      }

      navigate('/login');
    } catch (err) {
      setError('Error al registrar. Inténtalo de nuevo.');
    }
  };

  return (
    <div className="register-container">
      <div className="register-box">
        <h2>Registro de usuario</h2>
        {error && <p className="register-error">{error}</p>}
        <form onSubmit={handleSubmit}>
          <label>Nombre de usuario</label>
          <input
            type="text"
            value={name}
            onChange={e => setName(e.target.value)}
            required
          />

          <label>Correo electrónico</label>
          <input
            type="email"
            value={email}
            onChange={e => setEmail(e.target.value)}
            required
          />

          <label>Perfil</label>
          <input
            type="text"
            value={profile}
            onChange={e => setProfile(e.target.value)}
            required
          />

          <label>Contraseña</label>
          <input
            type="password"
            value={password}
            onChange={e => setPassword(e.target.value)}
            required
          />

          <button type="submit">Registrar</button>
        </form>
      </div>
    </div>
  );
}

export default Register;

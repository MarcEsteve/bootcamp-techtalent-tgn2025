import React, { useEffect, useState } from 'react';

const TestConnection: React.FC = () => {
  const [users, setUsers] = useState<any>(null);
  const [error, setError] = useState<string | null>(null);

  const BASE_URL =
    'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app';

  useEffect(() => {
    const fetchUsers = async () => {
      try {
        const res = await fetch(`${BASE_URL}/users.json`);
        if (!res.ok) {
          throw new Error(`Error HTTP: ${res.status}`);
        }
        const data = await res.json();
        setUsers(data);
      } catch (err: any) {
        setError(err.message);
        console.error('Error al conectar con Firebase:', err);
      }
    };

    fetchUsers();
  }, []);

  return (
    <div>
      <h2>📡 Usuarios en Firebase</h2>
      {error && <p style={{ color: 'red' }}>❌ Error: {error}</p>}

      {users ? (
        <ul>
          {Object.entries(users).map(([id, user]: [string, any]) => (
            <li key={id}>
              <strong>{user.nombre}</strong> — {user.email}
            </li>
          ))}
        </ul>
      ) : (
        !error && <p>🔄 Cargando usuarios...</p>
      )}
    </div>
  );
};

export default TestConnection;

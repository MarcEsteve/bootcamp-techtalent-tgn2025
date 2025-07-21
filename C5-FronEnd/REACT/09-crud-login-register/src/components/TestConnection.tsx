import React, { useEffect, useState } from 'react';

const TestConnection: React.FC = () => {
  const [users, setUsers] = useState<Record<string, any> | null>(null);
  const [error, setError] = useState<string | null>(null);

  const BASE_URL =
    'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app';

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = async () => {
    try {
      const res = await fetch(`${BASE_URL}/users.json`);
      if (!res.ok) throw new Error(`Error HTTP: ${res.status}`);
      const data = await res.json();
      setUsers(data);
    } catch (err: any) {
      setError(err.message);
    }
  };

  const handleDelete = async (userId: string) => {
    try {
      const res = await fetch(`${BASE_URL}/users/${userId}.json`, {
        method: 'DELETE',
      });
      if (!res.ok) throw new Error(`Error al borrar: ${res.status}`);
      // Recarga los usuarios tras borrar
      fetchUsers();
    } catch (err: any) {
      console.error('Error al borrar usuario:', err.message);
      alert('❌ No se pudo borrar el usuario');
    }
  };

  const getTableHeaders = () => {
    if (!users) return [];
    const firstUserKey = Object.keys(users)[0];
    return Object.keys(users[firstUserKey]);
  };

  return (
    <div style={{ padding: '1rem' }}>
      <h2>📊 Tabla de Usuarios</h2>
      {error && <p style={{ color: 'red' }}>❌ Error: {error}</p>}

      {!users && !error && <p>🔄 Cargando usuarios...</p>}

      {users && (
        <table border={1} cellPadding={10} style={{ borderCollapse: 'collapse', width: '100%' }}>
          <thead style={{ backgroundColor: '#f0f0f0' }}>
            <tr>
              <th>🗑️</th>
              <th>ID</th>
              {getTableHeaders().map((key) => (
                <th key={key}>{key}</th>
              ))}
            </tr>
          </thead>
          <tbody>
            {Object.entries(users).map(([id, user]) => (
              <tr key={id}>
                <td>
                  <button
                    onClick={() => handleDelete(id)}
                    style={{
                      backgroundColor: 'transparent',
                      color: 'red',
                      border: 'none',
                      fontWeight: 'bold',
                      cursor: 'pointer',
                    }}
                    title="Borrar usuario"
                  >
                    ❌
                  </button>
                </td>
                <td>{id}</td>
                {getTableHeaders().map((key) => (
                  <td key={key}>{user[key]}</td>
                ))}
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
};

export default TestConnection;

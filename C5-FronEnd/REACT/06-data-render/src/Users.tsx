import { useEffect, useState } from 'react';

function Users() {
  const [users, setUsers] = useState([]);
  const [loading, setLoading] = useState(true);

  // Petición a la API una sola vez
  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/users')
      .then(r => r.json())
      .then(data => {
        setUsers(data);
        setLoading(false);
      })
      .catch(() => setLoading(false));
  }, []);

  /* --- Render --- */
  if (loading) return <p>Cargando…</p>;      

  return (users
    // <ul>
    //   {users.map(user => (  
    //     <li key={user.id}>
    //       {user.name} — {user.username} — {user.email}  
    //     </li>
    //   ))}
    // </ul>
  );
}

export default Users;
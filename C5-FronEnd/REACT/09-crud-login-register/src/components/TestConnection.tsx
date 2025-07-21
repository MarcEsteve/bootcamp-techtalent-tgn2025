import React, { useEffect, useState } from "react";

const BASE_URL =
  "https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app";

type User = {
  name: string;
  email: string;
  password: string;
  profile: string;
};

const TestConnection: React.FC = () => {
  const [users, setUsers] = useState<Record<string, User> | null>(null);
  const [error, setError] = useState<string | null>(null);
  const [showForm, setShowForm] = useState(false);
  const [newUser, setNewUser] = useState<User>({
    name: "",
    email: "",
    password: "",
    profile: "",
  });
  const [editingUserId, setEditingUserId] = useState<string | null>(null);
  const [editedUser, setEditedUser] = useState<Partial<User>>({});

  useEffect(() => {
    fetchUsers();
  }, []);

  const fetchUsers = async () => {
    try {
      const res = await fetch(`${BASE_URL}/users.json`);
      if (!res.ok) throw new Error(`Error HTTP: ${res.status}`);
      const data = await res.json();
      setUsers(data || {});
    } catch (err: any) {
      setError(err.message);
    }
  };

  const handleDelete = async (userId: string) => {
    try {
      const res = await fetch(`${BASE_URL}/users/${userId}.json`, {
        method: "DELETE",
      });
      if (!res.ok) throw new Error(`Error al borrar: ${res.status}`);
      fetchUsers();
    } catch (err: any) {
      alert("❌ No se pudo borrar el usuario");
    }
  };

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setNewUser({ ...newUser, [e.target.name]: e.target.value });
  };

  const handleAddUser = async (e: React.FormEvent) => {
    e.preventDefault();
    try {
      const newId = `user${Object.keys(users || {}).length + 1}`;
      const res = await fetch(`${BASE_URL}/users/${newId}.json`, {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(newUser),
      });
      if (!res.ok) throw new Error(`Error al crear: ${res.status}`);
      setNewUser({ name: "", email: "", password: "", profile: "" });
      setShowForm(false);
      fetchUsers();
    } catch (err: any) {
      alert("❌ No se pudo crear el usuario");
    }
  };

  const getTableHeaders = () => {
    if (!users) return [];
    const firstUserKey = Object.keys(users)[0];
    return Object.keys(users[firstUserKey]);
  };

  //Edición
  const handleEditChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    setEditedUser({ ...editedUser, [e.target.name]: e.target.value });
  };

  //Guardar cambios

  const handleSaveEdit = async (userId: string) => {
    try {
      const res = await fetch(`${BASE_URL}/users/${userId}.json`, {
        method: "PATCH",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(editedUser),
      });
      if (!res.ok) throw new Error("Error al guardar");
      setEditingUserId(null);
      setEditedUser({});
      fetchUsers();
    } catch (err) {
      alert("❌ No se pudo guardar");
    }
  };

  //Cancelar edición

  const cancelEdit = () => {
    setEditingUserId(null);
    setEditedUser({});
  };

  return (
    <div style={{ padding: "1rem" }}>
      <h2>👥 Usuarios registrados</h2>
      <button
        onClick={() => setShowForm(!showForm)}
        style={{
          padding: "0.5rem 1rem",
          marginBottom: "1rem",
          backgroundColor: "#4CAF50",
          color: "#fff",
          border: "none",
          cursor: "pointer",
        }}
      >
        {showForm ? "⬅ Volver" : "➕ Añadir nuevo usuario"}
      </button>

      {showForm && (
        <form onSubmit={handleAddUser} style={{ marginBottom: "2rem" }}>
          <input
            type="text"
            name="name"
            placeholder="Nombre"
            value={newUser.name}
            onChange={handleInputChange}
            required
          />
          <input
            type="email"
            name="email"
            placeholder="Correo"
            value={newUser.email}
            onChange={handleInputChange}
            required
          />
          <input
            type="text"
            name="profile"
            placeholder="Perfil"
            value={newUser.profile}
            onChange={handleInputChange}
            required
          />
          <input
            type="password"
            name="password"
            placeholder="Contraseña"
            value={newUser.password}
            onChange={handleInputChange}
            required
          />
          <button
            type="submit"
            style={{
              backgroundColor: "#2196F3",
              color: "#fff",
              border: "none",
              padding: "0.5rem 1rem",
              marginLeft: "0.5rem",
              cursor: "pointer",
            }}
          >
            Guardar usuario
          </button>
        </form>
      )}

      {error && <p style={{ color: "red" }}>❌ Error: {error}</p>}
      {!users && <p>🔄 Cargando usuarios...</p>}

      {users && !showForm && (
        <table
          border={1}
          cellPadding={10}
          style={{ borderCollapse: "collapse", width: "100%" }}
        >
          <thead style={{ backgroundColor: "#eee" }}>
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
                  {editingUserId === id ? (
                    <>
                      <button
                        onClick={() => handleSaveEdit(id)}
                        style={{ color: "green" }}
                      >
                        ✅
                      </button>
                      <button onClick={cancelEdit} style={{ color: "gray" }}>
                        ❌
                      </button>
                    </>
                  ) : (
                    <>
                      <button
                        onClick={() => handleDelete(id)}
                        style={{ color: "red" }}
                      >
                        🗑️
                      </button>
                      <button
                        onClick={() => {
                          setEditingUserId(id);
                          setEditedUser(user);
                        }}
                        style={{ marginLeft: "5px" }}
                      >
                        ✏️
                      </button>
                    </>
                  )}
                </td>
                <td>{id}</td>
                {getTableHeaders().map((key) => (
                  <td key={key}>
                    {editingUserId === id ? (
                      <input
                        name={key}
                        value={editedUser[key as keyof User] || ""}
                        onChange={handleEditChange}
                      />
                    ) : (
                      user[key as keyof User]
                    )}
                  </td>
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

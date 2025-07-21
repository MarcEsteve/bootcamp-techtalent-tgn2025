import { type User } from '../models/User';

const BASE_URL = import.meta.env.VITE_FIREBASE_DB_URL;  // URL base de la DB, e.g. "https://tu-proyecto.firebaseio.com"

// Helper: función para verificar respuesta HTTP y extraer JSON
async function fetchJSON(url: string, options?: RequestInit) {
  const res = await fetch(url, options);
  if (!res.ok) {
    throw new Error(`Error HTTP: ${res.status}`);
  }
  return res.json();
}

/** Obtiene todos los usuarios */
export async function getAllUsers(): Promise<User[]> {
  const data = await fetchJSON(`${BASE_URL}/users.json`);
  if (!data) return [];  // si no hay datos
  // Firebase devuelve un objeto de objetos; convertimos a array de usuarios:
  return Object.entries(data).map(
    ([id, value]) =>
      ({
        id,
        ...(typeof value === 'object' && value !== null ? value : {}),
      } as User)
  );
}

/** Obtiene un usuario por su id */
export async function getUser(id: string): Promise<User | null> {
  const data = await fetchJSON(`${BASE_URL}/users/${id}.json`);
  if (!data) return null;
  return { id, ...data };
}

/** Crea un nuevo usuario en la DB (registrar) */
export async function createUser(newUser: Omit<User, "id">): Promise<User> {
  // Hacemos POST a /users.json con el cuerpo JSON del usuario (Firebase genera un id)
  const res = await fetch(`${BASE_URL}/users.json`, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(newUser)
  });
  if (!res.ok) {
    throw new Error(`Error al crear usuario: ${res.status}`);
  }
  const data = await res.json();
  // Firebase retorna { "name": "<generated-id>" }
  const id = data.name;
  return { id, ...newUser };
}

/** Actualiza un usuario existente */
export async function updateUser(id: string, updatedData: Partial<User>): Promise<void> {
  // Usamos PATCH para modificar solo campos específicos
  await fetchJSON(`${BASE_URL}/users/${id}.json`, {
    method: "PATCH",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(updatedData)
  });
  // No es necesario retorno; si necesitamos los datos actualizados podríamos hacer un GET luego.
}

/** Elimina un usuario por ID */
export async function deleteUser(id: string): Promise<void> {
  await fetchJSON(`${BASE_URL}/users/${id}.json`, { method: "DELETE" });
}

/** Intenta iniciar sesión con email y password, devuelve el usuario si coincide */
export async function loginUser(email: string, password: string): Promise<User | null> {
  const users = await getAllUsers();
  // Busca un usuario cuyo email y password coincidan
  const found = users.find(u => u.email === email && u.password === password);
  return found || null;
}
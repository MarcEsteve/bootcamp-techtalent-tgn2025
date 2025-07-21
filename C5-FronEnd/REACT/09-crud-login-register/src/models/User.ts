// Definición del modelo de Usuario
export interface User {
  id?: string;         // identificador único (clave en Firebase)
  name: string;
  email: string;
  profile: string;
  password: string;
}

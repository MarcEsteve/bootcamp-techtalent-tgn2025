import React, { createContext, useState, type ReactNode } from "react";
import { type User } from "../models/User";
// Definimos el tipo de datos que manejaremos en el contexto
interface AuthContextType {
  user: User | null;
  setUser: (user: User | null) => void;
}

// Creamos el contexto con un valor por defecto (será sobrescrito por el Provider)
export const AuthContext = createContext<AuthContextType>({
  user: null,
  setUser: () => {}
});

// Componente proveedor del contexto de autenticación
export const AuthProvider: React.FC<{children: ReactNode}> = ({ children }) => {
  const [user, setUser] = useState<User | null>(null);
  return (
    <AuthContext.Provider value={{ user, setUser }}>
      {children}
    </AuthContext.Provider>
  );
};
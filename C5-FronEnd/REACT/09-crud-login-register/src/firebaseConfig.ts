import { initializeApp } from 'firebase/app';
import { getDatabase } from 'firebase/database';

//npm i fireabase

// TODO: Reemplaza estos valores por la configuración real de tu proyecto Firebase
const firebaseConfig = {
  apiKey: "TU_API_KEY",
  authDomain: "TU_AUTH_DOMAIN",
  databaseURL: "TU_DATABASE_URL",  // URL de la base de datos en tiempo real
  projectId: "TU_PROJECT_ID",
  storageBucket: "TU_STORAGE_BUCKET",
  messagingSenderId: "TU_MESSAGING_SENDER_ID",
  appId: "TU_APP_ID"
};

// Inicializa la app de Firebase
const app = initializeApp(firebaseConfig);
// Obtiene una instancia de la Realtime Database
export const database = getDatabase(app);

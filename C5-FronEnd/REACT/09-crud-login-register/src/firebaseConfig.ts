import { initializeApp } from 'firebase/app';
import { getDatabase } from 'firebase/database';

//npm i fireabase

// TODO: Reemplaza estos valores por la configuración real de tu proyecto Firebase
const firebaseConfig = {
  apiKey: "AIzaSyDJA-U9rYcVRHiF0wutk6U2k9Pwnvrdj2E",
  authDomain: "bootcamp-techtalent-2025.firebaseapp.com",
  databaseURL: "https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "bootcamp-techtalent-2025",
  storageBucket: "bootcamp-techtalent-2025.firebasestorage.app",
  messagingSenderId: "103520873502",
  appId: "1:103520873502:web:bad3267fb103ae83f8920f"
};

// Inicializa la app de Firebase
const app = initializeApp(firebaseConfig);
// Obtiene una instancia de la Realtime Database
export const database = getDatabase(app);

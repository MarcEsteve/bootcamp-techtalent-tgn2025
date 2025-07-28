# 📝 Blog con Login, Cookies y Firebase (React + TypeScript)

Este proyecto es una webapp construida con **React + TypeScript** que permite:

- 📰 Visualizar artículos del blog
- 🔐 Iniciar sesión y registrarse como redactor
- ✍️ Crear, editar y eliminar artículos (solo redactores logueados)
- 🍪 Mantener la sesión con cookies
- 🌐 Almacenar todos los datos en Firebase Realtime Database

---

## 🚀 Tecnologías utilizadas

- [React](https://reactjs.org/)
- [TypeScript](https://www.typescriptlang.org/)
- [Vite](https://vitejs.dev/)
- [Firebase Realtime Database](https://firebase.google.com/)
- [react-router-dom](https://reactrouter.com/)
- Cookies (via `document.cookie`)

---

## 📁 Estructura del proyecto

```
/src
│
├── components/
│   ├── BlogPostCard.tsx
│   ├── NavBar.tsx
│
├── pages/
│   ├── Blog.tsx
│   ├── BlogPostPage.tsx
│   ├── CreatePost.tsx
│   ├── Login.tsx
│   ├── Register.tsx
│
├── routes/
│   ├── PrivateRoute.tsx
│
├── hooks/
│   ├── usePosts.ts
│
├── styles/
│   ├── App.css
│   ├── BlogPostCard.css
│   ├── Login.css
│   ├── Register.css
│   ├── NavBar.css
│
├── App.tsx
├── main.tsx
└── index.css
```

---

## 🔑 Acceso a Firebase

- **Base de datos de artículos:**
  ```
  https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts.json
  ```

- **Redactores registrados:**
  ```
  https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/redactores.json
  ```

> Puedes editar estas URLs en el código si migras a tu propio proyecto de Firebase.

---

## 🧪 Funcionalidades clave

- ✅ Listado de posts del blog en una vista tipo grid
- ✅ Permalink individual para cada post (`/posts/post1`, etc.)
- ✅ Registro de nuevos redactores
- ✅ Login con validación (guardado en cookies)
- ✅ NavBar que muestra usuario logueado
- ✅ Rutas protegidas (PrivateRoute) para acceso a redacción
- ✅ Edición de posts y eliminación con confirmación

---

## ▶️ Cómo ejecutar el proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/MarcEsteve/bootcamp-techtalent-tgn2025.git
   cd C5-FronEnd/REACT/10-blog-login-cookies-firebase
   ```

2. Instala las dependencias:
   ```bash
   npm install
   ```

3. Ejecuta el servidor local:
   ```bash
   npm run dev
   ```

4. Abre el navegador en `http://localhost:5173`

---

## 🧠 Créditos y agradecimientos

Este proyecto forma parte del curso **Bootcamp Fullstack Web Developers** organizado por **Techtalent Institute** en Tarragona (2025).  
Desarrollado como práctica final de React + Firebase por el grupo de alumnos y alumnas del curso.

---

## 📸 Captura de ejemplo

![Vista del blog](https://via.placeholder.com/800x400.png?text=Vista+de+la+App+del+Blog)

---

## 📬 Contribuciones

Pull requests y sugerencias son bienvenidas para seguir mejorando esta demo educativa 💡

---

## 🧩 Licencia

MIT © [MarcEsteve](https://github.com/MarcEsteve)

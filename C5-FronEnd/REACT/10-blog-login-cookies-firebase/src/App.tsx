// src/App.tsx
import { Routes, Route } from 'react-router-dom';
import Blog from './pages/Blog';
import Login from './pages/Login';
import Register from './pages/Register';
import NavBar from './components/NavBar';
import CreatePost from './pages/CreatePost';
import BlogPostPage from './pages/BlogPostPage';

function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<Blog />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/new-post" element={<CreatePost />} />
        <Route path="/post/:postId" element={<BlogPostPage />} />
      </Routes>
    </>
  );
}

export default App;

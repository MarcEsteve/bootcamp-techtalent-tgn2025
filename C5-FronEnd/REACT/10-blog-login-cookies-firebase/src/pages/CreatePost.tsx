import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import '../styles/CreatePost.css';

const CreatePost = () => {
  const navigate = useNavigate();

  const [formData, setFormData] = useState({
    title: '',
    content: '',
    category: '',
    image: '',
    date: new Date().toISOString().slice(0, 10)
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement | HTMLTextAreaElement>) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();

    try {
      const response = await fetch(
        'https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts.json',
        {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify(formData)
        }
      );

      if (!response.ok) throw new Error('Error al crear el artículo');

      navigate('/');
    } catch (error) {
      console.error(error);
      alert('No se pudo crear el artículo');
    }
  };

  return (
    <div className="create-post-container">
      <h2>Nuevo Artículo</h2>
      <form onSubmit={handleSubmit} className="create-post-form">
        <input
          type="text"
          name="title"
          placeholder="Título"
          value={formData.title}
          onChange={handleChange}
          required
        />
        <input
          type="text"
          name="category"
          placeholder="Categoría"
          value={formData.category}
          onChange={handleChange}
          required
        />
        <input
          type="text"
          name="image"
          placeholder="URL de imagen destacada"
          value={formData.image}
          onChange={handleChange}
          required
        />
        <textarea
          name="content"
          placeholder="Contenido del artículo"
          value={formData.content}
          onChange={handleChange}
          rows={6}
          required
        />
        <button type="submit">Publicar</button>
      </form>
    </div>
  );
};

export default CreatePost;

import { useParams } from 'react-router-dom';
import { useEffect, useState } from 'react';

interface Post {
  title: string;
  content: string;
  image: string;
  category: string;
  date: string;
}

function BlogPostPage() {
  const { id } = useParams<{ id: string }>();
  const [post, setPost] = useState<Post | null>(null);

  useEffect(() => {
    const fetchPost = async () => {
      try {
        const res = await fetch(`https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts/${id}.json`);
        const data = await res.json();
        setPost(data);
      } catch (error) {
        console.error('Error al cargar el post:', error);
      }
    };

    fetchPost();
  }, [id]);

  if (!post) {
    return <p>Cargando post...</p>;
  }

  return (
    <div style={{ maxWidth: '800px', margin: '2rem auto', padding: '1rem' }}>
      <img src={post.image} alt={post.title} style={{ width: '100%', borderRadius: '8px' }} />
      <h2>{post.title}</h2>
      <p><strong>Categoría:</strong> {post.category}</p>
      <p><strong>Fecha:</strong> {post.date}</p>
      <hr />
      <p style={{ marginTop: '1rem', lineHeight: '1.6' }}>{post.content}</p>
    </div>
  );
}

export default BlogPostPage;

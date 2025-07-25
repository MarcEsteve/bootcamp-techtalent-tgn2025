import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';

interface Post {
  id: string;
  title: string;
  content: string;
  category: string;
  date: string;
  image: string;
}

function Home() {
  const [posts, setPosts] = useState<Post[]>([]);

  useEffect(() => {
    fetch('https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts.json')
      .then(res => res.json())
      .then(data => {
        const loadedPosts: Post[] = Object.entries(data).map(([id, post]) => ({
          id,
          ...(post as Omit<Post, 'id'>),
        }));
        setPosts(loadedPosts);
      });
  }, []);

  return (
    <div className="post-grid">
      {posts.map(post => (
        <div key={post.id} className="post-card">
          <img src={post.image} alt={post.title} />
          <h2>{post.title}</h2>
          <p>{post.category} · {post.date}</p>
          <Link to={`/posts/${post.id}`}>Leer más</Link> {/* ✅ Enlace dinámico */}
        </div>
      ))}
    </div>
  );
}

export default Home;

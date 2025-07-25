import { useParams } from 'react-router-dom';
import { useEffect, useState } from 'react';

interface Post {
  title: string;
  content: string;
  category: string;
  date: string;
  image: string;
}

function BlogPostPage() {
  const { id } = useParams();
  const [post, setPost] = useState<Post | null>(null);

  useEffect(() => {
    fetch(`https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts/${id}.json`)
      .then(res => res.json())
      .then(data => setPost(data));
  }, [id]);

  if (!post) return <p>Cargando artículo...</p>;

  return (
    <div className="post-page">
      <h1>{post.title}</h1>
      <p><strong>{post.category}</strong> · {post.date}</p>
      <img src={post.image} alt={post.title} />
      <p>{post.content}</p>
    </div>
  );
}

export default BlogPostPage;

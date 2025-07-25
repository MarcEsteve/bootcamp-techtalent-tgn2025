// src/components/BlogPostCard.tsx
import { Link } from 'react-router-dom';
import '../styles/BlogPostCard.css';

export interface BlogPost {
  id: string;
  title: string;
  content: string;
  date: string;
  category: string;
  image: string;
}

function BlogPostCard({ post }: { post: BlogPost }) {
  return (
    <div className="card">
      <img src={post.image} alt={post.title} />
      <div className="card-content">
        <h2>{post.title}</h2>
        <p className="category">{post.category}</p>
        <p className="date">{post.date}</p>
        <p>{post.content.slice(0, 100)}...</p>
        <Link to={`/posts/${post.id}`} className="read-more">Leer más</Link>
      </div>
    </div>
  );
}

export default BlogPostCard;

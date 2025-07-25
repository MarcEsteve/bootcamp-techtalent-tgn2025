import "../styles/BlogPostCard.css";
import { type Post } from "../hooks/usePosts";

interface Props {
  post: Post;
}

const BlogPostCard = ({ post }: Props) => {
  return (
    <div className="card">
      <img src={post.image} alt={post.title} />
      <h2>{post.title}</h2>
      <p className="category">{post.category}</p>
      <p className="date">{post.date}</p>
      <p>{post.content}</p>
    </div>
  );
};

export default BlogPostCard;

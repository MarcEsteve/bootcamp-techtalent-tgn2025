import { useState } from "react";
import { usePosts } from "../hooks/usePosts";
import BlogPostCard from "../components/BlogPostCard";

const POSTS_PER_PAGE = 2;

const Blog = () => {
  const { posts, loading } = usePosts();
  const [page, setPage] = useState(1);

  const start = (page - 1) * POSTS_PER_PAGE;
  const currentPosts = posts.slice(start, start + POSTS_PER_PAGE);

  const totalPages = Math.ceil(posts.length / POSTS_PER_PAGE);

  return (
    <div>
      <h1 style={{ textAlign: "center" }}>Blog</h1>
      {loading ? (
        <p>Cargando...</p>
      ) : (
        <>
          <div className="grid">
            {currentPosts.map((post) => (
              <BlogPostCard key={post.id} post={post} />
            ))}
          </div>
          <div className="pagination">
            {Array.from({ length: totalPages }, (_, i) => (
              <button
                key={i}
                onClick={() => setPage(i + 1)}
                className={page === i + 1 ? "active" : ""}
              >
                {i + 1}
              </button>
            ))}
          </div>
        </>
      )}
    </div>
  );
};

export default Blog;

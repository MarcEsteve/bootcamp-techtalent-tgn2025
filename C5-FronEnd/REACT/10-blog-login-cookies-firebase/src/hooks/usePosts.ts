// hooks/usePosts.ts
import { useEffect, useState } from "react";

export interface Post {
  id: string;
  title: string;
  content: string;
  category: string;
  image: string;
  date: string;
}

export const usePosts = () => {
  const [posts, setPosts] = useState<Post[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchPosts = async () => {
      try {
        const res = await fetch("https://bootcamp-techtalent-2025-default-rtdb.europe-west1.firebasedatabase.app/posts.json");
        const data = await res.json();

        const formatted = Object.entries(data).map(([id, post]) => ({
          id,
          ...(post as Omit<Post, "id">)
        }));

        setPosts(formatted);
      } catch (err) {
        console.error("Error al cargar posts", err);
      } finally {
        setLoading(false);
      }
    };

    fetchPosts();
  }, []);

  return { posts, loading };
};

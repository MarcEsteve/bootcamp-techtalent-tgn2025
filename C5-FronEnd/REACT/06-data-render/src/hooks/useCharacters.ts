import { useEffect, useState } from 'react';

export interface Character {
  id: number;
  name: string;
  image: string;
  species: string;
  status: string;
}

export const useCharacters = () => {
  const [characters, setCharacters] = useState<Character[]>([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch('https://rickandmortyapi.com/api/character')
      .then((r) => r.json())
      .then((data) => {
        setCharacters(data.results.slice(0, 21)); // ⇢ solo 9
        setLoading(false);
      })
      .catch(() => setLoading(false));
  }, []);

  return { characters, loading };
};

import { useEffect, useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Cookies from 'js-cookie';

import Blog from './pages/Blog';
import Login from './components/Login';
import Register from './components/Register';
import NavBar from './components/NavBar';

interface User {
  name: string;
  email: string;
}

function App() {
  const [user, setUser] = useState<User | null>(null);

  // Cargar sesión desde cookie al inicio
  useEffect(() => {
    const userCookie = Cookies.get('loggedUser');
    if (userCookie) {
      setUser(JSON.parse(userCookie));
    }
  }, []);

  return (
    <Router>
      <NavBar user={user} setUser={setUser} />
      <Routes>
        <Route path="/" element={<Blog />} />
        <Route path="/login" element={<Login setUser={setUser} />} />
        <Route path="/register" element={<Register />} />
      </Routes>
    </Router>
  );
}

export default App;

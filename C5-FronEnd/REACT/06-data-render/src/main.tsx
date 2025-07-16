import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.tsx'
// import Users from './Users.tsx'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <App/>
    {/* <Users/> */}
  </StrictMode>
)

import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import ReactRouter from './ReactRouter'
import { BrowserRouter } from "react-router-dom";


createRoot(document.getElementById('root')!).render(
  <StrictMode>
    {/* <Header></Header> */}
    <BrowserRouter>
      <ReactRouter />
    </BrowserRouter>
    {/* <Footer></Footer> */}
  </StrictMode>,
)

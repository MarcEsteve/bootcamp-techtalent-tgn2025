import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App';
import SegundoComponente from './SegundoComponente';
import ComponenteProp from './ComponenteProp';
import ShoppingList from './Arrays';
import MouseExample from './EventosMouse';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    {/* <App/> */}
    {/* <SegundoComponente/> */}
    {/* <ComponenteProp title="Hola soy Marc" subtitulo={123} /> */}
    {/* <ShoppingList /> */}
    <MouseExample/>
  </React.StrictMode>
);
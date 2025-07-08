import React from 'react'
import ReactDOM from 'react-dom/client'

//Función "Componente"
function App() {
  //document.createElement...
  return (<h1>Hola mundo</h1>);
}

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>
);
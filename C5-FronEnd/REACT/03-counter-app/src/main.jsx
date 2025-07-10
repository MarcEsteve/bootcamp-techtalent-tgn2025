import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './HelloWorldApp';
import { SegundoComponente } from './SegundoComponentes';
import { CounterApp } from './CounterApp';

//Functional component

// function App() {
//   //document.createElement...
//   return (<h1>Hola mundo</h1>);
// }

//Renderización

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <App />
    <SegundoComponente />
    <CounterApp value={ 13 } />
  </React.StrictMode>
);
// import { Fragment } from "react";
import Mar from './assets/mar1.avif';
const nombre = 'Marc';
const nuevoMensaje= {
     mensaje:'Hola Mundo',
     nombre: 'Marc'
};
const boleano = true;

const SegundoComponente = () => {

    // const nombre = 'Marc';

    return (
  
      <>
        <p>Segundo componente</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Non maxime inventore, nemo dolorum autem omn pepito is. {nombre} Dolorem, magni eligendi beatae sapiente sunt molestias! Cum fuga quibusdam quam quidem distinctio vel fugit!</p>
        <p>{ 1+2 }</p>
        <p>{ nombre }</p>
        {/* <p>{nuevoMensaje}</p> */}
        <p>{ nuevoMensaje.mensaje }</p>
        <p>{boleano}</p>
        <code>{ JSON.stringify(nuevoMensaje) }</code>
        <img src={Mar} alt="Una imagen del pepito" />
      </>

    )
}

export default SegundoComponente;
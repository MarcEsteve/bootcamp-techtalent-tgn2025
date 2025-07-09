// import { Fragment } from "react";
import Mar from "./assets/mar1.avif";
import MiBoton from "./Button";
import Perfil from "./Perfil";
import Shakira from "./Shakira";
import Topuria from "./Topuria";

const nombre = "Marc";
const nuevoMensaje = {
  mensaje: "Hola Mundo",
  nombre: "Marc",
};

const boleano = true;
// let content;
// if (boleano) {
//   content = <Shakira />;
// } else {
//   content = <Topuria />;
// }

//10/07/2025
// const getResult = (a,b)=> a+b;

const SegundoComponente = () => {
  // const nombre = 'Marc';

  return (
    <>
      {/* <h1>{getResult(1,3)}</h1> */}
      <p>Segundo componente</p>
      <p>
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Non maxime
        inventore, nemo dolorum autem omn pepito is. {nombre} Dolorem, magni
        eligendi beatae sapiente sunt molestias! Cum fuga quibusdam quam quidem
        distinctio vel fugit!
      </p>
      <p>{1 + 2}</p>
      <MiBoton />
      <button>Otro botón</button>
      {/* <div>{content}</div> */}
      <div>{boleano ? <Topuria /> : <Shakira />}</div>
      {/* <Perfil /> */}
      <p>{nombre}</p>
      {/* <p>{nuevoMensaje}</p> */}
      <p>{nuevoMensaje.mensaje}</p>
      <p>{boleano}</p>
      <code>{JSON.stringify(nuevoMensaje)}</code>
      <img src={Mar} alt="Una imagen del pepito" />
    </>
  );
};

export default SegundoComponente;

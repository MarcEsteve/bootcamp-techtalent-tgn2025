// import { Fragment } from "react"

// const nombre = 'Marc';
// const nuevoMensaje= {
//      mensaje:'Hola Mundo',
//      nombre: 'Marc'
// };

export const SegundoComponente = () => {
    return (
        <div>Segundo componente</div>
    )
}

// export const SegundoComponente = () => {
//     return (
//         <div>Segundo componente</div>
//         <p>Un párrafo</p>
//     )
// }

// export const SegundoComponente = () => {
//     return (
//       <Fragment>
//         <div>Segundo componente</div>
//         <p>Un párrafo</p>
//       </Fragment>
//     )
// }

// export const SegundoComponente = () => {
    //Aqui mejor no porque Re-renderizaria
// const nombre = 'Marc';

//     return (
//       <>
//         <div>Segundo componente</div>
//          <p>{ 1+2 }</p>
//         <p>{ nombre }</p>
//         <p>{ nuevoMensaje.mensaje }</p>
//         <code>{ JSON.stringify(nuevoMensaje) }</code>
//       </>
//     )
// }
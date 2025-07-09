import PropTypes from 'prop-types';
// npm install prop-types

//Properties "props"

// const ComponenteProp = (props) =>{
//     console.log(props);
//     return (
//         <>
//         <h1>{props.title}</h1>
//         <p>texto</p>
//         </>
//     )
// };

// const ComponenteProp = ({title}) =>{

//     return (
//         <>
//         <h1>{title}</h1>
//         <p>texto</p>
//         </>
//     )
// };

// const ComponenteProp = ({title="Hola soy Marc"}) =>{

//     return (
//         <>
//         <h1>{title}</h1>
//         <p>texto</p>
//         </>
//     )
// };

const ComponenteProp = ({title, subtitulo}) =>{

    return (
        <>
        <h1>{title}</h1>
        <p>texto</p>
        <p>{subtitulo +1}</p>
        </>
    )
};

ComponenteProp.propTypes = {
    subtitulo: PropTypes.string.isRequired 
}

export default ComponenteProp;
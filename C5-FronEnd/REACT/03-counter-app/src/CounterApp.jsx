import { useState } from 'react';
import PropTypes from 'prop-types';


export const CounterApp = ({ value }) => {
    
    //Inicializamos el valor de "counter" con la prop "value"
    const [ counter, setCounter ] = useState( value );

    const handleAdd = () => { 
        // console.log(event)
        setCounter( counter + 1 );
        // setCounter( (c) => c + 1 )
    }

    const handleSubstract = () => setCounter( counter - 1 );
    const handleReset = () => setCounter( value );

    return (
        <>
            <h1>CounterApp</h1>
            <h2> { counter } </h2>

            <button onClick={ handleAdd }> +1 </button>
            <button onClick={ handleSubstract }> -1 </button>
            <button onClick={ handleReset } aria-label="btn-reset" > Reset </button>
        </>
    );
}

CounterApp.propTypes = {
    value: PropTypes.number.isRequired
}
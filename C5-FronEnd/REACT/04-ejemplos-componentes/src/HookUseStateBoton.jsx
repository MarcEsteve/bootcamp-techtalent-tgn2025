import MyButtonHook from './MyButtonHook';

function ContadorBotones() {
  return (
    <div>
      <h1>Contadores que se actualizan separadamente</h1>
      <MyButtonHook />
      <MyButtonHook />
    </div>
    // <div>
    //   <h1>Contadores que se actualizan juntos</h1>
    //   <MyButtonHook count={count} onClick={handleClick} />
    //   <MyButtonHook count={count} onClick={handleClick} />
    // </div>
  );
}

export default ContadorBotones;
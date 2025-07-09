import './Perfil.css';

const topuria = {
  name: 'Topuria',
  imageUrl: ' https://s2.abcstatics.com/abc/www/multimedia/deportes/2025/04/11/topuria-ilia-ufc-RhZxCIqvnRbFGBrotvE6ylK-1200x840@diario_abc.PNG',
  imageSize: 90,
};

function Topuria() {
  return (
    <>
      <h2>{topuria.name}</h2>
      <img
        className="perfil"
        src={topuria.imageUrl}
        alt={'Foto de ' + topuria.name}
        style={{
          height: topuria.imageSize
        }}
      />
    </>
  );
}

export default Topuria;

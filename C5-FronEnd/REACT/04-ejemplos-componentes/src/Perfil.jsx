import './Perfil.css';

const shakira = {
  name: 'Shakira',
  imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/b/b8/2023-11-16_Gala_de_los_Latin_Grammy%2C_03_%28cropped%2902.jpg',
  imageSize: 90,
};

const topuria = {
  name: 'Topuria',
  imageUrl: ' https://s2.abcstatics.com/abc/www/multimedia/deportes/2025/04/11/topuria-ilia-ufc-RhZxCIqvnRbFGBrotvE6ylK-1200x840@diario_abc.PNG',
  imageSize: 90,
};

function Perfil() {
  return (
    <>
      <h2>{shakira.name}</h2>
      <img
        className="avatar"
        src={shakira.imageUrl}
        alt={'Foto de ' + shakira.name}
        style={{
          height: shakira.imageSize
        }}
      />
      <h2>{topuria.name}</h2>
      <img
        className="avatar"
        src={topuria.imageUrl}
        alt={'Foto de ' + topuria.name}
        style={{
          height: topuria.imageSize
        }}
      />
    </>
  );
}

export default Perfil;
import './Perfil.css';

const shakira = {
  name: 'Shakira',
  imageUrl: 'https://upload.wikimedia.org/wikipedia/commons/b/b8/2023-11-16_Gala_de_los_Latin_Grammy%2C_03_%28cropped%2902.jpg',
  imageSize: 90,
};

function Shakira() {
  return (
    <>
      <h2>{shakira.name}</h2>
      <img
        className="perfil"
        src={shakira.imageUrl}
        alt={'Foto de ' + shakira.name}
        style={{
          height: shakira.imageSize
        }}
      />
    </>
  );
}

export default Shakira;
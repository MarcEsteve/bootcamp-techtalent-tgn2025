// const getImagenPromesa = () => new Promise( resolve => resolve('https://cualquierdominio.com') )
// getImagenPromesa().then( console.log );

// Para hacer una petición a la API de Giphy y obtener un GIF aleatorio, utilizamos la función fetch() que devuelve una promesa.
//async se utiliza para manejar operaciones asíncronas de manera más sencilla, permitiendo escribir código que se asemeja al estilo síncrono.
//await se utiliza para esperar a que una promesa se resuelva o se rechace, lo que permite manejar el resultado de la promesa de manera más directa y legible.
const getImagen = async () => {
  try {
    const apiKey = "C1khQe3Z7R1W2lfTO9myKeuShdqFYSGC";
    const resp = await fetch(
      `http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`
    );
    const { data } = await resp.json();

    const { url } = data.images.original;

    const img = document.createElement("img");
    img.src = url;
    document.body.append(img);
  } catch (error) {
    // manejo del error
    console.error(error);
    // Puedes mostrar un mensaje al usuario o realizar alguna acción específica
  }
};

getImagen();

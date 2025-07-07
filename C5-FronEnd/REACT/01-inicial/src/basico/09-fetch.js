// https://developer.mozilla.org/es/docs/Web/API/Fetch_API
// https://developers.giphy.com/dashboard/

//Create account > Create an API Key

const apiKey = "D9n0H1elB7UefwYGtEfLMTmI2p2Tk2xf"; // Reemplaza con tu propia API key de Giphy

// Docs > GIPHY API > GIF & Sticker Endpoints > Random Endpoint

// petición="httpCall" es decir que vamos a hacer una petición HTTP a la API de Giphy para obtener un GIF aleatorio.
// fetch() es una función que devuelve una promesa que se resuelve con la respuesta de la petición HTTP.
const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);


// peticion.then( resp => console.log(resp))
// .catch (console.warn);

// peticion.then ( resp => {
//   resp.json().then( data => {
//     console.log(data);
//   })
// })
// .catch (console.warn);


//Promesas en cadena
peticion
  .then((resp) => resp.json())
  .then(({ data }) => {
    // Desestructuramos el objeto data para obtener la información del GIF ya que es "data.data"
    const { url } = data.images.original;
    //Primero creo la imagen con la url de Giphy
    const img = document.createElement("img");
    img.src = url;
    // Luego la añado al body del documento
    document.body.append(img);
  })
  .catch(console.warn);
// Nota: En un entorno de producción, es recomendable manejar los errores de manera más robusta y no exponer la API key directamente en el código fuente.

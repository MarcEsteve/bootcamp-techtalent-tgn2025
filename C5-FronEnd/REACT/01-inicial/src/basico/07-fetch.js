const apiKey = "C1khQe3Z7R1W2lfTO9myKeuShdqFYSGC";

const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);

peticion
  .then((resp) => resp.json())
  .then(({ data }) => {
    const { url } = data.images.original;

    const img = document.createElement("img");
    img.src = url;

    document.body.append(img);
  })
  .catch(console.warn);
// Nota: En un entorno de producción, es recomendable manejar los errores de manera más robusta y no exponer la API key directamente en el código fuente.

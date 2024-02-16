const form = document.querySelector("#filter-form"); // `#` es el selector CSS para los `id`.

console.log(form); // Chequeamos en la consola que no sea `null` o `undefined`. Si es el caso, verifica el `id` tanto en este archivo com en el `cart.html`.

form.addEventListener("submit", (event) => {
	event.preventDefault();
});

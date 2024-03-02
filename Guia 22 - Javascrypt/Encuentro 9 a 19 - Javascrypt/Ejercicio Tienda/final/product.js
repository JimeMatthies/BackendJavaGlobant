document.addEventListener("DOMContentLoaded", ready);
function ready() {
	const thumbnails = document.querySelectorAll(".thumbnail");
	const selected = document.querySelector("#selected-thumbnail");
	if (!thumbnails || !selected) return console.log("Error");
	thumbnails.forEach((item) => {
		item.addEventListener("click", (event) => {
			selected.src = event.target.src;
		});
	});
	const btnAddToCart = document.querySelector("#btn-add-to-cart");
	const inputQuantity = document.querySelector("#input-quantity");
	const priceEl = document.querySelector("#price");
	const descriptionEl = document.querySelector("#description");
	const titleEl = document.querySelector("#title");
	btnAddToCart.addEventListener("click", () => {
		const quantity = Number(inputQuantity.value);
		const description = descriptionEl.textContent;
		const title = titleEl.textContent;
		console.log("XDDDDD");
		const price = parseCurrency(priceEl.textContent);
		console.log(priceEl);
		const image = selected.src;
		const product = {
			quantity,
			description,
			title,
			price,
			image,
		};
		const cart = JSON.parse(localStorage.getItem("cart") ?? "[]");
		const titles = cart.map((item) => item.title);
		const isInCart = titles.includes(title);
		if (isInCart) {
			const newCart = cart.map((item) => {
				if (item.title === title) {
					return {
						...item,
						quantity: item.quantity + quantity,
					};
				} else {
					return item;
				}
			});
			localStorage.setItem("cart", JSON.stringify(newCart));
		} else {
			localStorage.setItem("cart", JSON.stringify([...cart, product]));
		}
	});
	function parseCurrency(text) {
		// Eliminar el símbolo del dólar y los puntos
		const numberString = text.replace(/\$|\.+/g, "");
		// Convertir a número
		return Number(numberString);
	}
}

const form = document.querySelector("#filter-form"); // `#` es el selector CSS para los `id`.

console.log(form); // Chequeamos en la consola que no sea `null` o `undefined`. Si es el caso, verifica el `id` tanto en este archivo com en el `cart.html`.

form.addEventListener("submit", (event) => {
	event.preventDefault();
});

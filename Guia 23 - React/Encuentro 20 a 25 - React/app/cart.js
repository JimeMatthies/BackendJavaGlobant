const cart = JSON.parse(localStorage.getItem("cart") ?? "[]");

document.addEventListener("DOMContentLoaded", () => populate(cart));

const form = document.querySelector("#filter-form");

form.addEventListener("submit", (event) => {
  event.preventDefault();

  const userInput = event.target.search.value;

  const filteredCart = cart.filter((item) =>
    item.title.toLowerCase().includes(userInput.toLowerCase())
  );

  populate(filteredCart);
});

const btnDiscount = document.querySelector("#btn-discount");

btnDiscount.addEventListener("click", () => {
  const cartWithDiscount = cart.map((item) => {
    return {
      ...item,
      price: item.price * 0.9,
    };
  });

  populate(cartWithDiscount);
});

function populate(cart) {
  const cartContainer = document.querySelector(".cart-container");

  document.querySelector(".products")?.remove();

  if (!cartContainer) return console.log("Error");

  const productContainer = document.createElement("div");
  productContainer.classList.add("card", "products");

  cart.forEach((product) => {
    const productElement = document.createElement("article");
    productElement.classList.add("product-cart");

    const productImage = document.createElement("img");
    productImage.src = product.image;
    productImage.alt = product.title;

    const productMiddle = document.createElement("div");
    productMiddle.classList.add("middle");

    const productInfo = document.createElement("div");
    productInfo.classList.add("info");

    const productTitle = document.createElement("strong");
    productTitle.classList.add("title");
    productTitle.textContent = product.title;

    const productDescription = document.createElement("span");
    productDescription.classList.add("description");
    productDescription.textContent = product.description;

    const productInput = document.createElement("input");
    productInput.type = "number";
    productInput.value = product.quantity;
    productInput.min = 1;

    productInput.addEventListener("change", (event) => {
      const { value } = event.target;
      const index = cart.findIndex(({ title }) => product.title === title);

      if (index < 0) return console.log("Error");

      cart[index].quantity = value;

      renderTotalPrice(cart);
    });

    const productPrice = document.createElement("strong");
    productPrice.classList.add("price");
    productPrice.textContent = `AR$ ${formatPrice(product.price)}`;

    productInfo.appendChild(productTitle);
    productInfo.appendChild(productDescription);

    productMiddle.appendChild(productInfo);
    productMiddle.appendChild(productInput);

    productElement.appendChild(productImage);
    productElement.appendChild(productMiddle);
    productElement.appendChild(productPrice);
    productContainer.appendChild(productElement);
  });

  cartContainer.insertAdjacentElement("afterbegin", productContainer);

  renderTotalPrice(cart);
}

function renderTotalPrice(cart) {
  const priceElement = document.querySelector(".resume .price");

  priceElement.textContent = formatPrice(
    cart.reduce((total, { price, quantity }) => total + price * quantity, 0)
  );
}

function formatPrice(price) {
  return new Intl.NumberFormat("es-AR", {
    style: "currency",
    currency: "ARS",
  }).format(price);
}

// Asignar el elemento correcto a la variable
const buttonElem = document.querySelector(".check");
buttonElem.addEventListener("click", () => {
	let oldText = buttonElem.innerText;
	const result = (buttonElem.innerText =
		oldText == "CHECK!" ? "OFF" : "CHECK!");
	return result;
});

newPageTitle = "Guess Game";
document.getElementById("title").textContent = newPageTitle;

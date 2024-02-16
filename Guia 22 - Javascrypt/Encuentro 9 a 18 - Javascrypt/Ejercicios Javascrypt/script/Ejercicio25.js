/* Actividad Continuamos con funciones: 5 */

function esPalindromo(str) {
	var re = /[^A-Za-z0-9]/g;
	var lowRegStr = str.toLowerCase().replace(re, "");
	var reverseStr = lowRegStr.split("").reverse().join("");
	return reverseStr === lowRegStr;
}

console.log(esPalindromo("A man, a plan, a canal. Panama"));
console.log(esPalindromo("race car"));
console.log(esPalindromo("almostomla"));
console.log(esPalindromo("1 eye for of 1 eye"));

/*
Crie uma função que receba um array de elementos e retorne um array somente com os números presentes no
array recebido como parâmetro.

Exemplos:
filtrarNumeros(["javascript", 1, "3", "web", 20]) // retornará [1, 20]
filtrarNumeros(["a", "c"]) // retornará []
*/

function filtrarNumeros(arr) {
    return arr.filter(elemento => typeof elemento === 'number')
}

console.log(filtrarNumeros(["javascript", 1, "3", "web", 20]))
console.log(filtrarNumeros(["a", "c"]))

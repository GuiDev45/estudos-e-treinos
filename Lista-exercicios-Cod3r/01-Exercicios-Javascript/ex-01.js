/*
01) Crie uma função que dado dois valores (passados como parâmetros) mostre no console a soma, subtração,
multiplicação e divisão desses valores.
*/

//Functions declaration (Função de declaração)
function valores(val1, val2) {
    console.log(`Soma = ${val1 + val2} Subtração = ${val1 - val2} Multiplicação = ${val1 * val2} Divisão = ${val1 / val2}`)
}

valores(val1 = 10, val2 = 2)

//Functions expression (Função de expressão)
const valores2 = function (val1, val2) {
    console.log(`Soma = ${val1 + val2} Subtração = ${val1 - val2} Multiplicação = ${val1 * val2} Divisão = ${val1 / val2}`)
}

valores2(val1 = 20, val2 = 4)

//Arrow Functions (Função de flecha)
const valores3 = (val1, val2) => console.log(`Soma = ${val1 + val2} Subtração = ${val1 - val2} Multiplicação = ${val1 * val2} Divisão = ${val1 / val2}`)

valores3(val1 = 30, val2 = 6)

//Functions constructor (Função construtora)
function valores4(val1, val2) {
    this.val1 = val1
    this.val2 = val2
    return console.log(`Soma = ${val1 + val2} Subtração = ${val1 - val2} Multiplicação = ${val1 * val2} Divisão = ${val1 / val2}`)
}

const v4 = new valores4(40, 8)

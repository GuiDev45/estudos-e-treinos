//03) Crie uma função que recebe dois parâmetros, base e expoente, e retorne a base elevada ao expoente

//Functions declaration (Função de declaração)
function param1(p1, p2) {
    return Math.pow(p1, p2)
}
console.log(param1(p1 = 5, p2 = 2))

//Outra forma
function param2(p1, p2) {
    console.log(Math.pow(p1, p2))
}
param2(p1 = 10, p2 = 2)

//Outra forma
const val1 = 5
const val2 = 2

function param3(p1 = val1, p2 = val2) {
    console.log(Math.pow(p1, p2))
}
param3()

//Functions expression (Função de expressão)
const param4 = function(p1, p2) {
    console.log(Math.pow(p1, p2))
}
param4(p1 = 10, p2 = 2)

//Outra forma
const param5 = function(p1 = 5, p2 = 2) {
    console.log(Math.pow(p1, p2))
}
param5()

//Arrow Functions (Função de flecha)
const param6 = (p1, p2) => Math.pow(p1, p2)
console.log(param6(p1 = 10, p2 = 2))

//Outra forma, não precisava passar o p1 e p2 como parâmetro
const param7 = (p1, p2) => Math.pow(p1 = 5, p2 = 2)
console.log(param7())

//Outra forma
const param8 = () => Math.pow(p1 = 10, p2 = 2)
console.log(param8())

//Outra forma
const val3 = 5
const val4 = 2

const param9 = () => Math.pow(p1 = val1, p2 = val2)

console.log(param9())

//Outra forma
const val5 = 10
const val6 = 2

const param10 = (p1, p2) => Math.pow(p1, p2)

console.log(param10(val5, val6))

//Functions constructor (Função construtora)
function param11(val1, val2) {
    this.val1 = val1
    this.val2 = val2
    return console.log(Math.pow(val1, val2))
}

const p11 = new param11(5, 2)

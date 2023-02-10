/*
Crie uma função que receba dois números e retorne se o primeiro é maior ou igual ao segundo.

Exemplos:
maiorOuIgual(0, 0) // retornará true
maiorOuIgual(0, "0") // retornará false
maiorOuIgual(5, 1) // retornará true
*/

function maiorOuIgual(primeiro, segundo) {
    //Explicação: se o primeiro for diferente do tipo do segundo, então é falso
    if (typeof primeiro != typeof segundo) {
        return false
    }
    else {
        return primeiro >= segundo
    }
}

console.log(maiorOuIgual(0, 0))
console.log(maiorOuIgual(0, "0"))
console.log(maiorOuIgual(5, 1))

//Outra forma, com condicinal ternária
function maiorOuIgual2(primeiro, segundo) {
    return typeof primeiro != typeof segundo ? false : primeiro >= segundo
}

console.log(maiorOuIgual2(0, 0))
console.log(maiorOuIgual2(0, "0"))
console.log(maiorOuIgual2(5, 1))

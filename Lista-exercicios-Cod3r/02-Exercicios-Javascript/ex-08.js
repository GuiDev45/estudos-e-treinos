/*
Desenvolva uma função que recebe dois números inteiros não negativos (maiores ou iguais a zero) e realize a
multiplicação deles. Porém, não utilize o operador de multiplicação.

Exemplo:
multiplicar(5, 5) // retornará 25
multiplicar(0, 7) // retornará 0
*/

function multiplicar(a, b) {
    let result = 0
    for (let i = 0; i < b; i++) {
        result += a
    }
    return result
}

console.log(multiplicar(5, 5))
console.log(multiplicar(0, 7))

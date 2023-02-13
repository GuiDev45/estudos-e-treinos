/*
Criar uma função que receba um array de números e retorne o menor número desse array.

Exemplos:
menorNumero([10, 5, 35, 65]) // retornará 5
menorNumero([5, -15, 50, 3]) // retornará -15
*/

function menorNumero(numeros) {
    return console.log(Math.min(...numeros))
}

menorNumero([10, 5, 35, 65])
menorNumero([5, -15, 50, 3])

//Outra forma
function menorNumero2(numeros) {
    let menor = numeros[0]

    for (let i in numeros) {
        if (numeros[i] < menor) {
            menor = numeros[i]
        }
    }
    return console.log(menor)
}

menorNumero2([10, 5, 35, 65])
menorNumero2([5, -15, 50, 3])

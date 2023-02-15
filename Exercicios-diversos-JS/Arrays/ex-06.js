/*
Crie um array com os números de 1 a 10 e imprima na tela a soma dos números pares desse array.
*/

const pares = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

function par(arr) {
    arr.forEach(num => {
        if (num % 2 === 0) {
            console.log(num)
        }
    })
}

par(pares)

//Outra forma
function par2(arr) {
    arr.forEach(num => {
        num % 2 === 0 ? console.log(num) : false
    })
}

par2(pares)

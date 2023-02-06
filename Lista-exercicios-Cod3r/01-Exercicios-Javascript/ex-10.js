/*
10) Crie uma função que verifica se um número inteiro passado como parêmetro é divisível por 3 e retorne true
ou false.
*/

function divisivelPorTres(num) {
    if (num % 3 === 0) {
        console.log(true)
    }
    else {
        console.log(false)
    }
}

divisivelPorTres(3)
divisivelPorTres(5)

//Outra forma
const divisivelPorTres2 = (num) => {
    if (num % 3 === 0) {
        console.log(true)
    }
    else {
        console.log(false)
    }
}

divisivelPorTres2(3)
divisivelPorTres2(5)

//Outra forma, usando ternário
const divisivelPorTres3 = num => num % 3 ? false : true

console.log(divisivelPorTres3(3))
console.log(divisivelPorTres3(5))

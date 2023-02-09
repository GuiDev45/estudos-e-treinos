/*
40) Faça uma função que receba como parâmetro um vetor de notas e mostre os conceitos de cada uma de
modo que de 0,0 a 4,9 seja atribuído o conceito D, de 5,0 a 6,9 seja atribuído o conceito C, de 7,0 a 8,9 o
conceito B e de 9,0 a 10,0 o conceito A.
*/

const vet = [7, 8.5, 6, 10, 11]

function notas(vetor) {
    for (let i = 0; i < vetor.length; i++) {
        if (vetor[i] >= 0.0 && vetor[i] <= 4.9) {
            console.log(`${vetor[i]}: conceito D`)
        }
        if (vetor[i] >= 5.0 && vetor[i] <= 6.9) {
            console.log(`${vetor[i]}: conceito C`)
        }
        if (vetor[i] >= 7.0 && vetor[i] <= 8.9) {
            console.log(`${vetor[i]}: conceito B`)
        }
        if (vetor[i] >= 9.0 && vetor[i] <= 10.0) {
            console.log(`${vetor[i]}: conceito A`)
        }
    }
}

notas(vet)

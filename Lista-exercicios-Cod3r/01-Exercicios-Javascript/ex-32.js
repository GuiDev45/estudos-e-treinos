/*
32) Construir um algoritmo que calcule a média aritmética dos valores de um vetor de inteiros.
*/

const media = function(vetor) {
    let soma = 0
    for (let i = 0; i < vetor.length; i++) {
        soma += vetor[i]
    }
    console.log(soma / vetor.length) 
}

let vet = [8, 4, 2, 3, 4]
media(vet)
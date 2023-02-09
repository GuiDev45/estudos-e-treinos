/*
31) Escrever um algoritmo que percorre um vetor de inteiros, conta quantos números negativos há nesse vetor
e imprime a quantidade no console.
*/

function percorre2(vetor) {
    let qtd = 0
    for (let i = 0; i < vetor.length; i++) {
        if (vetor[i] < 0) {
            qtd ++
        }
    }
    console.log(`Quantidade de negativos: ${qtd}`)
}

let vet = [-5, -4, -3, -2, -1, 0, 1, 2, 3]
percorre2(vet)

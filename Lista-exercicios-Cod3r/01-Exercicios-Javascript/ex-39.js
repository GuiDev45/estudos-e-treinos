/*
39) Crie uma função que receba dois vetores de igual tamanho e troque seus elementos de modo que o
primeiro elemento do vetorA passe a ser o primeiro elemento do vetorB e vice versa e assim sucessivamente.
Faça a troca sem utilizar uma variável auxiliar.
*/

let vetA = [1, 2, 3, 4, 5]
let vetB = [10, 20, 30, 40, 50]

function trocarVet(vetorA, vetorB) {
    [vetorA, vetorB] = [vetorB, vetorA]

    console.log(vetorA)
    console.log(vetorB)
}

trocarVet(vetA, vetB)
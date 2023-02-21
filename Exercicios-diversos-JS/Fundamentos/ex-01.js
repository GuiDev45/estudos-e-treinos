/*
Cálculo de média de notas: Escreva um programa que calcule a média de uma lista de notas. 
Armazene as notas em uma variável e utilize loops e operações matemáticas para calcular a média. 
Em seguida, exiba o resultado na tela.
*/

const notas = [4.3, 5.8, 3.3, 1.2, 7.0]

function media(notas) {
    let soma = 0
    let media = 0
    for (let i = 0; i < notas.length; i++) {
        soma += notas[i]
    }
    media = soma / notas.length
    console.log(`Média: ${media.toFixed(1)}`)
}

media(notas)

//Outra forma
const media2 = (notas) => {
    let soma = 0
    let media = 0
    for (const nota of notas) {
        soma += nota
    }
    media = soma / notas.length
    console.log(`Média: ${media.toFixed(1)}`)
}

media2(notas)

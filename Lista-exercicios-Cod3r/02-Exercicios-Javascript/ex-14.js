/*
Desenvolva uma função que recebe como parâmetro um objeto e retorne um array de arrays, em que cada
elemento é um array formado pelos pares chave/valor que corresponde a um atributo do objeto. Observe os
exemplos abaixo para um melhor entendimento:

Exemplos:
objetoParaArray({
    nome: "Maria",
    profissao: "Desenvolvedora de software"
}) // irá retornar [["nome", "Maria"], ["profissao", "Desenvolvedora de software"]]

objetoParaArray({
    codigo: 11111,
    preco: 12000
}) // irá retornar [["codigo", 11111], ["preco", 12000]]
*/

function objetoParaArray(obj) {
    const novoArr = Object.entries(obj)
    return novoArr
}

const obj1 = {
    nome: "Maria",
    profissao: "Desenvolvedora de software"
}

const obj2 = {
    codigo: 11111,
    preco: 12000
}

console.log(objetoParaArray(obj1)) // [ [ 'nome', 'Maria' ], [ 'profissao', 'Desenvolvedora de software' ] ]
console.log(objetoParaArray(obj2)) // [ [ 'codigo', 11111 ], [ 'preco', 12000 ] ]

//Outra forma, sem usar a função
const arr1 = Object.entries(obj1)
const arr2 = Object.entries(obj2)

console.log(arr1) // [ [ 'nome', 'Maria' ], [ 'profissao', 'Desenvolvedora de software' ] ]
console.log(arr2) // [ [ 'codigo', 11111 ], [ 'preco', 12000 ] ]

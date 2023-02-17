/*
Escreva uma função que identifique os contribuintes que são isentos de imposto devido a partir de um array de arrays, 
onde cada array interno representa os dados de renda e imposto de um contribuinte em um determinado ano.
A função deve retornar um array com os nomes dos contribuintes que são isentos de imposto.
*/

const dados = [  
  ["João", [2019, 0], [2020, 0], [2021, 0]],
  ["Maria", [2019, 1000], [2020, 0], [2021, 0]],
  ["José", [2019, 0], [2020, 0], [2021, 500]],
  ["Pedro", [2019, 500], [2020, 1000], [2021, 1500]]
]

function contribuintesIsentos(dados) {
    return dados.filter(contribuinte =>
        contribuinte.slice(1).every(ano => ano[1] === 0)
    ).map(contribuinte => contribuinte[0])
}

const isentos = contribuintesIsentos(dados)

console.log(isentos)
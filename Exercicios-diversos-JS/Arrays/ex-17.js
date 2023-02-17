/*
Escreva uma função que calcule a média anual de imposto devido por cada contribuinte a partir de um array de arrays, 
onde cada array interno representa os dados de renda e imposto de um contribuinte em um determinado ano.
A função deve retornar um array com a média anual de imposto devido para cada contribuinte.
*/

const contribuintes = [
    [[10000, 0], [12000, 1200], [15000, 2250]],
    [[30000, 3000], [32000, 3200], [35000, 5250]],
    [[100000, 18000], [110000, 22000], [120000, 24000]]
]

function mediaAnualImposto(dados) {
    function calcularMedia(array) {
        const somaImposto = array.reduce((soma, valorAtual) => soma + valorAtual[1], 0)
        return somaImposto / array.length
    }

    const medias = dados.map(calcularMedia)
    return medias
}

console.log(mediaAnualImposto(contribuintes))

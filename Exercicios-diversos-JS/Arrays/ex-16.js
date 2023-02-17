/*
Escreva uma função que calcule o imposto devido por cada contribuinte a partir de um array de rendas. 
O imposto devido é calculado com base na seguinte tabela:

Renda Alíquota
0 - 10.000 0%
10.000 - 30.000 10%
30.000 - 100.000 15%
100.000 + 20%

A função deve retornar um array com o valor do imposto devido para cada contribuinte.
*/

const rendas = [
    { contribuinte: 'Pessoa 1', renda: 10000.00 },
    { contribuinte: 'Pessoa 2', renda: 30000.00 },
    { contribuinte: 'Pessoa 3', renda: 100000.00 },
    { contribuinte: 'Pessoa 4', renda: 110000.00 }
]

function calcular(renda) {
    let resultado = []
    let imposto = 0
    for (let valor of renda) {
        if (valor.renda > 0 && valor.renda <= 10000.00) {
            imposto = valor.renda * 0.00
            resultado.push(imposto)
        }
        if (valor.renda > 10000.00 && valor.renda <= 30000.00) {
            imposto = valor.renda * 0.10
            resultado.push(imposto)
        }
        if (valor.renda > 30000.00 && valor.renda <= 100000.00) {
            imposto = valor.renda * 0.15
            resultado.push(imposto)
        }
        if (valor.renda > 100000.00) {
            imposto = valor.renda * 0.20
            resultado.push(imposto)
        }
    }
    return resultado
}

console.log(calcular(rendas))

//Outra forma
function calcular2(renda) {
    let resultado = []
    for (let valor of renda) {
        let aliquota = valor.renda <= 10000.00 ? 0.00 :
                       valor.renda <= 30000.00 ? 0.10 :
                       valor.renda <= 100000.00 ? 0.15 : 0.20
        let imposto = valor.renda * aliquota
        resultado.push(imposto)
    }
    return resultado
}

console.log(calcular2(rendas))

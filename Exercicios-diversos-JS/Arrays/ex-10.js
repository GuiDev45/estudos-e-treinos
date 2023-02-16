/*
Dado um array de gastos mensais, escreva uma função que retorne o total de despesas para o ano.
*/

const gastosMensais = [157.80, 285.39, 160.90, 430.00, 786.68]

function calcularGastos(gastos) {
    const soma = gastos.reduce(function (accumulator, currentValue) {
        return accumulator + currentValue
    })
    const total = soma * 12
    console.log(`total de despesas para o ano é de: R$ ${total.toFixed(2).replace('.', ',')}`)
}

calcularGastos(gastosMensais)

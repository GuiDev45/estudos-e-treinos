/*
Dado um array de despesas anuais, 
escreva uma função que retorne o montante total gasto em cada categoria 
(por exemplo, alimentação, transporte, habitação, etc.).
*/

const despesasAnuais = [
    { categoria: 'alimentação', valor: 120.00 },
    { categoria: 'transporte', valor: 240.00 },
    { categoria: 'habitação', valor: 360.00 },
    { categoria: 'outros', valor: 480.00 }
]

function calculoDespesas(despesas) {
    let total = 0
    for (let despesa of despesas) {
        total += despesa.valor
    }
    console.log(`Montante total gasto é de: R$ ${total.toFixed(2).replace('.', ',')}`)
}

calculoDespesas(despesasAnuais)

/*
Dado um array de despesas diárias, 
escreva uma função que retorne o montante total gasto em uma semana (7 dias). 
Além disso, inclua uma verificação para garantir que todas as despesas são números positivos e que o array tem pelo menos 7 itens.
*/

const despesasDiarias = [
    { dia: 'Segunda', gasto: 80.00 },
    { dia: 'Terça', gasto: 90.00 },
    { dia: 'Quarta', gasto: 100.00 },
    { dia: 'Quinta', gasto: 110.00 },
    { dia: 'Sexta', gasto: 120.00 },
    { dia: 'Sábado', gasto: 130.00 },
    { dia: 'Domingo', gasto: -140.00 }
]

function calculoDespesas(despesas) {
    let total = 0
    if (despesas.length >= 7) {
        for (let despesa of despesas) {
            //verificação
            if (despesa.gasto >= 0) {
                total += despesa.gasto
            }
        }
        console.log(`total gasto em uma semana (7 dias): R$ ${total.toFixed(2).replace('.', ',')}`)
    }
    else {
        console.log('A lista tem menos de 7 itens')
    }
}

calculoDespesas(despesasDiarias)

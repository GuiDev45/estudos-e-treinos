/*
Dado um array com informações de vendas de vários departamentos, 
escreva uma função que determine o departamento com o maior faturamento. 
Cada item no array deve ter o nome do departamento e o valor total de vendas.
*/

const vendas = [
    { nome: 'Marketing', vendaTotal: 15000.00 },
    { nome: 'Comercial', vendaTotal: 25000.00 },
    { nome: 'Veículos', vendaTotal: 35000.00 },
    { nome: 'Habilitação', vendaTotal: 45000.00 },
    { nome: 'Infrações', vendaTotal: 55000.00 }
]

function totalVendas(vendas) {
    let resultado = 0
    for (let venda of vendas) {
        resultado += venda.vendaTotal
    }
    console.log(`o valor total de vendas é de: R$ ${resultado.toFixed(2).replace('.', ',')}`)
}

totalVendas(vendas)

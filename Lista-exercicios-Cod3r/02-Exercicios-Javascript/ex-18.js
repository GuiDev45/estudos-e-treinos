/*
Você está trabalhando numa aplicação pessoal de controle de despesas. Na tela principal dessa aplicação, é
possível adicionar produtos ou serviços, informando nome, categoria e preço. Uma funcionalidade que você
está desenvolvendo no momento é a de somar o total das despesas.
Crie uma função que receba um array de produtos e retorne o total das despesas.

Exemplos:
despesasTotais([
    {nome: "Jornal online", categoria: "Informação", preco: 89.99},
    {nome: "Cinema", categoria: "Entretenimento", preco: 150}
]) // retornará 239.99

despesasTotais([
    {nome: "Galaxy S20", categoria: "Eletrônicos", preco: 3599.99},
    {nome: "Macbook Pro", categoria: "Eletrônicos", preco: 30999.90}
]) // retornará 34599.89
*/
const despesas1 = ([
    { nome: "Jornal online", categoria: "Informação", preco: 89.99 },
    { nome: "Cinema", categoria: "Entretenimento", preco: 150 }
])

const despesas2 = ([
    { nome: "Galaxy S20", categoria: "Eletrônicos", preco: 3599.99 },
    { nome: "Macbook Pro", categoria: "Eletrônicos", preco: 30999.90 }
])

function despesasTotais(despesas) {
    let total = 0
    for (let valor of despesas) {
        total += valor.preco
    }
    return console.log(total)
}

despesasTotais(despesas1)
despesasTotais(despesas2)

//Outra forma, usando o .map e .reduce
function despesasTotais2(despesas) {
    return despesas.map(valor => valor.preco).reduce((acumulador, valorAtual) => acumulador + valorAtual)
}

console.log(despesasTotais2(despesas1))
console.log(despesasTotais2(despesas2))

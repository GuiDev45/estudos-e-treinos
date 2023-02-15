/*
Crie um array com as informações de 10 compras (nome do produto, valor, categoria) 
e calcule o valor total de impostos para cada categoria de produto.
*/

const taxas = {
    celulares: 0.1,
    cozinha: 0.15,
    moveis: 0.2,
    eletronicos: 0.25,
    tvs: 0.3,
    perfumes: 0.35,
    panelas: 0.4,
    roupas: 0.45,
    poltronas: 0.5,
    lustres: 0.55
}

const compras = [
    { nome: 'iPhone 13', valor: 4769.10, categoria: 'celulares' },
    { nome: 'Micro-ondas Electrolux', valor: 791.10, categoria: 'cozinha' },
    { nome: 'Guarda-Roupa', valor: 940.50, categoria: 'moveis' },
    { nome: 'Ar-Condicionado', valor: 1801.39, categoria: 'eletronicos' },
    { nome: 'TV LED 32" Samsung HDR ', valor: 2359.10, categoria: 'tvs' },
    { nome: 'Dior Sauvage Eau ', valor: 1188.26, categoria: 'perfumes' },
    { nome: 'Panelas Brinox', valor: 624.90, categoria: 'panelas' },
    { nome: 'Camisa masculina', valor: 91.61, categoria: 'roupas' },
    { nome: 'Poltrona Decorativa Opala', valor: 609.10, categoria: 'poltronas' },
    { nome: 'Lustre Pendente Meia Lua', valor: 45.48, categoria: 'lustres' }
]

function totalImposto(compras) {
    let impostoTotal = 0
    let cadaItem = 0
    for (let item of compras) {
        cadaItem = item.valor * taxas[item.categoria]
        console.log(`Valor do(a) ${item.nome} + impostos é de R$: ${cadaItem.toFixed(2).replace('.', ',')}`) 

        impostoTotal += item.valor * taxas[item.categoria]
    }
    console.log(`O valor total de impostos é de R$: ${impostoTotal.toFixed(2).replace('.', ',')}`)
}

totalImposto(compras)

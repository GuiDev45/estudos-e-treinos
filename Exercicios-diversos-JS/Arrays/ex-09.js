/*
Crie um array com as informações de 5 empresas (nome, valor de vendas, categoria) 
e calcule o valor total de impostos devidos por cada empresa, 
considerando as taxas de imposto para cada categoria.
*/

const empresas = [
    { nome: 'Zaibatsu', valorDeVendas: 8305012.39, categoria: 'seguranca' },
    { nome: 'Umbrella', valorDeVendas: 5015892.18, categoria: 'farmaceutica' },
    { nome: 'Microsoft', valorDeVendas: 18302032.29, categoria: 'tecnologia' },
    { nome: 'Decorplan', valorDeVendas: 3325110.12, categoria: 'moveis' },
    { nome: 'Samsung', valorDeVendas: 10350512.39, categoria: 'celular' }
]

const taxas = {
    seguranca: 1.10,
    farmaceutica: 1.15,
    tecnologia: 1.20,
    moveis: 1.25,
    celular: 1.30
}

function calculoImpostos(empresas) {
    let totalImposto = 0
    for (let item of empresas) {
        totalImposto += item.valorDeVendas * taxas[item.categoria]
    }
    console.log(`O valor total de impostos devidos por cada empresa é de R$: ${totalImposto.toFixed(2).replace('.', ',')}`)
}

calculoImpostos(empresas)

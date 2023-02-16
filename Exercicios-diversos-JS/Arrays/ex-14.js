/*
Dado um array de informações de impostos pagos por várias empresas, 
escreva uma função que calcule a média de impostos pagos por empresa. 
Além disso, inclua uma verificação para garantir que todas as informações de impostos são números positivos.
*/

const impostosEmpresas = [
    { nome: 'Empresa 01', valor: 15000.00 },
    { nome: 'Empresa 02', valor: 30000.00 },
    { nome: 'Empresa 03', valor: 45000.00 },
    { nome: 'Empresa 04', valor: 60000.00 },
    { nome: 'Empresa 05', valor: 75000.00 },
    { nome: 'Empresa 05', valor: -5000.00 },
    { nome: 'Empresa 06', valor: -8000.00 }
]

function calculoImposto(imposto) {
    let soma = 0
    let resultado = 0
    let cont = 0
    for (let empresa of imposto) {
        //verificação
        if (empresa.valor >= 0) {
            soma += empresa.valor
            cont ++
        }
        else {
            console.log(`O valor da empresa, ${empresa.nome} está negativo, apenas as empresas com valores positivos vão ser calculadas`)
        }
    }
    resultado = soma / cont
    console.log(`A média de impostos pagos pelas empresas é de: R$ ${resultado.toFixed(2).replace('.', ',')}`)
}

calculoImposto(impostosEmpresas)

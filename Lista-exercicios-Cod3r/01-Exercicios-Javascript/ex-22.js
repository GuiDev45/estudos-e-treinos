/*
22) Criar uma função para calcular o valor a ser pago de anuidade de uma associação. A função recebe como
parâmetro um inteiro que representa o mês (1 - janeiro, 2 - fevereiro…) que foi paga e o valor da anuidade. A
anuidade deve ser paga no mês de janeiro. Por mês, é cobrado 5% de juros (sob o regime de juros
compostos). O retorno deve ser o valor a ser pago para o respectivo mês escolhido
*/

const anuidade = (num) => {
    let valor
    switch (num) {
        case 1:
            valor = 500.0
            console.log(`Janeiro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 2:
            valor = 500.0 + (500.0 * 0.05)
            console.log(`Fevereiro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 3:
            valor = 500.0 + (500.0 * 0.10)
            console.log(`Março: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 4:
            valor = 500.0 + (500.0 * 0.15)
            console.log(`Abril: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 5:
            valor = 500.0 + (500.0 * 0.20)
            console.log(`Maio: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 6:
            valor = 500.0 + (500.0 * 0.25)
            console.log(`Junho: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 7:
            valor = 500.0 + (500.0 * 0.30)
            console.log(`Julho: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 8:
            valor = 500.0 + (500.0 * 0.35)
            console.log(`Agosto: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 9:
            valor = 500.0 + (500.0 * 0.40)
            console.log(`Setembro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 10:
            valor = 500.0 + (500.0 * 0.45)
            console.log(`Outubro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 11:
            valor = 500.0 + (500.0 * 0.50)
            console.log(`Novembro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        case 12:
            valor = 500.0 + (500.0 * 0.55)
            console.log(`Dezembro: R$${valor.toFixed(2).replace(".", ",")}`)
            break
        default:
            console.log('Mês inválido')
    }
}

anuidade(1)
anuidade(2)
anuidade(3)
anuidade(4)
anuidade(5)
anuidade(6)
anuidade(7)
anuidade(8)
anuidade(9)
anuidade(10)
anuidade(11)
anuidade(12)
anuidade(15)

/*
21) Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado
considerando que todos pagam R$ 100 mais um adicional conforme a seguinte tabela: 1) crianças com menos
de 10 anos pagam R$80; 2) conveniados com idade entre 10 e 30 anos pagam R$50; 3) conveniados com
idade acima de 30 e até 60 anos pagam R$ 95; e 4) conveniados acima de 60 anos pagam R$130
*/

const convenio = function (anos) {
    let total = 100

    if (anos < 10) {
        console.log(total += 80)      
    }
    else if (anos >= 10 && anos <= 30) {
        console.log(total += 50)
    }
    else if (anos > 30 && anos <= 60) {
        console.log(total += 95)    
    }
    else if (anos > 60) {
        console.log(total += 130)
    }
}

convenio(9)
convenio(30)
convenio(60)
convenio(61)
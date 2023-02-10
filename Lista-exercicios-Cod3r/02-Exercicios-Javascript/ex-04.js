/*
Crie uma função que recebe um número (de 1 a 12) e retorne o mês correspondente como uma string.
Por exemplo, se a entrada for 2, a função deverá retornar "Fevereiro", pois este é o 2 mês.

Exemplo:
nomeDoMes(1) // retornará "janeiro"
nomeDoMes(4) // retornará "abril"
*/

function nomeDoMes(mes) {
    switch (mes) {
        case 1:
            console.log('janeiro')
            break
        case 2:
            console.log('fevereiro')
            break
        case 3:
            console.log('março')
            break
        case 4:
            console.log('abril')
            break
        case 5:
            console.log('maio')
            break
        case 6:
            console.log('junho')
            break
        case 7:
            console.log('julho')
            break
        case 8:
            console.log('agosto')
            break
        case 9:
            console.log('setembro')
            break
        case 10:
            console.log('outubro')
            break
        case 11:
            console.log('novembro')
            break
        case 12:
            console.log('dezembro')
            break
        default:
            console.log('Valor inválido')

    }
}

nomeDoMes(1)
nomeDoMes(4)

//Outra forma
function nomeDoMes2(mes) {
    const meses = ["janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro",]

    //A condicional if também está correta.
    /*
    if (mes >= 1 && mes <= 12) {
        console.log(meses[mes - 1])
    } else {
        console.log("Valor inválido")
    }
    */

    //Usando condicional ternária, faz a mesma decisão que o if porém de forma mais resumida.
    /*
    Uma explicação do porque meses[mes - 1], arrays começam na posição 0 ou seja:
    se a entrada de dados for 1 para a saída de dados ser janeiro, vai ser necessário diminuir 1 no valor,
    pois janeiro está no índice 0, entrada 1 menos 1 = 0 que é = "janeiro"
    */
    return mes >= 1 && mes <= 12 ? console.log(meses[mes - 1]) : console.log("Valor inválido")
}

nomeDoMes2(1)
nomeDoMes2(4)

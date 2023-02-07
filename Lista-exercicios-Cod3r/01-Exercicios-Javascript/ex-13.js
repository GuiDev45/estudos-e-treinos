/*
13) Crie um programa que exibe se um dia é dia útil, fim de semana ou dia inválido dado o número referente ao
dia. Considere que domingo é o dia 1 e sábado é o dia 7. Utilize a estrutura Switch.
*/

const diaUtil = function (dia) {
    switch (dia) {
        case 1:
            console.log('fim de semana')
            break
        case 2:
            console.log('dia útil')
            break
        case 3:
            console.log('dia útil')
            break
        case 4:
            console.log('dia útil')
            break
        case 5:
            console.log('dia útil')
            break
        case 6:
            console.log('dia útil')
            break
        case 7:
            console.log('fim de semana')
            break
        default:
            console.log('dia inválido')
    }
}

diaUtil(1)
diaUtil(2)
diaUtil(5)
diaUtil(7)
diaUtil(10)

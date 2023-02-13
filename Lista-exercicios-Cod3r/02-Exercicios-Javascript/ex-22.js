/*
Desenvolva uma função que receba como parâmetros um número de 1 a 10. 
Interamente, na função, será gerado um número aleatório de 1 a 10.
A função deverá retornar se o parâmetro de entrada foi igual ao número sorteado interamente.
Se o valor fornecido foi o sorteado, retorne "Parabéns! O número sorteado foi o X".
Se não for igual, retorne "Que pena! O número sorteado foi o X".
X é o número que foi sorteado.

Exemplos:
funcaoDaSorte(10) // retornará "Parabéns! O número sorteado foi o 10"
funcaoDaSorte(5) // retornará "Que pena! O número sorteado foi o 3"
funcaoDaSorte(5) // retornará "Que pena! O número sorteado foi o 1"
*/

function funcaoDaSorte(num) {
    const min = 1
    const max = 10

    let aleatorio = Math.floor(Math.random() * (max - min + 1) + min)
    
    if (num === aleatorio) {
        console.log(`Parabéns! O número sorteado foi o ${aleatorio}`)
    }
    else {
        console.log(`Que pena! O número sorteado foi o ${aleatorio}`)
    }
}

funcaoDaSorte(10)
funcaoDaSorte(5)
funcaoDaSorte(5)

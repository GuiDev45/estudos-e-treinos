/*
Escreva uma função que recebe a idade de uma pessoa em anos e retorne a mesma idade em dias
Obs: considere que em um ano tem 365 dias. Desconsidere anos bissextos (com 366 dias),
e desconsidere também dias decorridos desde o último aniversário.

Exemplos:
converterIdadeEmAnosParaDias(25) // retornará 9125
converterIdadeEmAnosParaDias(70) // retornará 25550
*/

function converterIdadeEmAnosParaDias(idade) {
    console.log(idade * 365)
}

converterIdadeEmAnosParaDias(25)
converterIdadeEmAnosParaDias(70)

//Outra forma
const converter = (idade) => console.log(idade * 365)

converter(25)
converter(70)
/*
Crie uma função que retorna a string "Olá, " concatenada com um argumento text (a ser passado para a função)
e com ponto de exclamação "!" no final.

Exemplos:
cumprimentar("Leonardo") // retornará "Olá, Leonardo!"
cumprimentar("Maria") // retornará "Olá, Maria!"
*/

function ola(nome) {
    console.log(`Olá, ${nome}!`)
}

ola('Leonardo')
ola('Maria')

//Outra forma
const ola2 = (nome) => `Olá, ${nome}!`

console.log(ola2('Leonardo'))
console.log(ola2('Maria'))

//Outra forma
const ola3 = (nome) => console.log(`Olá, ${nome}!`)

ola3('Leonardo')
ola3('Maria')
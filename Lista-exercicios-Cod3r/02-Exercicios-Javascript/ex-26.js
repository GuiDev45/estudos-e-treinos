/*
Desenvolva uma função que receba uma string como parâmetro e retorne essa string somente com as
consoantes, ou seja, sem as vogais

Exemplos:
removerVogais("Cod3r") // retornará "Cd3r"
removerVogais("Fundamentos") // retornará "Fndmnts"
*/

function removerVogais (param) {
    return console.log(param.replace(/[aeiouAEIOU]/g, '')) //A flag g indica que todas as ocorrências devem ser substituídas, e não apenas a primeira.
}

removerVogais("Cod3r")
removerVogais("Fundamentos")

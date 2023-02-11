/*
Escreva uma função que recebe um valor booleano ou numérico. Se o parâmetro fornecido for booleano, o
retorno da função deverá ser o inverso. Por exemplo, se a entrada for false, retornará true. Se o parâmetro for
numérico, o retorno será o número inverso. Por exemplo, se for fornecido 1, o retorno será -1. Se o parâmetro
de entrada não for de nenhum dos tipos acima, retorne "booleano ou número esperados, mas o parâmetro é do tipo..."

Exemplos:
inverso(true) // retornará false
inverso("6") // retornará "booleano ou número esperados, mas o parâmetro é do tipo string"
inverso(-2000) // retornará 2000
inverso("programação") // retornará "booleano ou número esperados, mas o parâmetro é do tipo string"
*/

function inverso(valor) {
    if (typeof valor === "boolean") {
        return !valor //O operador "!, negação" inverte o valor, ou seja se for true, vira false
    } 
    else if (typeof valor === "number") {
        return -valor
    } 
    else {
        return "booleano ou número esperados, mas o parâmetro é do tipo string"
    }
}

console.log(inverso(true))
console.log(inverso("6"))
console.log(inverso(-2000))
console.log(inverso("programação"))

//--------------------------------------------------------------------------------------------------

function inverso2(valor) {
    //(condição) ? valor se verdadeiro : valor se falso
    //Lembrando que o operador "!, negação" inverte o valor, ou seja se for true, vira false
    return (typeof valor === "boolean") ? !valor : (typeof valor === "number") 
    ? -valor : "booleano ou número esperados, mas o parâmetro é do tipo string"
}

console.log(inverso2(true))
console.log(inverso2("6"))
console.log(inverso2(-2000))
console.log(inverso2("programação"))

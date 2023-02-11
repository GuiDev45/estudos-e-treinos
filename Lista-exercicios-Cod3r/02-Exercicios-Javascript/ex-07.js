/*
Crie uma função que receba quatro números como parâmetro (numero, minimo, maximo, inclusivo) e
retorne se o parâmetro numero (o primeiro) está entre minimo e maximo. Quando o parâmetro
inclusivo for true, tenha "entre" como inclusivo, ou seja, considerando se numero é igual a minimo
ou a maximo. Caso o parâmetro inclusivo não seja informado, seu valor padrão deverá ser false,
portanto, a lógica será exclusiva, não considerando se numero é igual a minimo ou a maximo.

Exemplos:
estaEntre(60, 50, 100) // retornará true
estaEntre(16, 100, 160) // retornará false
estaEntre(3, 3, 150) // retornará false
estaEntre(3, 3, 150, true) // retornará true
*/

function estaEntre(numero, minimo, maximo, inclusivo = false) {
    if (inclusivo) {
        return numero >= minimo && numero <= maximo
    } 
    else {
        return numero > minimo && numero < maximo
    }
}

console.log(estaEntre(60, 50, 100))
console.log(estaEntre(16, 100, 160))
console.log(estaEntre(3, 3, 150))
console.log(estaEntre(3, 3, 150, true))

//Outra forma

//(condição) ? valor se verdadeiro : valor se falso
function estaEntre2(numero, minimo, maximo, inclusivo = false) {
    return inclusivo ? numero >= minimo && numero <= maximo : numero > minimo && numero < maximo
}

console.log(estaEntre2(60, 50, 100))
console.log(estaEntre2(16, 100, 160))
console.log(estaEntre2(3, 3, 150))
console.log(estaEntre2(3, 3, 150, true))

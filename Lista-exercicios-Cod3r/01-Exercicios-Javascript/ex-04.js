/*
04) Crie uma função que irá receber dois valores, o dividendo e o divisor. A função deverá imprimir o resultado
e o resto da divisão destes dois valores.
*/

//Functions declaration (Função de declaração)
function valores(dividendo, divisor) {
    const resultado = dividendo / divisor
    const resto = dividendo % divisor
    return console.log(`Resultado da divisão = ${Math.round(resultado)} 
Resto = ${resto}`)
}
// Math.round() retorna o valor de um número arredondado para o inteiro mais próximo.

valores(10, 2)
valores(17, 3)

function valores2(dividendo, divisor) {
    const resultado = dividendo / divisor
    const resto = dividendo % divisor
    return console.log(`Resultado da divisão = ${resultado.toFixed(2)} 
Resto = ${resto}`)
}
// .toFixed() Controlar o número de casas decimais após a vírgula

valores2(10, 2)
valores2(17, 3)

//Functions expression (Função de expressão)
const resultado = function(dividendo, divisor)  {
    const resultado = dividendo / divisor
    const resto = dividendo % divisor
    return console.log(`Resultado da divisão = ${resultado.toFixed(2)} 
Resto = ${resto}`)
}

resultado(25, 5)
resultado(29, 4)

//Arrow Functions (Função de flecha)
const resultado2 = (dividendo, divisor) => {
    const resultado = dividendo / divisor
    const resto = dividendo % divisor
console.log(`Resultado da divisão = ${resultado.toFixed(2)} 
Resto = ${resto}`)
}

resultado2(245, 5)
resultado2(229, 4)

const resultado3 = (dividendo, divisor) => console.log(`Resultado da divisão arrow = ${dividendo / divisor}
Resto arrow = ${dividendo % divisor}`)

resultado3(15, 3)

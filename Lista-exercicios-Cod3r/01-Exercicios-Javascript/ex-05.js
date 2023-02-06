/*
05) Lidar com números em JavaScript pode dar muita dor de cabeça. Você já viu o que acontece quando faz o
seguinte comando no console: console.log(0.1 + 0.2); O resultado será: 0.30000000000000004. Outra coisa
importante de observar, é o fato que o ponto é utilizado no lugar da vírgula e vice versa. Com isso, vamos fazer
um exercício simples para mostrar dinheiro sempre da forma correta. Desenvolva uma função JavaScript para
que ela receba um valor como 0.30000000000000004 e retorne R$0,30 (observe a vírgula e o ponto).
*/

const valor = 0.30000000000000004
console.log(valor)

//Functions declaration (Função de declaração)
function corrigido(val) {
    console.log(`Valor correto: R$${val.toFixed(2).replace(".", ",")}`)
}

corrigido(valor) //Saída: Valor correto: R$0,30

//Ou seja, toFixed() para a quantidade de casas decimais, e replace para trocar "./ponto" por ",/virgula"

//Functions expression (Função de expressão)
const corrigido2 = function(val) {
    console.log(`Valor correto: R$${val.toFixed(2).replace(".", ",")}`)
}

corrigido2(valor) //Saída: Valor correto: R$0,30

//Arrow Functions (Função de flecha)
const corrigido3 = (val) => console.log(`Valor correto: R$${val.toFixed(2).replace(".", ",")}`)

corrigido3(valor)

const corrigido4 = () => {
    val = valor
    console.log(`Valor correto: R$${val.toFixed(2).replace(".", ",")}`)
}

corrigido4() //Saída: Valor correto: R$0,30

const corrigido5 = (val = valor) => console.log(`Valor correto: R$${val.toFixed(2).replace(".", ",")}`)

corrigido5() //Saída: Valor correto: R$0,30

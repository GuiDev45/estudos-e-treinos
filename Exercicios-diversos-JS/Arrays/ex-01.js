/*
Armazenamento de compras em supermercado: 
Crie um array para armazenar os itens que uma pessoa comprou em um supermercado. 
Depois, faça um loop para imprimir todos os itens na tela.
*/

const compras = ["Leite", "Macarrão", "Tomate", "Azeite", "Queijo"]

for (let i = 0; i < compras.length; i++) {
    console.log(compras[i])
}

console.log("---------------------------------------------")

//Outra forma, forEach
compras.forEach(function(elemento) {
    console.log(elemento)
})

console.log("---------------------------------------------")

//Outra forma, for of
for (const item of compras) {
    console.log(item)
}

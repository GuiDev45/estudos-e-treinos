/*
Cálculo de aniversário: Escreva um programa que calcule quantos dias faltam para o seu aniversário. 
Armazene a data atual e a data do seu aniversário em variáveis e utilize operações matemáticas para calcular a diferença entre as duas datas. 
Em seguida, exiba o resultado na tela.
*/

//Armazena a data atual e a data do aniversário
const hoje = new Date()
const aniversario = new Date('2023-06-15') // Substitua pela data do seu aniversário

//Calcula a diferença entre as datas em milissegundos
let diferenca = aniversario.getTime() - hoje.getTime()

//Converte a diferença em dias
const umDia = 1000 * 60 * 60 * 24 //Quantidade de milissegundos em um dia
diferenca = Math.ceil(diferenca / umDia) //Arredonda para cima para considerar o dia do aniversário

//Exibe o resultado na tela
console.log(`Faltam ${diferenca} dias para o seu aniversário!`)

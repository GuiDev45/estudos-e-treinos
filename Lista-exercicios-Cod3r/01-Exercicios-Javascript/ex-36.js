/*
36) Crie duas funções que recebem dois parâmetros, um vetor com apenas valores numéricos e um número
inteiro. Faça com que a primeira função retorne outro vetor que será resultado da multiplicação de cada
elemento pelo número passado como parâmetro. A segunda função fará o mesmo da primeira se e somente se
o valor do elemento for maior que 5.
*/

//O método map() invoca a função callback passada por argumento para cada elemento do Array e devolve um novo Array como resultado.
//var numbers = [1, 4, 9];
//var doubles = numbers.map(function(num) {
//  return num * 2;
//});
// doubles é agora [2, 8, 18]. numbers ainda é [1, 4, 9]

function primeiraFunc(num1, num2) {
    return num1.map(i => i * num2);
}

function segundaFunc(num1, num2) {
    return num1.filter(i => i > 5).map(i => i * num2);
}

let vet = [1, 2, 3, 4, 5]

console.log(primeiraFunc(vet, 3))
console.log(primeiraFunc(vet, 11))

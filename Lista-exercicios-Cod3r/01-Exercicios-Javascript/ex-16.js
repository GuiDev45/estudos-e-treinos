/*
16) Utilizando a estrutura do Switch faça um programa que simule uma calculadora básica.
O programa recebe como parâmetros dois valores numéricos e uma string referente à operação e a realize com os valores
numéricos na ordem que foram inseridos. Por exemplo: calculadora (2, ‘+’, 3). A função efetuará a soma de 2 e
3. Dica: Os sinais das operações são: ‘+’. ‘-’, ‘*’ e ‘/’. Crie um caso default para operações inválidas.
*/

const calculadora = function (num1, operacao, num2) {
    switch (operacao) {
        case '+':
            console.log(num1 + num2)
            break
        case '-':
            console.log(num1 - num2)
            break
        case '*':
            console.log(num1 * num2)
            break
        case '/':
            console.log(num1 / num2)
            break
        default:
            console.log('operações inválidas')
    }
}

calculadora(5, '+', 5)
calculadora(5, '-', 3)
calculadora(2, '*', 5)
calculadora(10, '/', 2)
calculadora(2, '*+', 2)
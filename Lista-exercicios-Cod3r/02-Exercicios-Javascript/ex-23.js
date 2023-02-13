/*
Criar uma função que recebe uma string como parâmetros e conte quantas palavras tem nela.

Exemplos:
contarPalavras("Sou uma frase") // retornará 3
contarPalavras("Me divirto aprendendo a programar") // retornará 5
*/

function contarPalavras(frase) {
    const palavras = frase.split(" ")
    return console.log(palavras.length)
}

contarPalavras("Sou uma frase")
contarPalavras("Me divirto aprendendo a programar")

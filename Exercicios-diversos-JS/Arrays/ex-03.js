/*
Organização de filmes assistidos: 
Crie um array para armazenar os nomes de filmes que uma pessoa já assistiu. 
Depois, faça um loop para imprimir todos os filmes na tela, em ordem alfabética. 
Adicione também a opção de adicionar novos filmes ao array.
*/

const filmes = ["Alien", "O Menu", "Alita", "Predador", "Jung_E"]

function listaFilmes(lista) {
    lista.sort() 
    for (const filme of lista) {
        console.log(filme)
    }
}

listaFilmes(filmes)

/*
29) Utilizando a estrutura de repetição for, faça uma função que percorra um vetor e conte quantos números
deste vetor estão no intervalo [10,20] (repare que o intervalo é fechado, ou seja, inclui o 10 e o 20) e quantos
deles estão fora do intervalo, escrevendo estas informações
*/
function percorrer(vetor) {
    let qtdDentro = 0
    let qtdFora = 0 

    for (let i = 0; i < vetor.length; i++) {
        if (vetor[i] >= 10 && vetor[i] <= 20) {
            qtdDentro ++
            console.log(`Dentro do intervalo ${vetor[i]}`)
        }
        else {
            qtdFora ++
            console.log(`Fora do intervalo ${vetor[i]}`)
        }
    }

    console.log(`Quantidade total dentro do intervalo: ${qtdDentro}`)
    console.log(`Quantidade total fora do intervalo: ${qtdFora}`)
}

let vet = [8, 9, 10, 11, 12, 13, 14, 15, 20, 21, 25]
percorrer(vet)
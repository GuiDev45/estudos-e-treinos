/*
Dado um array de receitas mensais, 
escreva uma função que retorne o total de receitas para o ano. 
Além disso, inclua uma verificação para garantir que todas as receitas são números positivos.
*/

const receitas = [100.00, 200.00, 300.00, 400.00, 500.00, -50.00]

function totalDeReceitas(receitas) {
    let positivos = 0
    //verificação
    for (let receita of receitas) {
        if (receita > 0) {
            positivos += receita
        }
    }
    console.log(`total de receitas para o ano é de: R$ ${positivos.toFixed(2).replace('.', ',')}`)
}

totalDeReceitas(receitas)

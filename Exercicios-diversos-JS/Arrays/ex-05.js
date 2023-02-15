/*
Crie um array com os nomes de 5 frutas e verifique se a fruta "maçã" existe nesse array, 
caso exista imprima na tela "A fruta maçã existe no array".
*/

const frutas = ['Abacate', 'Amora', 'Maçã', 'Kiwi']

frutas.forEach(fruta => {
    if (fruta === 'Maçã' || fruta === 'maçã') {
        console.log('A fruta maçã existe no array')
    }
})

//Outra forma
frutas.forEach(fruta => {
    fruta === 'Maçã' || fruta === 'maçã' ? console.log('A fruta maçã existe no array') : false
})

/*
06) Elabore duas funções que recebem três parâmetros: capital inicial, taxa de juros e tempo de aplicação. A
primeira função retornará o montante da aplicação financeira sob o regime de juros simples e a segunda
retornará o valor da aplicação sob o regime de juros compostos.
*/

function jurosSimples (capitalInicial, taxa, tempo) {
    const resultado = capitalInicial + (capitalInicial * taxa * tempo)
    return console.log(`R$${resultado.toFixed(2).replace(".", ",")}`)
}

function jurosCompostos (capitalInicial, taxa, tempo) {
    const resultado = capitalInicial * (1 + taxa) ** tempo // ** Atribuição exponencial
    return console.log(`R$${resultado.toFixed(2).replace(".", ",")}`)
}

jurosSimples(100, 10/100, 2)
jurosCompostos(100, 10/100, 2)

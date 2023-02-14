/*
Controle de tarefas diárias: 
Crie um array para armazenar as tarefas que uma pessoa precisa realizar ao longo do dia. 
Depois, faça um loop para imprimir cada tarefa na tela, 
junto com sua descrição e se ela foi concluída ou não.
*/

const tarefas = [
    { descricao: "Lavar louça", concluido: false },
    { descricao: "Academia", concluido: true },
    { descricao: "Estudar", concluido: true },
    { descricao: "Diversão", concluido: false }
]

tarefas.forEach(function (tarefa) {
    if (tarefa.concluido != true) {
        console.log(`Tarefa: ${tarefa.descricao} - Concluído: Não`)
    }
    else {
        console.log(`Tarefa: ${tarefa.descricao} - Concluído: Sim`)
    }
})

console.log("-----------------------------------------------")

//Outra forma, Ternário
tarefas.forEach(function (tarefa) {
    console.log(tarefa.concluido == true ? `Tarefa: ${tarefa.descricao} - Concluído: Sim` : `Tarefa: ${tarefa.descricao} - Concluído: Não`)
})

/*
Crie um array com as taxas de imposto para cada categoria de produto (alimentos, vestuário, eletrônicos, etc.) 
e calcule o valor total de imposto para uma compra que contem itens de cada categoria.
*/

const taxas = {
    alimentos: 0.10,
    vestuario: 0.30,
    eletronicos: 0.20,
    outros: 0.40
  }
  
  const compra = [
    { nome: 'Arroz', categoria: 'alimentos', valor: 10.00 },
    { nome: 'Camisa', categoria: 'vestuario', valor: 20.00 },
    { nome: 'Celular', categoria: 'eletronicos', valor: 30.00 },
    { nome: 'Livro', categoria: 'outros', valor: 15.00 }
  ]
  
  let totalImposto = 0
  
  for (let item of compra) {
    totalImposto += item.valor * taxas[item.categoria]
  }
  
  console.log(`O valor total de imposto é de R$ ${totalImposto.toFixed(2).replace('.', ',')}`)
  
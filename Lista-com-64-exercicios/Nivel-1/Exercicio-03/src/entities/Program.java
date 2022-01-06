package entities;

import java.util.Scanner;

/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
*************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o ID do vendedor: ");
		int idVendedor = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o ID da peça: ");
		int idPeca = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o preço unitário da peça: ");
		double precoPeca = sc.nextDouble();
		
		//Entrada de dados.
		System.out.print("Digite a quantidade de peças vendidas: ");
		int qntVenda = sc.nextInt();
		
		System.out.println();
		
		//Cálculo do total de vendas.
		double totalVenda =  qntVenda * precoPeca;
		//Cálculo da comissão.
		double comissao = totalVenda * 0.05;
		
		//Saída de dados.
		System.out.printf("ID do vendedor: %d%n", idVendedor);
		System.out.printf("ID da Peça: %d%n", idPeca);
		System.out.printf("Preço unitário da peça = R$ %.2f%n", precoPeca);
		System.out.printf("Quantidade de peças vendidas = %d%n", qntVenda);
		System.out.printf("Total das vendas = R$ %.2f%n", totalVenda);
		System.out.printf("Comissão do vendedor = R$ %.2f", comissao);
		
		sc.close();

	}

}

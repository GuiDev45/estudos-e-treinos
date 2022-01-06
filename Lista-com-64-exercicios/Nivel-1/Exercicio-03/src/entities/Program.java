package entities;

import java.util.Scanner;

/*************************************************************************
 * 3) Fa�a um programa para pagamento de comiss�o de vendedores de pe�as,
 *		levando-se em considera��o que sua comiss�o ser� de 5% do total da venda 
 *		e que voc� tem os seguintes dados:
 * 		- Identifica��o do vendedor
 * 		- C�digo da pe�a
 * 		- Pre�o unit�rio da pe�a
 * 		- Quantidade vendida
*************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o ID do vendedor: ");
		int idVendedor = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o ID da pe�a: ");
		int idPeca = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite o pre�o unit�rio da pe�a: ");
		double precoPeca = sc.nextDouble();
		
		//Entrada de dados.
		System.out.print("Digite a quantidade de pe�as vendidas: ");
		int qntVenda = sc.nextInt();
		
		System.out.println();
		
		//C�lculo do total de vendas.
		double totalVenda =  qntVenda * precoPeca;
		//C�lculo da comiss�o.
		double comissao = totalVenda * 0.05;
		
		//Sa�da de dados.
		System.out.printf("ID do vendedor: %d%n", idVendedor);
		System.out.printf("ID da Pe�a: %d%n", idPeca);
		System.out.printf("Pre�o unit�rio da pe�a = R$ %.2f%n", precoPeca);
		System.out.printf("Quantidade de pe�as vendidas = %d%n", qntVenda);
		System.out.printf("Total das vendas = R$ %.2f%n", totalVenda);
		System.out.printf("Comiss�o do vendedor = R$ %.2f", comissao);
		
		sc.close();

	}

}

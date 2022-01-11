package entities;

import java.util.Scanner;

/*******************************************************************************
* 64) Escreva um programa que deverá ter as seguintes opções:
*     1 - Carregar Vetor
* 	  2 - Listar Vetor
* 	  3 - Exibir apenas os números pares do vetor
*	  4 - Exibir apenas os números ímpares do vetor
*	  5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
* 	  6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
* 	  7 - Sair
* 	  Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
*******************************************************************************/

public class Program {

	private static int[] vet = new int[10];
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.print("Digite uma opção: ");
			int opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				Carregarvet();
				break;
			case 2:
				System.out.print(Listarvet());
				break;
			case 3:
				System.out.print(ListarParesvet());
				break;
			case 4:
				System.out.print(ListarImparesvet());
				break;
			case 5:
				System.out.print(QuantidadeParesNosImparesvet());
				break;
			case 6:
				System.out.print(QuantidadeImparesNosParesvet());
				break;
			case 7:
				continuar = false;
				break;
			default:
				System.out.println("Número inválido.");
			}
		}
	}

	//1 - Carregar vetor.
	public static void Carregarvet() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i+1) + "° número do vetor: ");
			vet[i] = entrada.nextInt();
		}
		System.out.println("\nVetor carregado com sucesso!\n");
	}

	//2 - Listar vetor.
	public static String Listarvet() {
		String Listavet = "Valores do vetor:\n";
		for (int i = 0; i < 10; i++) {
			Listavet += "\t" + vet[i] + "\n";
		}
		return Listavet;
	}

	//3 - Exibir apenas os números pares do vetor.
	public static String ListarParesvet() {
		String Listavet = "Valores do vetor:\n";
		for (int i = 0; i < 10; i++) {
			if (vet[i] % 2 == 0) {
				Listavet += "\t" + vet[i] + "\n";
			}
		}
		return Listavet;
	}

	//4 - Exibir apenas os números ímpares do vetor.
	public static String ListarImparesvet() {
		String Listavet = "Valores do vetor:\n";
		for (int i = 0; i < 10; i++) {
			if (vet[i] % 2 == 1) {
				Listavet += "\t" + vet[i] + "\n";
			}
		}
		return Listavet;
	}

	//5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor.
	public static int QuantidadeParesNosImparesvet() {
		int quantidade = 0;
		for (int i = 1; i < 10; i = i + 2) {
			if (vet[i] % 2 == 0) {
				quantidade++;
			}
		}
		return quantidade;
	}

	//6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor.
	public static int QuantidadeImparesNosParesvet() {
		int quantidade = 0;
		for (int i = 0; i < 10; i = i + 2) {
			if (vet[i] % 2 == 1) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
}

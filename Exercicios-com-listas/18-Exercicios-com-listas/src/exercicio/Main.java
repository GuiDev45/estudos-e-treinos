package exercicio;

import java.util.Scanner;

/*
Uma grande emissora de televisão quer fazer uma enquete entre os seus telespectadores para saber qual o melhor jogador após cada jogo. 
Para isto, faz-se necessário o desenvolvimento de um programa, que será utilizado pelas telefonistas, para a computação dos numeroJogadors. 
Sua equipe foi contratada para desenvolver este programa, utilizando a linguagem de programação C++. 
Para computar cada numeroJogador, a telefonista digitará um número, entre 1 e 23, correspondente ao número da camisa do jogador. 
Um número de jogador igual zero, indica que a votação foi encerrada. 
Se um número inválido for digitado, o programa deve ignorá-lo, mostrando uma breve mensagem de aviso, e voltando a pedir outro número. 
Após o final da votação, o programa deverá exibir:

(A) - O total de numeroJogadors computados;
(B) - Os númeos e respectivos numeroJogadors de todos os jogadores que receberam numeroJogadors;
(C) - O percentual de numeroJogadors de cada um destes jogadores;
(D) - O número do jogador escolhido como o melhor jogador da partida, juntamente com o número de numeroJogadors e o percentual de numeroJogadors dados a ele.

Observe que os numeroJogadors inválidos e o zero final não devem ser computados como numeroJogadors. 
O resultado aparece ordenado pelo número do jogador. O programa deve fazer uso de arrays. 
O programa deverá executar o cálculo do percentual de cada jogador através de uma função. 
Esta função receberá dois parâmetros: o número de numeroJogadors de um jogador e o total de numeroJogadors. 
A função calculará o percentual e retornará o valor calculado. Abaixo segue uma tela de exemplo. 
O disposição das informações deve ser o mais próxima possível ao exemplo. Os dados são fictícios e podem mudar a cada execução do programa. 
Ao final, o programa deve ainda gravar os dados referentes ao resultado da votação em um arquivo texto no disco, 
obedecendo a mesma disposição apresentada na tela.

Enquete: Quem foi o melhor jogador?

Número do jogador (0=fim): 9
Número do jogador (0=fim): 10
Número do jogador (0=fim): 9
Número do jogador (0=fim): 10
Número do jogador (0=fim): 11
Número do jogador (0=fim): 10
Número do jogador (0=fim): 50
Informe um valor entre 1 e 23 ou 0 para sair!
Número do jogador (0=fim): 9
Número do jogador (0=fim): 9
Número do jogador (0=fim): 0

Resultado da votação:

Foram computados 8 numeroJogadors.

Jogador Votos           %
9               4               50,0%
10              3               37,5%
11              1               12,5%
O melhor jogador foi o número 9, com 4 numeroJogadors, correspondendo a 50% do total de numeroJogadors.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroAtleta = -1;
		int[] votacao = new int[23];
		int totalVotos = 0;
		int melhorAtleta = 0;

		System.out.println("Enquete: Quem foi o melhor jogador?\n");

		while (numeroAtleta  != 0) {
			System.out.print("Número do jogador (0=fim): ");
			numeroAtleta  = sc.nextInt();
			if (numeroAtleta < 0 || numeroAtleta > 23) {
				System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
			}
			else if (numeroAtleta != 0) {
				votacao[numeroAtleta]++;
				totalVotos++;
			}
		}

		for (int i = 0; i < votacao.length; i++) {
			if (votacao[melhorAtleta] < votacao[i]) {
				melhorAtleta = i;
			}
		}

		System.out.println("\nResultado da votação:\n");
		System.out.println("Total dos votos validos: " + totalVotos + "\n");

		if (totalVotos > 0) {
			System.out.printf("%-9s %-6s %s\n", "Jogador", "Votos", "%");
		}

		for (int i = 0; i < votacao.length; i++) {
			if (votacao[i] != 0) {
				double perc = ((double) votacao[i] / (double) totalVotos) * 100;
				System.out.printf("%-9d %-6d %2.1f\n", i, votacao[i], perc);
			}
		}

		System.out.println("O melhor jogador foi o número " 
							+ melhorAtleta 
							+ ", tendo " 
							+ votacao[melhorAtleta] + " votos, correspondendo a "
							+ (((double) votacao[melhorAtleta] / (double) totalVotos) * 100) 
							+ " % do total de numeroJogadors.");

		sc.close();

	}

}

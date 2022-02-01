package exercicio;

import java.util.Scanner;

/*
Uma grande emissora de televis�o quer fazer uma enquete entre os seus telespectadores para saber qual o melhor jogador ap�s cada jogo. 
Para isto, faz-se necess�rio o desenvolvimento de um programa, que ser� utilizado pelas telefonistas, para a computa��o dos numeroJogadors. 
Sua equipe foi contratada para desenvolver este programa, utilizando a linguagem de programa��o C++. 
Para computar cada numeroJogador, a telefonista digitar� um n�mero, entre 1 e 23, correspondente ao n�mero da camisa do jogador. 
Um n�mero de jogador igual zero, indica que a vota��o foi encerrada. 
Se um n�mero inv�lido for digitado, o programa deve ignor�-lo, mostrando uma breve mensagem de aviso, e voltando a pedir outro n�mero. 
Ap�s o final da vota��o, o programa dever� exibir:

(A) - O total de numeroJogadors computados;
(B) - Os n�meos e respectivos numeroJogadors de todos os jogadores que receberam numeroJogadors;
(C) - O percentual de numeroJogadors de cada um destes jogadores;
(D) - O n�mero do jogador escolhido como o melhor jogador da partida, juntamente com o n�mero de numeroJogadors e o percentual de numeroJogadors dados a ele.

Observe que os numeroJogadors inv�lidos e o zero final n�o devem ser computados como numeroJogadors. 
O resultado aparece ordenado pelo n�mero do jogador. O programa deve fazer uso de arrays. 
O programa dever� executar o c�lculo do percentual de cada jogador atrav�s de uma fun��o. 
Esta fun��o receber� dois par�metros: o n�mero de numeroJogadors de um jogador e o total de numeroJogadors. 
A fun��o calcular� o percentual e retornar� o valor calculado. Abaixo segue uma tela de exemplo. 
O disposi��o das informa��es deve ser o mais pr�xima poss�vel ao exemplo. Os dados s�o fict�cios e podem mudar a cada execu��o do programa. 
Ao final, o programa deve ainda gravar os dados referentes ao resultado da vota��o em um arquivo texto no disco, 
obedecendo a mesma disposi��o apresentada na tela.

Enquete: Quem foi o melhor jogador?

N�mero do jogador (0=fim): 9
N�mero do jogador (0=fim): 10
N�mero do jogador (0=fim): 9
N�mero do jogador (0=fim): 10
N�mero do jogador (0=fim): 11
N�mero do jogador (0=fim): 10
N�mero do jogador (0=fim): 50
Informe um valor entre 1 e 23 ou 0 para sair!
N�mero do jogador (0=fim): 9
N�mero do jogador (0=fim): 9
N�mero do jogador (0=fim): 0

Resultado da vota��o:

Foram computados 8 numeroJogadors.

Jogador Votos           %
9               4               50,0%
10              3               37,5%
11              1               12,5%
O melhor jogador foi o n�mero 9, com 4 numeroJogadors, correspondendo a 50% do total de numeroJogadors.
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
			System.out.print("N�mero do jogador (0=fim): ");
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

		System.out.println("\nResultado da vota��o:\n");
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

		System.out.println("O melhor jogador foi o n�mero " 
							+ melhorAtleta 
							+ ", tendo " 
							+ votacao[melhorAtleta] + " votos, correspondendo a "
							+ (((double) votacao[melhorAtleta] / (double) totalVotos) * 100) 
							+ " % do total de numeroJogadors.");

		sc.close();

	}

}

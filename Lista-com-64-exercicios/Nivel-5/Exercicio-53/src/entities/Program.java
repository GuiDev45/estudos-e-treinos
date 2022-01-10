package entities;

import java.util.Scanner;

/*******************************************************************************
* 53) Durante uma corrida de automóveis com N voltas de duração foram anotados
*     para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
*     programa para ler os tempos das N voltas, calcular e imprimir:
* 	   i. melhor tempo;
* 	   ii. a volta em que o melhor tempo ocorreu;
* 	   iii. tempo médio das N voltas;
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numVolta = 0;
		int total = 0;
		int media = 0;
		int melhorTempo = 0;
		int melhorVolta = 0;

		System.out.print("Digite o número de voltas: ");
		numVolta = sc.nextInt();

		int[] tempos = new int[numVolta];
		
		for(int i = 0; i < numVolta; i++){
			System.out.print("Digite o tempo da " + (i+1) + "ª volta (em segundos): ");
			tempos[i] = sc.nextInt();
			total += tempos[i];
			
			if(tempos[i] < melhorTempo || i == 0){
				melhorTempo = tempos[i];
				melhorVolta = i+1;
			}
		}
		
		media = total / numVolta;

		System.out.println("i.   O melhor tempo foi: " + melhorTempo + " segundos.");
		System.out.println("ii.  Melhor volta foi a: " + melhorVolta + "ª.");
		System.out.println("iii. A média de tempo foi: " + media);

		sc.close();
	}
	
}

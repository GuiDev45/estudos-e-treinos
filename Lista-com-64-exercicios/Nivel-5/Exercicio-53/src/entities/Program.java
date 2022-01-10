package entities;

import java.util.Scanner;

/*******************************************************************************
* 53) Durante uma corrida de autom�veis com N voltas de dura��o foram anotados
*     para um piloto, na ordem, os tempos registrados em cada volta. Fazer um
*     programa para ler os tempos das N voltas, calcular e imprimir:
* 	   i. melhor tempo;
* 	   ii. a volta em que o melhor tempo ocorreu;
* 	   iii. tempo m�dio das N voltas;
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numVolta = 0;
		int total = 0;
		int media = 0;
		int melhorTempo = 0;
		int melhorVolta = 0;

		System.out.print("Digite o n�mero de voltas: ");
		numVolta = sc.nextInt();

		int[] tempos = new int[numVolta];
		
		for(int i = 0; i < numVolta; i++){
			System.out.print("Digite o tempo da " + (i+1) + "� volta (em segundos): ");
			tempos[i] = sc.nextInt();
			total += tempos[i];
			
			if(tempos[i] < melhorTempo || i == 0){
				melhorTempo = tempos[i];
				melhorVolta = i+1;
			}
		}
		
		media = total / numVolta;

		System.out.println("i.   O melhor tempo foi: " + melhorTempo + " segundos.");
		System.out.println("ii.  Melhor volta foi a: " + melhorVolta + "�.");
		System.out.println("iii. A m�dia de tempo foi: " + media);

		sc.close();
	}
	
}

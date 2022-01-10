package entities;

import java.util.Random;
import java.util.Scanner;

/*****************************************************************************************
* 50) Fazer um programa que sorteie um n�mero de 0 a 100 e que permita que o
*     usu�rio (sem conhecer o n�mero sorteado) tente acertar. Caso n�o acerte, o
*     programa deve imprimir uma mensagem informando se o n�mero sorteado � maior ou
*     menor que a tentativa feita. Ao acertar o n�mero, o programa deve imprimir a
*     quantidade de tentativas feitas.
******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Random � um objeto do java para gerar n�meros aleat�rios.
		Random aleatorio = new Random();
		boolean acerto = false;
		
		int chute = 0;
		int tentativa = 0;
		
		int num = aleatorio.nextInt(101);
		
		while (acerto == false) {//Enquanto n�o acertar o n�mero Random o loop continua.
			System.out.print("Digite um n�mero de 0 a 100: ");
			chute = sc.nextInt();
			tentativa += 1;
			if (chute == num) {
				System.out.println("Voc� acertou em " + tentativa + " tentativas!");
				acerto = true;
			}
			else if (chute > num) {//Avisa se o n�mero digitado � maior ou menor que foi dado pelo Random.
				System.out.println("O n�mero � menor.");
			}
			else {
				System.out.println("O n�mero � maior.");
			}
		}
		
		sc.close();

	}

}

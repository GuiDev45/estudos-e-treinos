package entities;

import java.util.Random;
import java.util.Scanner;

/*****************************************************************************************
* 50) Fazer um programa que sorteie um número de 0 a 100 e que permita que o
*     usuário (sem conhecer o número sorteado) tente acertar. Caso não acerte, o
*     programa deve imprimir uma mensagem informando se o número sorteado é maior ou
*     menor que a tentativa feita. Ao acertar o número, o programa deve imprimir a
*     quantidade de tentativas feitas.
******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Random é um objeto do java para gerar números aleatórios.
		Random aleatorio = new Random();
		boolean acerto = false;
		
		int chute = 0;
		int tentativa = 0;
		
		int num = aleatorio.nextInt(101);
		
		while (acerto == false) {//Enquanto não acertar o número Random o loop continua.
			System.out.print("Digite um número de 0 a 100: ");
			chute = sc.nextInt();
			tentativa += 1;
			if (chute == num) {
				System.out.println("Você acertou em " + tentativa + " tentativas!");
				acerto = true;
			}
			else if (chute > num) {//Avisa se o número digitado é maior ou menor que foi dado pelo Random.
				System.out.println("O número é menor.");
			}
			else {
				System.out.println("O número é maior.");
			}
		}
		
		sc.close();

	}

}

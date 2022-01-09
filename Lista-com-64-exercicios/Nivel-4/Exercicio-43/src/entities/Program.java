package entities;

import java.util.Scanner;

/************************************************************************************
* 43) Uma rainha requisitou os servi�os de um monge e disse-lhe que pagaria
*     qualquer pre�o. O monge, necessitando de alimentos, indagou � rainha sobre o
*     pagamento, se poderia ser feito com gr�os de trigo dispostos em um tabuleiro
*     de xadrez, de tal forma que o primeiro quadro deveria conter apenas um gr�o e
*     os quadros subseq�entes, o dobro do quadro anterior. A rainha achou o trabalho
*     barato e pediu que o servi�o fosse executado, sem se dar conta de que seria
*     imposs�vel efetuar o pagamento. Fa�a um programa para calcular o n�mero de
*     gr�os que o monge esperava receber.
*************************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double graoCasa = 1;
		double casasTabuleiro = 64;
		int grao = 1;

		for (int i = 1; i < casasTabuleiro; i++) {
			graoCasa = graoCasa * 2;
			grao += graoCasa;
		}

		System.out.println("A quantidade de gr�os � = " + grao);

		sc.close();
		
	}
	
}

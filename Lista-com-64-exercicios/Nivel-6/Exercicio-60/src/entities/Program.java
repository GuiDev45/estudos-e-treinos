package entities;

import java.util.Scanner;

/***************************************************************************************
* 60) Escreva um programa que retorne o número do quadrante (1,2,3 ou 4) através
*     de um método chamado VERIFICA_QUADRANTE, que deve receber um valor para x e um
*	  valor para y.
Quadrantes
*         x |
*           |
*     2o    |     1o
*           |
*y ----------------------
*           |
*           |
*     3o    |     4o
*           |
****************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0;
		int y = 0;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = sc.nextInt();
		
		System.out.print(VerificaQuadrante(x, y));

		sc.close();

	}

	public static int VerificaQuadrante(int x, int y) {
		boolean quadx, quady;
		if (x >= 0) {
			quadx = true;
		} 
		else {
			quadx = false;
		}
		if (y >= 0) {
			quady = true;
		} 
		else {
			quady = false;
		}
		if (x == 0 || y == 0) {
			return 0;
		}
		else if (quadx && quady) {
			return 1;
		}
		else if (!quadx && quady) {
			return 2;
		}
		else if (!quadx && !quady) {
			return 3;
		}
		else {
			return 4;
		}
			
	}

}

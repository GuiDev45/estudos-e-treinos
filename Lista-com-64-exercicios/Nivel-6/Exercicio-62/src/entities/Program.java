package entities;

import java.util.Scanner;

/*******************************************************************************
* Escreva um programa que calcule e retorne o valor da hipotenusa atrav�s do
* m�todo HIPOTENUSA. O m�todo recebe o valor da base e da altura de um tri�ngulo
* F�rmulas: hipotenusa� = base� + altura�
*             base x altura
*    �rea = -----------------
*                  2
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a base: ");
		double base = sc.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("A hipotenusa �: " + Hipotenusa(base, altura));

		sc.close();

	}

	public static double Hipotenusa(double Base, double Altura) {
		double hipotenusa = (Base * Base) + (Altura * Altura);
		hipotenusa = Math.sqrt(hipotenusa);
		return hipotenusa;
	}

}

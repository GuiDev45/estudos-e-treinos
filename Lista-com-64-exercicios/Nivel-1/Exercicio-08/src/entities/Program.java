package entities;

import java.util.Scanner;

/*****************************************************************************************************************
* 8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
* 	 V = 3.14159 * R * R * A
* 	 Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
*****************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o raio da lata (em cm): ");
		double r = sc.nextDouble();
		
		//Entrada de dados.
		System.out.print("Digite a altura da lata (em cm): ");
		double a = sc.nextDouble();
		
		//Cálculo do volume da lata.
		double v = Math.PI * r * r * a;
		
		//Saída de dados.
		System.out.printf("O volume da lata de óleo é de = %.2f", v);
		
		sc.close();

	}

}

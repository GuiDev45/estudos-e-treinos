package entities;

import java.util.Scanner;

/*****************************************************************************************************************
* 5) Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz
* 	 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto na viagem e a velocidade m�dia.
* 	 Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE.
* 	 Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a
* 	 f�rmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade m�dia,
* 	 tempo gasto, a dist�ncia percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o tempo gasto na viagem em (horas): ");
		int tempoGasto = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite a velocidade m�dia em (km/h): ");
		double veloMedia = sc.nextDouble();
		
		//C�lculo da dist�ncia percorrida.
		double distancia = tempoGasto * veloMedia;
		
		//C�lculo do combust�vel gasto.
		double litroGasto = distancia / 12;
		
		//Sa�da de dados.
		System.out.println();
		System.out.printf("Velocidade m�dia = %.2f km/h%n", veloMedia);
		System.out.printf("Tempo gasto = %d horas%n", tempoGasto);
		System.out.printf("Dist�ncia percorrida = %.2f km/h%n", distancia);
		System.out.printf("Quantidade de Combust�vel utilizado = %.2f litros%n", litroGasto);
		
		sc.close();

	}

}

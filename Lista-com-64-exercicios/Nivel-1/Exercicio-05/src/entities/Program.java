package entities;

import java.util.Scanner;

/*****************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
* 	 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
* 	 Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
* 	 Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
* 	 fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
* 	 tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados.
		System.out.print("Digite o tempo gasto na viagem em (horas): ");
		int tempoGasto = sc.nextInt();
		
		//Entrada de dados.
		System.out.print("Digite a velocidade média em (km/h): ");
		double veloMedia = sc.nextDouble();
		
		//Cálculo da distância percorrida.
		double distancia = tempoGasto * veloMedia;
		
		//Cálculo do combustível gasto.
		double litroGasto = distancia / 12;
		
		//Saída de dados.
		System.out.println();
		System.out.printf("Velocidade média = %.2f km/h%n", veloMedia);
		System.out.printf("Tempo gasto = %d horas%n", tempoGasto);
		System.out.printf("Distância percorrida = %.2f km/h%n", distancia);
		System.out.printf("Quantidade de Combustível utilizado = %.2f litros%n", litroGasto);
		
		sc.close();

	}

}

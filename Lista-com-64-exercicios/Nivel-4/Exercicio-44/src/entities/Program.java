package entities;

import java.util.Scanner;

/*****************************************************************************************
* 44) Faça um programa que exiba as opções:
* 	1 – Conversão de Graus Celsius em Graus Fahrenheit
* 	2 – Conversão de Graus Fahrenheit em Graus Celsius
* 	3 – Peso ideal do homem
* 	4 – Peso ideal da mulher
*   O programa só deve encerrar quando o usuário digitar  ́S ́ para a pergunta
*   “Deseja encerrar o programa?”
*    Obs.: Nas opções 3 e 4 informar se o usuário está acima ou abaixo do peso ideal.
******************************************************************************************/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean fecha = true;
		int opcao = 0;
		char decisao = 0;
		
		double c = 0;
		double f = 0;
		double peso = 0;
		double altura = 0;
		
		do {//Um loop geral com todos os casos.
			
			do {//Um loop para obrigar a selecionar uma opção correta.
				System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit");
				System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius");
				System.out.println("3 – Peso ideal do homem");
				System.out.println("4 – Peso ideal da mulher");
				opcao = sc.nextInt();
				if (opcao < 1 || opcao > 4) {
					System.out.println("Opção Errada.\\n");
				}
			}while(opcao < 1 || opcao > 4);//Enquanto a opção não for a correta o loop continua.
			
			switch(opcao) {//Switch para cada caso que for escolhido.
			case 1:
				System.out.print("Digite os graus em Celsius para converter em Fahrenheit: ");
				c = sc.nextDouble();
				f = (9 * c + 160) / 5;
				System.out.printf("A conversão de Celsius para Fahrenheit = %.2f graus%n", f);
				break;
			case 2:
				System.out.print("Digite os graus em Fahrenheit para converter em Celsius: ");
				f = sc.nextDouble();
				c = (f - 32) * 5 / 9;
				System.out.printf("A conversão de Fahrenheit para Celsius = %.2f graus%n", c);
				break;
			case 3:
				System.out.print("Digite a altura: ");
				altura = sc.nextDouble();
				peso = (72.7 * altura) - 58.0;
				System.out.printf("O peso ideal para o homem é = %.2f kg%n", peso);
				break;
			case 4:
				System.out.print("Digite a altura: ");
				altura = sc.nextDouble();
				peso = (62.1 * altura) - 44.7;
				System.out.printf("O peso ideal para a mulher é = %.2f kg%n", peso);
				break;
			default:
				System.out.println("Opção Errada.\n");
			}
				
			System.out.println("Deseja encerrar o programa? (S/N)");
			decisao = sc.next().charAt(0);
			if (decisao == 'S' || decisao == 's') {//Se a decisao for sim o boolean recebe false.
				fecha = false;
			}
		}while(fecha);
		
		sc.close();

	}

}

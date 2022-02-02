package exercicio;

import java.util.Scanner;

/*
"Qual o melhor Sistema Operacional para uso em servidores?"

As possíveis respostas são:

1- Windows Server
2- Unix
3- Linux
4- Netware
5- Mac OS
6- Outro

Você foi contratado para desenvolver um programa que leia o resultado da enquete e informe ao final o resultado da mesma. 
O programa deverá ler os valores até ser informado o valor 0, que encerra a entrada dos dados. 
Não deverão ser aceitos valores além dos válidos para o programa (0 a 6). 
Os valores referentes a cada uma das opções devem ser armazenados num vetor. 
Após os dados terem sido completamente informados, 
o programa deverá calcular a percentual de cada um dos concorrentes e informar o vencedor da enquete. 
O formato da saída foi dado pela empresa, e é o seguinte:

Sistema Operacional     Votos   %
-------------------     -----   ---
Windows Server           1500   17%
Unix                     3500   40%
Linux                    3000   34%
Netware                   500    5%
Mac OS                    150    2%
Outro                     150    2%
-------------------     -----
Total                    8800

O Sistema Operacional mais votado foi o Unix, com 3500 votos, correspondendo a 40% dos votos.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdWindowServer = 0;
		int qtdUnix = 0;
		int qtdLinux = 0;
		int qtdNetware = 0;
		int qtdMacOs = 0;
		int qtdOutro = 0;

		int voto = 0;
		int cont = 0;

		double percWindowServer, percUnix, percLinux, percNetware, percMacOs, percOutro;

		voto = -1;

		while (voto != 0) {
			System.out.printf("Pesquisa: Qual o melhor SO para ser usado em servidores. Digite sua opcao:\n");
			System.out.printf("1 - Windows Server\n2 - Unix\n3 - Linux\n4 - Netware\n5 - MacOs\n6 - Outro\n0 - Encerrar Votacao\n");

			voto = sc.nextInt();

			switch (voto) {
			case 1:
				qtdWindowServer++;
				cont++;
				break;
			case 2:
				qtdUnix++;
				cont++;
				break;
			case 3:
				qtdLinux++;
				cont++;
				break;
			case 4:
				qtdNetware++;
				cont++;
				break;
			case 5:
				qtdMacOs++;
				cont++;
				break;
			case 6:
				qtdOutro++;
				cont++;
				break;
			case 0:
				break;
			default:
				System.out.printf("Opção invalida. Digite um valor valido\n");
			}

		}

		percWindowServer = (double) qtdWindowServer / cont;
		percWindowServer = percWindowServer * 100;
		percUnix = (double) qtdUnix / cont;
		percUnix = percUnix * 100;
		percLinux = (double) qtdLinux / cont;
		percLinux = percLinux * 100;
		percMacOs = (double) qtdMacOs / cont;
		percMacOs = percMacOs * 100;
		percNetware = (double) qtdNetware / cont;
		percNetware = percNetware * 100;
		percOutro = (double) qtdOutro / cont;
		percOutro = percOutro * 100;

		System.out.printf("Sistema Operacional\tVotos\tPercentual%% \n");

		System.out.printf("Windows Server\t\t%d\t%.2f\n", qtdWindowServer, percWindowServer);
		System.out.printf("Unix\t\t\t%d\t%.2f\n", qtdUnix, percUnix);
		System.out.printf("Linux\t\t\t%d\t%.2f\n", qtdLinux, percLinux);
		System.out.printf("MacOs\t\t\t%d\t%.2f\n", qtdMacOs, percMacOs);
		System.out.printf("Netware\t\t\t%d\t%.2f\n", qtdNetware, percNetware);
		System.out.printf("Outro\t\t\t%d\t%.2f\n", qtdOutro, percOutro);

		sc.close();

	}

}

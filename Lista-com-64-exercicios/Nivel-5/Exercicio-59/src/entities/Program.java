package entities;

import java.util.Scanner;

/*******************************************************************************
* 59) Escreva um programa que solicite dois caracteres de A a Z ao usu�rio e
*     imprima o n�mero de caracteres existente entre eles. Assuma que o usu�rio
*     digite os 2 caracteres em ordem alfab�tica. Caso n�o o estejam, emitir
*     mensagem de erro.
*     Exemplo: Digite 2 caracteres: j t O numero de caracteres entre eles �: 9
*******************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l',
				  'm','n','o','p','q','r','s','t','u','v','x','w','y','z'};

		System.out.print("Digite o primeiro caractere: ");
		char caractere = (char) sc.nextLine().toLowerCase().charAt(0);

		int primeiroCaractere = ChecarCharactere(caractere,alfabeto);

		System.out.print("Digite o segundo caractere: ");
		char outroCaractere = (char) sc.nextLine().toLowerCase().charAt(0);

		int segundoCaractere = ChecarCharactere(outroCaractere,alfabeto);

		int diferenca = segundoCaractere - primeiroCaractere - 1;
		
		if(primeiroCaractere >= 0 && segundoCaractere >= 0 && diferenca >= 0){
			System.out.println("O n�mero de caracteres entre eles �: " + diferenca);
		}
		else{
			System.out.println("Erro!");
		}

		sc.close();
		
	}

	public static int ChecarCharactere(char ch,char[] alfabeto){
		int num = - 1;
		for(int i = 0; i < alfabeto.length; i++){
			if(alfabeto[i] == ch){
				num = i;
			}
		}
		return num;
		
	}

}

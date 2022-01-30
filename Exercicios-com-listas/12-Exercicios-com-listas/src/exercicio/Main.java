package exercicio;

import java.util.Scanner;

/*
Foram anotadas as idades e alturas de 30 alunos. 
Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idades[] = new int[30];
		double alturas[] = new double[30];
		
		double somaAltura = 0.0;
	
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade do " + (i+1) + "º aluno: ");
			idades[i] = sc.nextInt();
		}
		
		System.out.println("Digite as alturas:");
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Digite a altura do " + (i+1) + "º aluno: ");
			alturas[i] = sc.nextDouble();
			somaAltura += alturas[i];
		}
		
		double media = somaAltura / 30;
		int cont = 0;
		
		for (int i = 0; i < 30; i++) {
			if (idades[i] >= 13 && alturas[i] >= media) {
				cont++;
			}
		}
	
		System.out.print("Alunos com 13 anos acima da média de altura: " + cont);
		
		sc.close();

	}

}

package entities;

import java.util.Scanner;

/*************************************************************************************
* 61) Escreva um programa que calcule e retorne o salário atualizado através do
*     método REAJUSTE. O método deve receber o valor do salário e o índice de reajuste.
**************************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario atual: ");
		double salAtual = sc.nextDouble();
		System.out.print("Digite o percentual de reajuste: ");
		double reajuste = (sc.nextDouble() / 100);
		
		System.out.println("O novo salario é de R$" + String.format("%.2f", reajuste(salAtual, reajuste)) + ".");
		sc.close();
	}
	
	public static double reajuste(double sal, double indiceReajust) {
		double novoSal = sal + (sal * indiceReajust);
		return novoSal;
	}

}

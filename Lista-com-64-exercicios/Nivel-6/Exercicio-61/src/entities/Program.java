package entities;

import java.util.Scanner;

/*************************************************************************************
* 61) Escreva um programa que calcule e retorne o sal�rio atualizado atrav�s do
*     m�todo REAJUSTE. O m�todo deve receber o valor do sal�rio e o �ndice de reajuste.
**************************************************************************************/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o salario atual: ");
		double salAtual = sc.nextDouble();
		System.out.print("Digite o percentual de reajuste: ");
		double reajuste = (sc.nextDouble() / 100);
		
		System.out.println("O novo salario � de R$" + String.format("%.2f", reajuste(salAtual, reajuste)) + ".");
		sc.close();
	}
	
	public static double reajuste(double sal, double indiceReajust) {
		double novoSal = sal + (sal * indiceReajust);
		return novoSal;
	}

}

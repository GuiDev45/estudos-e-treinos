package exercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
Utilize uma lista para resolver o problema a seguir. 
Uma empresa paga seus vendedores com base em comissões. 
O vendedor recebe $200 por semana mais 9 por cento de suas vendas brutas daquela semana. 
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana recebe $200 mais 9 por cento de $3000, ou seja, um total de $470. 
Escreva um programa (usando um array de contadores) que determine quantos vendedores receberam salários nos seguintes intervalos de valores:
(A) - $200 - $299
(B) - $300 - $399
(C) - $400 - $499
(D) - $500 - $599
(E) - $600 - $699
(F) - $700 - $799
(G) - $800 - $899
(H) - $900 - $999
(I) - $1000 em diante
Desafio: Crie ma fórmula para chegar na posição da lista a partir do salário, sem fazer vários ifs aninhados.
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double salario = 0.0;
		
		List<Double> listaSalario = new ArrayList<>();
		
		for (int i = 0; i < 9; i++) {
			System.out.print("Digite o salário base do " + (i+1) + "º vendedor: ");
			double base = sc.nextDouble();
			System.out.print("Digite o valor da venda do " + (i+1) + "º vendedor: ");
			double valorDeVenda = sc.nextDouble();
	
			salario = valorDeVenda * 0.09 + base;
			listaSalario.add(salario);
		}
		
		System.out.println();
		
		int cont = 1;
		for (Double salarios : listaSalario) {
			System.out.printf("Salário total do " + (cont++) + "º vendedor: R$ %.2f%n", salarios);
		}
		
		System.out.println();
		
		System.out.println("Quantidade dos intervalos de valores:");
		Map<Character, Integer> quantidadeIntervalo = new HashMap<>();
		quantidadeIntervalo.put('A', 0);
		quantidadeIntervalo.put('B', 0);
		quantidadeIntervalo.put('C', 0);
		quantidadeIntervalo.put('D', 0);
		quantidadeIntervalo.put('E', 0);
		quantidadeIntervalo.put('F', 0);
		quantidadeIntervalo.put('G', 0);
		quantidadeIntervalo.put('H', 0);
		quantidadeIntervalo.put('I', 0);
		
		for (Double salarios : listaSalario) {
			char intervalo = 'I';
			
			if (salarios < 300) {
				intervalo = 'A';
			}
			else if (salarios < 400) {
				intervalo = 'B';
			}
			else if (salarios < 500) {
				intervalo = 'C';
			}
			else if (salarios < 600) {
				intervalo = 'D';
			}
			else if (salarios < 700) {
				intervalo = 'E';
			}
			else if (salarios < 800) {
				intervalo = 'F';
			}
			else if (salarios < 900) {
				intervalo = 'G';
			}
			else if (salarios < 1000) {
				intervalo = 'H';
			}

			Integer contagem = quantidadeIntervalo.get(intervalo);
			quantidadeIntervalo.put(intervalo, contagem + 1);
			
		}
		
		quantidadeIntervalo.forEach((intervalo, contagem) -> 
		System.out.printf("[%c]: %d%n", intervalo, contagem));
		
		sc.close();
		
	}

}

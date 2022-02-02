package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
As Organiza��es Tabajara resolveram dar um abono aos seus colaboradores em reconhecimento ao bom resultado alcan�ado durante o ano que passou. 
Para isto contratou voc� para desenvolver a aplica��o que servir� como uma proje��o de quanto ser� gasto com o pagamento deste abono.
Ap�s reuni�es envolvendo a diretoria executiva, a diretoria financeira e os representantes do sindicato laboral, 
chegou-se a seguinte forma de c�lculo:
a.Cada funcion�rio receber� o equivalente a 20% do seu sal�rio bruto de dezembro; 
a.O piso do abono ser� de 100 reais, isto �, aqueles funcion�rios cujo sal�rio for muito baixo, recebem este valor m�nimo; 
Neste momento, n�o se deve ter nenhuma preocupa��o com colaboradores com tempo menor de casa, descontos, impostos ou outras particularidades. 
Seu programa dever� permitir a digita��o do sal�rio de um n�mero indefinido (desconhecido) de sal�rios. 
Um valor de sal�rio igual a 0 (zero) encerra a digita��o. 
Ap�s a entrada de todos os dados o programa dever� calcular o valor do abono concedido a cada colaborador, de acordo com a regra definida acima. 
Ao final, o programa dever� apresentar:

(A) - O sal�rio de cada funcion�rio, juntamente com o valor do abono;
(B) - O n�mero total de funcion�rio processados;
(C) - O valor total a ser gasto com o pagamento do abono;
(D) - O n�mero de funcion�rio que receber� o valor m�nimo de 100 reais;
(E) - O maior valor pago como abono; A tela abaixo � um exemplo de execu��o do programa, apenas para fins ilustrativos. 
	  Os valores podem mudar a cada execu��o do programa. 
	  
Proje��o de Gastos com Abono
============================ 
 
Sal�rio: 1000
Sal�rio: 300
Sal�rio: 500
Sal�rio: 100
Sal�rio: 4500
Sal�rio: 0
 
Sal�rio    - Abono     
R$ 1000.00 - R$  200.00
R$  300.00 - R$  100.00
R$  500.00 - R$  100.00
R$  100.00 - R$  100.00
R$ 4500.00 - R$  900.00
 
Foram processados 5 colaboradores
Total gasto com abonos: R$ 1400.00
Valor m�nimo pago a 3 colaboradores
Maior valor de abono pago: R$ 900.00
*/

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 0 para encerrar o programa");
		List<Double> salarios = new ArrayList<>();

		double salario = 0.0;

		while (true) {
			System.out.print("Sal�rio: ");
			salario = sc.nextDouble();
			if (salario == 0) {
				break;
				
			}
			salarios.add(salario);
		}

		System.out.println("\nProje��o de Gastos com Abono");
		System.out.println("============================");
		System.out.println("Sal�rio - Abono");

		double abonos = 0.0;
		int minimo = 0;
		double maior = 0;

		for (int i = 0; i < salarios.size(); i++) {
			double abono = (salarios.get(i) * 20) / 100;
			if (abono < 100) {
				abono = 100;
				minimo ++;
			}
			if (abono > maior) {
				maior = abono;
			}
			abonos += abono;

			System.out.printf("R$ %.2f - %.2f%n", salarios.get(i), abono);
		}

		System.out.printf("Foram processados %d colaboradores%n", salarios.size());
		System.out.printf("Total gasto com abonos: R$ %.2f%n", abonos);
		System.out.printf("Valor m�nimo pago a %d colaboradores%n", minimo);
		System.out.printf("Maior valor de abono pago: R$ %.2f%n", maior);

		sc.close();

	}

}

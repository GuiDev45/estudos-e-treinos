package entities;

/*********************************************************************************
* 35) Fa�a um programa que conte de 1 at� 100 e a cada m�ltiplo de 10 exiba uma
*     mensagem: "M�ltiplo de 10".
**********************************************************************************/

public class Program {

	public static void main(String[] args) {

		//Estrutura repetitiva
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i + " M�ltiplo de 10");
			}
			else {
				System.out.println(i);
			}
		}

	}

}

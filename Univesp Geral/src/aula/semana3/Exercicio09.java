package aula.semana3;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * Escreva um m�todo chamado cor que receba como par�metro uma vari�vel do tipo
	 * inteiro, chamada identificador, e imprima a palavra verde caso o valor do
	 * identificador seja igual a 1, amarelo caso o valor do identificador seja
	 * igual a 2, azul caso o valor do identificador seja igual a 3, e branco caso o
	 * valor do identificador seja igual a 4. Caso contr�rio (isto �, se o valor do
	 * identificador n�o for 1, 2, 3 ou 4), dever� imprimir �identificador
	 * invalido�. Utilize a estrutura switch...case...default para resolver este
	 * problema.
	 */
	public static void identificador(int id) {
		switch (id) {

		case 1:
			System.out.println("Verde");
			break;

		case 2:
			System.out.println("Amarelo");
			break;

		case 3:
			System.out.println("Azul");
			break;

		case 4:
			System.out.println("Branco");
			break;

		default:
			System.out.println("N�mero inv�lido");

		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 4:");
		int a = input.nextInt();
		identificador(a);

	}

}

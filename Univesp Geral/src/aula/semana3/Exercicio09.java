package aula.semana3;

import java.util.Scanner;

public class Exercicio09 {

	/*
	 * Escreva um método chamado cor que receba como parâmetro uma variável do tipo
	 * inteiro, chamada identificador, e imprima a palavra verde caso o valor do
	 * identificador seja igual a 1, amarelo caso o valor do identificador seja
	 * igual a 2, azul caso o valor do identificador seja igual a 3, e branco caso o
	 * valor do identificador seja igual a 4. Caso contrário (isto é, se o valor do
	 * identificador não for 1, 2, 3 ou 4), deverá imprimir “identificador
	 * invalido”. Utilize a estrutura switch...case...default para resolver este
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
			System.out.println("Número inválido");

		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 4:");
		int a = input.nextInt();
		identificador(a);

	}

}

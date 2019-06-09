package aula.semana3;

import java.util.Scanner;

public class Exercicio06 {

	public static void mediana(int v1, int v2, int v3) {

		if ((v2 > v1 && v2 < v3) || (v2 > v3 && v2 < v1)) {

			System.out.println(v2 + " é a Mediana");
		} else if ((v1 > v2 && v1 < v3) || (v1 > v3 && v1 < v2)) {

			System.out.println(v1 + " é a Mediana");
		}else if ((v3 > v1 && v3 < v2) || (v3 > v2 && v3 < v1)) {
			System.out.println(v3 + " é a Mediana");
		}else {
			System.out.println("Erro!!");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite os 3 números");

		int v1 = input.nextInt();
		int v2 = input.nextInt();
		int v3 = input.nextInt();

		mediana(v1, v2, v3);

	}

}

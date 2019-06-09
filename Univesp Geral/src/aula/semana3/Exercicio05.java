package aula.semana3;

import java.util.Scanner;

public class Exercicio05 {

	public static void med(double v1, double v2, double v3, double v4) {
		double media = (v1 + v2 + v3 + v4) / 4;
		if (media > 0) {
			System.out.println("Média maior que zero");
		} else {
			System.out.println("Média menor que zero");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite 4 números:");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		double n4 = input.nextDouble();
		med(n1, n2, n3, n4);

	}

}

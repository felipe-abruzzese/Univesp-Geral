package aula.semana2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		float reais;
		float dolar;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o Valor da cotação do Dolar: ");
		dolar = input.nextFloat();
		
		System.out.print("Insira o Valor em Reais: ");
		reais = input.nextFloat();
		
		System.out.println("O valor em Dolar é: $"+ reais/dolar);
		
	}

}

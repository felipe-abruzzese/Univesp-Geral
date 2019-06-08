package aula.semana2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double h;
		double g = 9.8;
		double tempo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o Valor da Altura: ");
		h = input.nextDouble();
		
		tempo = Math.sqrt(h/g);
		
		System.out.println("O tempo de queda será: "+ tempo);
		
		
	}

}

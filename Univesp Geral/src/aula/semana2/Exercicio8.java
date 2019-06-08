package aula.semana2;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void valorDeMulta(int time, int jogador, int amarelos, int vermelhos){
	
		double multa = 1000.20*amarelos + 4523.75*vermelhos;
		System.out.println("R$"+multa);
		
	}

	public static void main(String[] args) {
	
		int time;
		int jogador;
		int amarelos;
		int vermelhos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira na sequência os números de time, jogador, amarelos e vermelhos");
		time = input.nextInt();
		jogador = input.nextInt();
		amarelos = input.nextInt();
		vermelhos = input.nextInt();
		
		
		valorDeMulta(time, jogador, amarelos, vermelhos);
		
	}
}
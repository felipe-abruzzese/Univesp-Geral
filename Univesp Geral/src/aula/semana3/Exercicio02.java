package aula.semana3;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * 2.) O módulo (ou valor absoluto) de um número n, representado como |n|, corresponde à sua distância do número zero.
			a)Complete o código abaixo para calcular o módulo do parâmetro de entrada n.
			b)Crie um aplicativo que, no seu método main, receba a entrada do usuário (um double) e imprima o módulo 
			desse valor. Use o método modulo desenvolvido no item anterior.
	 * 
	 */
	public static double modulo(double n) {
		if (n<0) {
			return n*(-1);
		}else {
			return n;
		}
		
	}
	
	public static void main(String[] args) {
		
		double numero;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora de Módulo \nDigite o número a ser modulado:");
		numero = input.nextDouble();
		System.out.println(modulo(numero));
		
	}

}

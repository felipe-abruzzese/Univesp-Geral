package aula.semana3;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * 2.) O m�dulo (ou valor absoluto) de um n�mero n, representado como |n|, corresponde � sua dist�ncia do n�mero zero.
			a)Complete o c�digo abaixo para calcular o m�dulo do par�metro de entrada n.
			b)Crie um aplicativo que, no seu m�todo main, receba a entrada do usu�rio (um double) e imprima o m�dulo 
			desse valor. Use o m�todo modulo desenvolvido no item anterior.
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
		
		System.out.println("Calculadora de M�dulo \nDigite o n�mero a ser modulado:");
		numero = input.nextDouble();
		System.out.println(modulo(numero));
		
	}

}

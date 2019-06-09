package aula.semana3;

import java.util.Scanner;

/*
 * 3) Complete o código abaixo do método compara que recebe dois números inteiros, n1 e n2, e então diga se n1 é maior, menor ou igual a n2.
 * 
 */

public class Exercicio03 {

	static void compara(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("O primeiro número é maior que o segundo");
		}else if(n2 > n1) {
			System.out.println("O Segundo número é maior que o primeiro");
		}else {
			System.out.println("Os números são iguais!!");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = input.nextInt();
		
		compara(numero1, numero2);
		

	}

}

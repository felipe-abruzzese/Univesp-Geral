package aula.semana3;

import java.util.Scanner;

/*
 * 3) Complete o c�digo abaixo do m�todo compara que recebe dois n�meros inteiros, n1 e n2, e ent�o diga se n1 � maior, menor ou igual a n2.
 * 
 */

public class Exercicio03 {

	static void compara(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("O primeiro n�mero � maior que o segundo");
		}else if(n2 > n1) {
			System.out.println("O Segundo n�mero � maior que o primeiro");
		}else {
			System.out.println("Os n�meros s�o iguais!!");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		int numero1 = input.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int numero2 = input.nextInt();
		
		compara(numero1, numero2);
		

	}

}

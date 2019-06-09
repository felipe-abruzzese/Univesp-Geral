package aula.semana3;

/* 
 * 4) Crie um programa que leia tres valores inteiros (variaveis a, b e c) 
 * fornecidos pelo usuario e apresente o menor e o maior deles.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void compara(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a é o maior número");
		}else if (b > a && b > c) {
			System.out.println("b é o maior número");
		}else if (c > a && c > b){
			System.out.println("c é o maior número");
		}else {
			System.out.println("Existem números iguais ou inválidos na sequencia");
		}
		if (a < b && a < c) {
			System.out.println("a é o menor número");
		}else if (b < a && b < c) {
			System.out.println("b é o menor número");
		}else if (c < a && c < b){
			System.out.println("c é o menor número");
		}else {
			System.out.println("Existem números iguais ou inválidos na sequencia");
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira 3 números diferentes a b e c:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		compara(a, b, c);
	}

}

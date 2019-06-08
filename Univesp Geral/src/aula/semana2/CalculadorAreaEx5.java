package aula.semana2;

import java.util.Scanner;

public class CalculadorAreaEx5 {

	public static double areaQuadrado(Double lado) {
		return Math.pow(lado, 2);
	}
	public static double areaTrianguloReto(Double cateto) {
		return Math.pow(cateto, 2)/2;
	}
	public static double areaParalelogramo(double base, double altura) {
		return base*altura;
	}
	
	public static void main(String[] args) {

		int quantPecas;
		double valor1;
		double valor2;
		double custoMetal = 2.5;
		double custoPlastico = 1.5;
		double soma = 0 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Or�amento de Tangran: \nDigite quantas pe�as quiser e nos formatos que quiser "
				+ "\nDigite a Quantidade de pe�as: ");
		quantPecas = input.nextInt();
		
		for (int i = quantPecas; i > 0; i--) {
			System.out.println("Informe o tipo de pe�a: \n1. para Quadrado\n2. para Tri�ngulo Reto\n3. para Paralelogramo");
			int tipo = input.nextInt();
			if (tipo == 1){
				System.out.println("Area do quadrado. \nDigite o lado do quadrado: ");
				valor1 = input.nextDouble();
				System.out.println("Quadrado de �rea: "+areaQuadrado(valor1)+" cm2");
				soma = soma + areaQuadrado(valor1);
				
			} else if (tipo == 2) {
				System.out.println("Area do Tri�ngulo reto. \nDigite valor o Cateto: ");
				valor1 = input.nextDouble();
				System.out.println("Tri�ngulo de �rea: "+areaTrianguloReto(valor1)+ " cm2");
				soma = soma + areaTrianguloReto(valor1);
		
			} else if (tipo ==3) {
				System.out.println("Area do Paralelogramo. \nDigite valor da base e depois da altura: ");
				valor1 = input.nextDouble();
				valor2 = input.nextDouble();
				System.out.println("Paralelogramo de �rea: "+areaParalelogramo(valor1, valor2)+ " cm2");
				soma = soma + areaParalelogramo(valor1, valor2);
			
			}else {
					System.out.println("Valor inv�lido");
				}
			
						
		}
		System.out.println("A �rea total de material �:"+ soma +"cm2 \nE o valor gasto de material � de R$"+ soma*custoMetal +" para metal."
				+ "\nE de R$"+ soma*custoPlastico +" para pl�stico");		
	}

}

package aula.semana4;
/*
 * Fa�a um programa que imprima uma tabela com os 15 primeiros inteiros positivos, seus quadrados e cubos. 
 * Cada linha deve se referir a um inteiro. 
 * Por exemplo, uma das linhas impressas deve ser �3 9 27�. Para deixar a sa�da impressa do seu programa mais leg�vel, 
 * n�o deixe de imprimir um espa�o ou uma tabula��o (\t) entre os n�mero de uma mesma linha.
 */
public class Exercicio03 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 15; i++) {
			System.out.println("Inteiro: "+ i + " Quadrado: "+ i*i + " Cubo: "+ i*i*i);
			
		}
		

	}

}

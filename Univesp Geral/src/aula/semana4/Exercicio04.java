package aula.semana4;

/*
 * Escreva um m�todo que desenhe um ret�ngulo de "*" de n � m (n linhas � m colunas), n e m ser�o par�metros inteiros do seu m�todo. 
 * Segue exemplo de 3 linhas e 4 colunas:
 */

public class Exercicio04 {

	public static void retangulo(int n, int m) {
		for (int i = 0; i <= n; i++) {
			System.out.print("*");
			for (int b = 0; b <= m; i++) {
				System.out.print("*");
				for (int a = 0; a + 2 <= m; i++) {
					System.out.print(" ");
				}

			}
			System.out.println("*");
		}
	}

	public static void main(String[] args) {
		retangulo(10, 10);

	}

}

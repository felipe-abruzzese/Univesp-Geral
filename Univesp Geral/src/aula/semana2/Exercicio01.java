package aula.semana2;

/* Determine o que ser� impresso (pelos comandos println()) ap�s a execu��o das instru��es a seguir:
int a = 3;
int b = 5;
int c = 8;
int d = a * (b + c * 3) - 7;
int e = a - b - c;
System.out.println(a+" "+b+" "+c+" "+d+" "+e);
a = a + 1;
b = (4 * a + 1) / 10;
c = (4 * a + 1) % 10;
System.out.println(a+" "+b+" "+c+" "+d+" "+e);  
 */

public class Exercicio01 {

	
	public static void main(String[] args) {


		int a = 3;
		int b = 5;
		int c = 8;
		int d = a * (b + c*3) - 7;
		int e = a - b - c;
		
		System.out.println(a+ " "+b+" "+c+" "+d+" "+e);
		
		a = a + 1;
		b = (4 * a + 1) / 10;
		c = (4 * a + 1) % 10;
		System.out.println(a+ " "+b+" "+c+" "+d+" "+e);

	}

}

package aula.semana3;

public class Exercicio08 {
/*
* O m�todo abaixo realiza diferentes opera��es (soma, subtra��o, multiplica��o, divis�o e exponencia��o) sobre as entradas n1 e n2, dependendo do valor do par�metro op. Escreva o resultado que ser� impresso pela execu��o do m�todo abaixo caso ele receba os seguintes par�metros:
*
* Dica: crie uma classe �Calculadora� com um m�todo main que chame o m�todo �calcula� com cada um dos par�metros pedidos.
 */
	static void calcula(double n1, double n2, int op){
	    switch(op) {
	        case 1:
	            System.out.println(n1 + "+" + n2 + " = " + (n1+n2));
	            break;
	        case 2:
	            System.out.println(n1 + "-" + n2 + " = " + (n1-n2));
	            break;
	        case 3:
	            System.out.println(n1 + "*" + n2 + " = " + (n1*n2));
	            break;
	        case 4:
	            System.out.println(n1 + "/" + n2 + " = " + (n1/n2));
	            break;
	        case 5:
	            System.out.println(n1 + "^" + n2 + " = " + (Math.pow(n1, n2)));
	            break;
	        default:
	            System.out.println("Operacao invalida!");
	    }
	}
	
	public static void main(String[] args) {

	System.out.println("Item A");
	calcula(1.5, 3.5, 1);
	
	System.out.println("Item B");
	calcula(1.5, 3.5, 2);
	
	System.out.println("Item C");
	calcula(9, 1.5, 3);
	
	System.out.println("Item D");
	calcula(9, 1.5, 4);
	
	System.out.println("Item E");
	calcula(2, 3, 5);
	
	System.out.println("Item F");
	calcula(2, 3, 6);

	}

}

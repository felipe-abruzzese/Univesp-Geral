package aula.semana3;

public class Exercicio01 {
/*
 * 1) Escreva o que será impresso pela execução do método abaixo caso ele receba como parâmetro os seguintes números: 
 */
	static void multiplos2357(int num){
	    System.out.print("Multiplos de " + num + ": (");
	    if(num%2 == 0){
	        System.out.print(" 2 ");
	    }
	    if(num%3 == 0){        System.out.print(" 3 ");
	    }
	    if(num%5 == 0){
	        System.out.print(" 5 ");
	    }
	if(num%7 == 0){
	        System.out.print(" 7 ");
	    }
	    System.out.println(")");   
	}
	
	public static void main(String[] args) {
		
		multiplos2357(10);
		multiplos2357(15);
		multiplos2357(21);
		multiplos2357(25);
		multiplos2357(30);
	}
/*
 * Respostas:
		Multiplos de 10: ( 2  5 )
		Multiplos de 15: ( 3  5 )
		Multiplos de 21: ( 3  7 )
		Multiplos de 25: ( 5 )
		Multiplos de 30: ( 2  3  5 )
 */
}



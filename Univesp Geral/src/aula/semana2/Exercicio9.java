package aula.semana2;

import java.util.Scanner;

public class Exercicio9{

 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //cria scanner para ler entrada do usuário

        System.out.println("Entre com um numero de 5 digitos: ");

        int num = input.nextInt(); //lê a entrada

 

        System.out.println("Resultado: ");

        System.out.print((num / 10000) + "   "); //primeiro

        System.out.print((num % 10000) / 1000 + "   "); //segundo

        System.out.print((num % 1000) / 100 + "   "); //terceiro

        System.out.print((num % 100) / 10 + "   "); //quarto

        System.out.print(num % 10 + "   "); //quinto

    }

}
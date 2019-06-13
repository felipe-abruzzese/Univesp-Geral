package aula.semana3;

public class Exercicio10 {

	public static double conversorDeTemperatura(double temp, int conv) {
		
		switch(conv) {
		
		case 1: // Celsius --> Fahrenheit
			return ((temp*9)/5) + 32;
			
		case 2: // Farenheit --> Celsius
			return (((temp-32)*5)/9);
			
		case 3: // Kelvin --> Celsius
			return temp - 273;
			
		case 4: // Celsius --> Kelvin
			return temp + 273;
			
		case 5: // Farenheit --> Kelvin
			return (5*(temp-32)/9 + 273);
			
		case 6: // Kelvin -->> Farenheit
			return (9*(temp-273)/5 + 32);
			
		}
		
		return (Double.NaN);
	}

	public static void main(String[] args) {

		System.out.println(conversorDeTemperatura(50, 1));

	}

}

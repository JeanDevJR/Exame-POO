import java.util.Scanner;

public class IMCMetodo {
	
	static double calculo(double x, double y) {
		double calculoimc;
		
		calculoimc = x / (y * y);
		
		return calculoimc;		
	}
	
	static String classif(double result) {	
		if(result < 20) {
			return "Magro";
		}
		else if(result >= 20 && result < 25) {
			return "Normal";
		}
		else if(result >= 25 && result < 30) {
			return "Acima do peso";
		}
		else if(result >= 30 && result < 35) {
			return "Obeso";
		}
		else return"Muito Obeso";
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura, valorimc;
				
		System.out.println("Informe o peso: ");
		peso = entrada.nextDouble();
		
		System.out.println("Informe a altura: ");
		altura = entrada.nextDouble();
		
		valorimc = calculo(peso,altura);
		
		System.out.println(valorimc);					
		System.out.println(classif(valorimc));
		
		entrada.close();
	}
	
}

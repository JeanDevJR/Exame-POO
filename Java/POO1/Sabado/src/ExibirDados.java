import java.util.Scanner;

public class ExibirDados {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double a,b;
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Digite o primeiro Valor:");
		a = in.nextDouble();
		System.out.println("Digite o segundo Valor:");
		b = in.nextDouble();
		
		System.out.println("Soma = "+calc.soma(a, b));
		System.out.println("Subtração = "+calc.subtração(a, b));
		System.out.println("Divisão = "+calc.divisão(a, b));
		System.out.println("Multiplicação = "+calc.multiplicação(a, b));
		
	}

}

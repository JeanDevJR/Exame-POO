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
		System.out.println("Subtra��o = "+calc.subtra��o(a, b));
		System.out.println("Divis�o = "+calc.divis�o(a, b));
		System.out.println("Multiplica��o = "+calc.multiplica��o(a, b));
		
	}

}

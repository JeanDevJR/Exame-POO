import java.util.Scanner;

public class OperCalculadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Calculadora opercalc = new Calculadora();
		
		System.out.print("Informe dois valores: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		System.out.println("A soma dos valores �: "+a+" + "+b+" = "+opercalc.soma(a, b));
		System.out.println("A subtra��o dos valores �: "+a+" - "+b+" = "+opercalc.subtracao(a, b));
		System.out.println("A multiplica��o dos valores �: "+a+" * "+b+" = "+opercalc.multiplicacao(a, b));
		System.out.println("A divis�o dos valores �: "+a+" / "+b+" = "+opercalc.divisao(a, b));
		
		in.close();
	}

}

import java.util.Scanner;

public class CalculoQuadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Quadrado calcQuadrado = new Quadrado();
		
		System.out.print("Informe o tamanho de um dos lados: ");
		calcQuadrado.lado = in.nextDouble();
		
		calcQuadrado.calcularArea();
		calcQuadrado.calcularPerimetro();
		
		calcQuadrado.imprimir();
		
		in.close();
	}

}

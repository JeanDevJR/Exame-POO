import java.util.Scanner;

public class RetornaDados2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Retangulo retorn = new Retangulo();
		
		System.out.println("Digite a Base: ");
		retorn.base = in.nextDouble();
		System.out.println("Digite a Altura: ");
		retorn.altura = in.nextDouble();
		
		System.out.println("Area =  "+retorn.calcularArea());
		System.out.println("Perimetro = "+retorn.calcularPerimetro());
			
		retorn.retornaValor();

	}

}

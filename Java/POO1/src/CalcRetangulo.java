import java.util.Scanner;

public class CalcRetangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Retangulo calcret = new Retangulo();
		
		System.out.print("Informe a base do retangulo: ");
		calcret.base = in.nextDouble();
		System.out.print("Informe a altura do retangulo: ");
		calcret.altura = in.nextDouble();
		
		calcret.dados();
		System.out.println("Calculo da area: "+calcret.area());
		System.out.println("Calculo de perimetro: "+calcret.perimetro());
		
		in.close();
			
	}

}

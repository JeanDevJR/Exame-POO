import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o peso: ");
		double peso = in.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = in.nextDouble();
		double imc;
		imc = peso/(altura*altura);
		System.out.println("IMC eh: " + imc);
		if(imc < 17) {
			System.out.println("Muito abaixo do peso");
		}else if(imc >17 && imc <18.5) {
			System.out.println("Abaixo do peso");
		}else if(imc > 18.5 && imc <25) {
			System.out.println("Peso normal");
		}else if(imc >25 && imc <30) {
			System.out.println("Acima do peso");
		}else if(imc >30 && imc <35) {
			System.out.println("Obesidade 1");
		}else if(imc >35 && imc <40) {
			System.out.println("Obesidade 2 (severa)");
		}else if(imc >40) {
			System.out.println("Obesidade 3 (morbida)");
		}
	}
}
------------------------------------------------------------------------------------------------

public class MinhaCalculadora {
	public int soma(int num1, int num2) {
		return num1 + num2;
	
	}
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public int soma(int[] vetorInteiros) {
		int total = 0;
		for(int i=0; i<vetorInteiros.length;i++) {
			total += vetorInteiros[i];
		}
		return total;
	}
}

public class TesteCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calc = new MinhaCalculadora();
		
		int soma1 = calc.soma(1, 2);
		System.out.println(soma1);
		
	}
}

-----------------------------------------------------------------------------------------------

public class Fatorial {

	public int num;
		
		public int fatorial(int num) {
			 
			if(num == 0) {
				return 1;
		}
			return num * fatorial(num-1);
	}
}

public class FatorialConta {

	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		
		int fat1 = fat.fatorial(5);
		System.out.println(fat1);
	}

}

-------------------------------------------------------------------------------------------------
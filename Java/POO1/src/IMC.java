import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class IMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		NumberFormat numero = NumberFormat.getNumberInstance(Locale.ENGLISH);
		numero.setMinimumFractionDigits(2);
		numero.setMaximumFractionDigits(2);
		double peso, altura, imc;
		System.out.print("Informe o peso: ");
		peso = entrada.nextDouble();
		System.out.print("Informe a altura: ");
		altura = entrada.nextDouble();
		imc = peso / (altura * altura);
		System.out.println("IMC da pessoa: "+numero.format(imc));
		entrada.close();
		}
	
}
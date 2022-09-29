import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {
	public static void main(String[] agrs) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		float numeroItens = 0,precoUnitario = 0,quantidade = 0,valor=0, valorTotal = 0;
		int x = 0;
		while( x == 0) {
			numeroItens = entrada.nextFloat();
			if(numeroItens == 0){
				break;
			}
			precoUnitario = entrada.nextFloat();
			quantidade = entrada.nextFloat();
			valor = precoUnitario*quantidade;
			
			valorTotal += valor;	
			System.out.println("Valor Total:"+valor);
		}
		System.out.println("Valor Total:"+valorTotal);
		
		
	}
}
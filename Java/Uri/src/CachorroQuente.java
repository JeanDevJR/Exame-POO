import java.util.Scanner;
public class CachorroQuente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float QtdeCachorroQuentes, participantes, mediaCachorros;
		
		QtdeCachorroQuentes = entrada.nextFloat();
		participantes = entrada.nextFloat();
		mediaCachorros = QtdeCachorroQuentes / participantes;
		
		System.out.printf("%.2f\n", mediaCachorros);

	}

}

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float n1,n2,media;
		
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		
		media = (n1+n2)/2;
		
		if(media >= 7 && media <10){
			System.out.println("Aprovado");
		}
		if(media < 7 ) {
			System.out.println("Reprovado");
		}
		if(media == 10) {
			System.out.println("Aprovado com distinção");
		}
		
		
	}

}
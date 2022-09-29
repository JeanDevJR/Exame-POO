import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner nota = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Informe duas notas do aluno: ");
		
		n1 = nota.nextDouble();
		n2 = nota.nextDouble();
		
		media = (n1 + n2) / 2;
		
		if(media == 10) {
			System.out.println("Aprovado com Distincao");
		}
		else if(media >= 7) {
			System.out.println("Aprovado");
		}
		else if(media < 7) {
			System.out.println("Reprovado");
		}
	}
}

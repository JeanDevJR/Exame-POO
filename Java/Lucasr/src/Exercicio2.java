import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] agrs) {
		Scanner entrada = new Scanner(System.in);
		String turno;
		
		System.out.printf("Digite:\nM Para matutino\nV para Vespertino\nN para Noturno\n");
		turno = entrada.nextLine();
		
		if(turno.charAt(0) == 'M'){
			System.out.println("Bom dia!");
		}
		else if (turno.charAt(0) == 'V'){
			System.out.println("Boa tarde!");
		}
		else if (turno.charAt(0) == 'N'){
			System.out.println("Boa Noite!");
		}
		else{
			System.out.println("Valor invalido!");
		}
		
	}
}

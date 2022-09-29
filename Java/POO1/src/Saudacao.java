import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {

		Scanner saudacao = new Scanner(System.in);
		
		String s;
		
		System.out.println("Digite o periodo (M-matutino, V-vespertino ou N-noturno): ");
		
		s = saudacao.nextLine();
				
		if(s.equals("M")) {
			System.out.println("Bom dia!");
		}
		else if(s.equals("V")) {
			System.out.println("Boa Tarde!");
		}
		else if(s.equals("N")) {
			System.out.println("Boa Noite!");
		}
		else if(s != "V" && s != "M" && s != "N") {
			System.out.println("Valor Invalido!");
		}
	}
}

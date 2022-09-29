import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Funcionario renda = new Funcionario();
		
		System.out.print("Nome do Funcionario: ");
		renda.nome = in.next();
		System.out.print("Informe o salario: ");
		renda.salario = in.nextDouble();
		
		renda.aumento(renda.salario);
		renda.pessoa();
		
		in.close();
	}
	
}

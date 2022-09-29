import java.util.Scanner;

public class RetornaDados {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Digite nome do funcionario: ");
		func.nome = in.next();
		System.out.println("Digite salario do funcionário: ");
		func.salario = in.nextDouble();
		
		func.aumentaSalario();
		func.imprimaDados();

	}

}

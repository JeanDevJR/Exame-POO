
public class Funcionario {
	public String nome;
	public double salario;
	
	public void aumentaSalario() {
		if(salario <= 1500) {
			salario = salario * 1.25;
		}
		else if(salario <= 3000) {
			salario = salario * 1.20;
		}
		else if(salario <= 4500) {
			salario = salario * 1.15;
		}
	}
	public void imprimaDados() {
		System.out.println("Funcionario: "+nome);
		System.out.println("Salário: "+salario);
	}
}
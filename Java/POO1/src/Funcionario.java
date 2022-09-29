
public class Funcionario {
	
	public String nome;
	public double salario;
	
	public void aumento(double resultado) {
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
	
	public void pessoa() {
		System.out.println("Funcionario: "+nome);
		System.out.println("Salario: "+salario);
	}

}

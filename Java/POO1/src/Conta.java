public class Conta {
	
	public int conta      = 0;
	public String titular = "";
	public double saldo   = 0;

	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	public void sacar(double valor) {
		saldo = saldo - valor;
	}
	public String extrato() {
		return "Saldo: "+saldo;
	}
	
}

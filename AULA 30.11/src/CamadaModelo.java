
public class CamadaModelo {
	private double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

		
	public double efetuaDeposito(double valor) {
		return saldo = saldo + valor;
	}
	
	public double efetuaSaque(double valor) {
		return this.saldo = this.saldo - valor;
	}
	
	
}

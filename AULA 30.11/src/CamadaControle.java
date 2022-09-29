
public class CamadaControle {
	
	CamadaModelo caixa;
	CaixaEletronico form;
	
	public CamadaControle(CaixaEletronico form) {
		this.form = form;
		
	}
	public void efetuaDeposito() {
		if(caixa == null) {
				caixa = new CamadaModelo();
				double v = form.getValor();
				caixa.efetuaDeposito(v);
				double s = caixa.getSaldo();
				form.setSaldo(s);
		 	}
		}
	public void efetuaSaque() {
		if(caixa == null) {
				caixa = new CamadaModelo();	
		}
		caixa.efetuaSaque(form.getValor());
		form.setSaldo(caixa.getSaldo());
		
	}
	public void atualizaSaldo() {
			if(caixa == null) {
				caixa = new CamadaModelo();	;
				
			}
			form.setSaldo(caixa.getSaldo());
		}
}

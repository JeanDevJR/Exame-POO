public class Carro {

	public String cor    = "";
	public String modelo = "";
	public String motor  = "";	
		
	public void ligar() {
		System.out.println("Ligando carro "+modelo+" "+cor+" "+motor);
	}
	
	public void desligar() {
		System.out.println("Desligando carro "+modelo+" "+cor+" "+motor);
	}
	
	public void acelerar() {
		System.out.println("Acelerando carro "+modelo+" "+cor+" "+motor);
	}
	
	public void frear() {
		System.out.println("Freando carro "+modelo+" "+cor+" "+motor);
	}
	
}

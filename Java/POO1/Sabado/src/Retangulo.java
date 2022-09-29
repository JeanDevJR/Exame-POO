
public class Retangulo {
	public double base;
	public double altura;
	
	public double calcularArea(){
		
		return base * altura;
	}
	
	public double calcularPerimetro() {
		
		return (base +  altura)*2;
	}
	
	public void retornaValor() {
		System.out.println("Altura: "+altura);
		System.out.println("Base: "+base);
		
	}
}

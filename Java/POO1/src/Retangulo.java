
public class Retangulo {

	public double base;
	public double altura;
	
	public double area() {
		return base * altura;
	}
	
	public double perimetro() {
		return 2 * base + 2 * altura;
	}
	
	public void dados() {
		System.out.println("Base: "+base);
		System.out.println("Altura: "+altura);
	}
}

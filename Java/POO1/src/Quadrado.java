
public class Quadrado {
	
	public double lado;
	public double area;
	public double perimetro;
	
	public void calcularArea() {
		double z = lado * lado;
		area = z;
	}
	
	public void calcularPerimetro() {
		double q = (lado + lado) * 2;
		perimetro = q;
	}
	
	public void imprimir() {
		System.out.println("Calculo da Area: "+area);
		System.out.println("Calculo do Perimetro: "+perimetro);
	}
}

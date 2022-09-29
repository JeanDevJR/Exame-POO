import java.util.Scanner;

public class CarroObjeto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Carro carroObj  = new Carro();
		Carro carroObj2 = new Carro();
		
		carroObj.cor = "Prata";
		carroObj.modelo = "Gol";
		carroObj.motor = "1.0";
		
		carroObj.ligar();
		carroObj.acelerar();
		carroObj.frear();
		carroObj.desligar();
		
		System.out.print("Modelo do carro: ");
		carroObj2.modelo = in.next();
		System.out.print("Cor do carro: ");
		carroObj2.cor = in.next();
		System.out.print("Motor do carro: ");
		carroObj2.motor = in.next();
		
		carroObj2.ligar();
		carroObj2.acelerar();
		carroObj2.frear();
		carroObj2.desligar();
		
		in.close();
	}

}

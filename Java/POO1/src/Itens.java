import java.util.Scanner;

public class Itens {

	public static void main(String[] args) {
		Scanner itens = new Scanner(System.in);
		
		float preco, numero, quantidade, total = 0, total2 = 0;
		int x = 0;
		
		while(x == 0) {
			System.out.println("Informe o numero do Item: ");
			numero = itens.nextFloat();
			if (numero == 0) {
				break;
			}
			System.out.println("Informe o preço: ");
			preco = itens.nextFloat();
			System.out.println("Informe a quantidade: ");
			quantidade = itens.nextFloat();
			
			total = preco * quantidade;		
			total2 += total;		
		}
		System.out.println("Valor total da venda: "+total2);
	}

}

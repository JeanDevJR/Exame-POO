import java.util.Scanner;

public class ContaObjeto {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Conta contaObj = new Conta();
		
		System.out.print("Nome do Titular: ");
		contaObj.titular = in.next();
		System.out.print("Numero do Conta: ");
		contaObj.conta = in.nextInt();
		
		contaObj.depositar(100);
		contaObj.depositar(250);
		contaObj.sacar(20);
		contaObj.sacar(120);
		System.out.println(contaObj.extrato());
		
		in.close();
		}

}

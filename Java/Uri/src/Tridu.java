import java.util.Scanner;
public class Tridu {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int carta1,carta2;
		
		carta1 = entrada.nextInt();
		carta2 = entrada.nextInt();
		
		if(carta1 < carta2) {
			System.out.println(carta2);
		}
		if(carta1 > carta2) {
			System.out.println(carta1);
		}
		if(carta1 == carta2) {
			System.out.println(carta1);
		}
		
	}

}

import java.util.Scanner;

public class DesafioBino {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int a,b, x,n1 = 0,n2 = 0,n3 = 0,n4 = 0;
		
		a =  entrada.nextInt();
		
		for (x = 0; x < a; x++) {
			b =  entrada.nextInt();
			
			if(b % 2 == 0) {
				n1++;
			}
			if(b % 3 == 0) {
				n2++;
			}
			if(b % 4 == 0) {
				n3++;
			}
			if(b % 5 == 0) {
				n4++;
			}
		}
		
		System.out.println(n1+" Multiplo(s) de 2");
		System.out.println(n2+" Multiplo(s) de 3");
		System.out.println(n3+" Multiplo(s) de 4");
		System.out.println(n4+" Multiplo(s) de 5");
		
		
		
	}

}

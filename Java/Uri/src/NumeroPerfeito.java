import java.util.Scanner;
public class NumeroPerfeito {

	public static void main (String[] args) {
		Scanner entrada =new Scanner(System.in);
		int N = 0,X = 0 ;
		N = entrada.nextInt();
		for (int i = 0; i < N; i++) {
			int sum = 0;
			X = entrada.nextInt();
			for (int j = 1; j <= X/2; j++) {
				if ((X % j) == 0) {
					sum += j;
				}
				
			}
			if (sum == X) {
				System.out.print(X+" eh perfeito\n");
			}else {
				System.out.print(X+" nao eh perfeito\n");
			}
		}
 
    }
}


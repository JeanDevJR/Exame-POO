import java.io.IOException;
import java.util.Scanner;
 

public class SequenciaLogica {
 
    public static void main(String[] args) throws IOException {
 		Scanner entrada = new Scanner(System.in);
		
		int X, Y, a=0, b=0;
		
		X = entrada.nextInt();
		Y = entrada.nextInt();
		
		for(a = 1;a <= Y; a++){
			b++;
			if(b == X){
				System.out.printf("%d", a);
			}
			else{
				System.out.printf("%d ",a);
			}
			if(b == X){
				b = 0;
				System.out.printf("\n");
			}
		}
 
    }
 
}
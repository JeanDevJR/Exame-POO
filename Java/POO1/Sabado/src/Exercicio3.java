import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {
	public static void main(String[] agrs) {
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		
		float idade,peso,altura,media = 0,mediaid = 0,sup = 0,altsup = 0;
		int x,y;
		
		for(x=1;x<=10;x++) {
			idade = entrada.nextFloat();
			peso = entrada.nextFloat();
			altura = entrada.nextFloat();
			
			media = media+idade;
			mediaid = media/x;
				
			if(peso > 90){
				sup = sup+1;
				
			}
			if(altura > 1.50) {
				altsup = altsup+1;
			}
			
		}
		 	
		System.out.printf("Media das idades:%.0f\n",mediaid);
		System.out.printf("Pesooas com peso maior que 90:%.0f\n",sup);
		System.out.printf("Pessoas com altura maior que 1.50:%.0f\n",altsup);
		
		
	
	}
}
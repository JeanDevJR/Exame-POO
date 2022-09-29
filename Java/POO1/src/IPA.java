import java.util.Scanner;

public class IPA {

	public static void main(String[] args) {

		Scanner ipa = new Scanner(System.in);
		
		int i, x, y=0, m, media=0, soma=0, alt=0;
		float p, a;
		
		for (x = 0; x < 3; x++) {
			System.out.println("Digite a idade: ");
			i = ipa.nextInt();
		
			System.out.println("Digite o peso: ");
			p = ipa.nextFloat();
		
			System.out.println("Digite a altura: ");
			a = ipa.nextFloat();
		
			m = i;
			soma = soma + m;
		
			if(p >= 90) {
				y++;
			}
			
			if(a <= 1.50) {
				alt++;
			}
		}
		
		media = soma / 3;
		System.out.println("Media das idades: "+media);
		System.out.println("Mais pesados que 90: "+y);
		System.out.println("Mais baixos que 1,50: "+y);
		ipa.close();
	}
}

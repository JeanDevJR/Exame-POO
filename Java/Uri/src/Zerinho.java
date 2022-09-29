import java.util.Scanner;
public class Zerinho {
 
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);

        int valor1, valor2, valor3, i;
        String finalLinha;

        while(entrada.hasNext()) {
            valor1 = entrada.nextInt();
            valor2 = entrada.nextInt();
            valor3 = entrada.nextInt();

            if(valor1 == valor2 && valor2 != valor3){
                System.out.println('C'); // Retorna 1 1 0
                continue;
            }  
            if(valor1 == valor2 && valor2 == valor3 && valor1 == valor3){
                System.out.println('*');
                continue;
            } 
            if(valor1 != valor2 && valor2 == valor3){
                System.out.println('A');
                continue;
            }
            if(valor2 != valor1 && valor2 != valor3){
                System.out.println('B');
                continue;
            }
        }
        entrada.close();
 
    }
 
}

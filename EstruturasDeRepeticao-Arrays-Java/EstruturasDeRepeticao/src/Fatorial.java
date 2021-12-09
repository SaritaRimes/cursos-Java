import java.util.Scanner;

/** Calcula o fatorial de um numero inteiro fornecido pelo usuario **/
/* Exemplo: 5! = 5*4*3*2*1 = 120 */

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de qual número? ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        for (int i = fatorial; i >= 1; --i) {
            multiplicacao *= i;
        }

        System.out.println(fatorial + "! = " + multiplicacao);
    }
}

import java.util.Scanner;

/** Desenvolve um gerador de tabuada capaz de gerar qualquer numero
    inteiro entre 1 e 10. O usuario informa de qual numero ele deseja
    ver a tabuada e a saida deve fornecer a tabuada deste numero. **/

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada de qual número? ");
        int tabuada = scan.nextInt();

        System.out.println("A tabuada de " + tabuada + " é:");

        for (int i = 1; i <= 10 ; ++i) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i)); //imprime a tabuada na tela
        }
    }
}

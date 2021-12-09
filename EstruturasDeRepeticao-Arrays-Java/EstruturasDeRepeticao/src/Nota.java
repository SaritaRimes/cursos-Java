import java.util.Scanner;

/** Pede uma nota com valor entre 0 e 10. Mostra uma mensagem caso o valor seja invalido
    e continua pedindo ate que o usuario informe um valor valido. **/

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente.");
            nota = scan.nextInt();
        }
    }
}

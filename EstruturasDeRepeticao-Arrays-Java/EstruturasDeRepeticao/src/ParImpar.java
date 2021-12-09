import java.util.Scanner;

/** Le N numeros inteiros, calcula e mostra a quantidade de pares e a quantidade
    de impares **/

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros, numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0; //contador controla o momento de interrupcao do loop
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero%2 == 0) ++quantidadePares; //conta os pares
            else ++quantidadeImpares; //conta os impares

            ++count;
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade Pares: " + quantidadePares);
        System.out.println("Quantidade Impares: " + quantidadeImpares);
    }
}

import java.util.Random;

/** Le 20 numeros inteiros aleatorios (entre 0 e 100), os armazena em um vetor
    e, ao final, mostra os numeros, seus antecessores e seus sucessores  **/

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); //variavel para gerar os numeros aleatorios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; ++i) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " "); //imprime os numeros aleatorios
        }

        System.out.println("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " "); //imprime os antecessores dos numeros aleatorios
        }

        System.out.println("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}

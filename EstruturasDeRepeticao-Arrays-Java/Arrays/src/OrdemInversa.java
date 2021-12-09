/** Cria um vetor de 6 numeros inteiros e os retorna na ordem inversa **/

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;
        while (count < vetor.length) {
            System.out.print(vetor[count] + " "); //imprime o vetor na ordem inicial
            ++count;
        }

        System.out.print("\nVetor na ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; --i) {
            System.out.print(vetor[i] + " "); //imprime o vetor na ordem inversa
        }
    }
}

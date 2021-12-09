import java.util.Random;

/** Gera e imprime uma matriz M 4x4 com valores aleatorios entre 0 e 9 **/

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random(); //variavel para gerar os numeros aleatorios

        int[][] M = new int[4][4];

        System.out.println("Matriz: ");
        for (int i = 0; i < M.length; ++i) {
            for (int j = 0; j < M[i].length; ++j) {
                M[i][j] = random.nextInt(9); //aloca numeros aleatorios aos elementos da matriz
                System.out.print(M[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}

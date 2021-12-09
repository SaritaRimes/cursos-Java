import java.util.Scanner;

/** Le 5 numeros e informa o maior numero e a media desses numeros **/

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero; //armazena os numeros lidos
        int maior = -999999999; //inicia no menor valor possivel para testar e descobrir o maior
        int soma = 0; //armazenara a soma dos valores inseridos
        float media; //armazenara a media dos numeros inseridos

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            ++count;
        } while (count < 5);
        media = (float) soma/count;

        System.out.println("Maior: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}

import java.util.Scanner;

/** Le o conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando
    sua idade. Quando o valor 0 eh inserido, o programa interrompe sua execucao. **/

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
    }
}

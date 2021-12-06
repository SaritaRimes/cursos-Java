package aula2_OperadoresLogicos;

/** Testa operadores logicos **/

public class ComparacoesLogicas {
    public static void main(String[] args) {
        /* Criando variaveis para comparacao */
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        /* Fazendo comparacoes para testes */
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println("!b1 " + !b1);
        System.out.println("!b2 " + !b2);

        /* Criando variaveis para comparacao */
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        /* Fazendo comparacoes para testes */
        System.out.println("((i1 + i2) < (f2 - f1)) " + ((i1 + i2) < (f2 - f1)));
        System.out.println("((i1 > i2) || (f2 < f1)) " + ((i1 > i2) || (f2 < f1)));

        /* Exemplo para apresentar a ideia de boa pratica: criar variaveis intermediarias */
        //sem criar variaveis intermediarias
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;
        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        //criando variaveis intermediarias
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        System.out.println("recebeAuxilio: " + recebeAuxilio);
    }
}

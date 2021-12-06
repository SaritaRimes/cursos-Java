package aula1;

public class Main {
    public static void main(String[] args) {

        /* Para a classe Aula1.Calculadora*/
        double a = 10;
        double b = 5;

        System.out.println("A soma dos numeros eh: " + Calculadora.soma(a, b));
        System.out.println("A subtração dos numeros eh: " + Calculadora.subtracao(a, b));
        System.out.println("A multiplicação dos numeros eh: " + Calculadora.multiplicacao(a, b));
        System.out.println("A divisão dos numeros eh: " + Calculadora.divisao(a, b));


        /* Para a classe Aula1.Mensagem */
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        /* Para a classe Aula1.Emprestimo */
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);
    }
}

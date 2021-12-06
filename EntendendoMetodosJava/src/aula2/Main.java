package aula2;

public class Main {
    public static void main(String[] args) {
        /* Calculando as areas dos quadrilateros */
        System.out.println();
        Quadrilatero.area(3); //quadrado
        Quadrilatero.area(5d,6d); //retangulo
        Quadrilatero.area(7, 8, 9); //trapezio
        Quadrilatero.area(4f, 5f); //losango
    }
}

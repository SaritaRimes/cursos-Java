package aula3;

public class Main {
    public static void main(String[] args) {
        /* Calculando as areas dos quadrilateros e retornando */
        double quadrado = QuadrilateroReturn.area(3);
        System.out.println("Área do quadrado: " + quadrado); //quadrado

        double retangulo = QuadrilateroReturn.area(5d,6d);
        System.out.println("Área do retângulo: " + retangulo); //retangulo

        double trapezio = QuadrilateroReturn.area(7, 8, 9);
        System.out.println("Área do trapézio: " + trapezio); //trapezio

        double losango = QuadrilateroReturn.area(4f, 5f);
        System.out.println("Área do losango: " + losango); //losango
    }
}

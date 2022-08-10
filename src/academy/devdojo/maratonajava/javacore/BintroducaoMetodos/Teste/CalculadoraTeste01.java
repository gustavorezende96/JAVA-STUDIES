package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora teeste 01");
        calculadora.subtraiDoisNumeros();    }
}

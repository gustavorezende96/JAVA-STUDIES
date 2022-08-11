
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira um numero: ");
        Double num1 = leitor.nextDouble();
        
        System.out.println("Insira outro numero: ");
        Double num2 = leitor.nextDouble();
        
        Double soma = num1 + num2;
        Double subtracao = num1 - num2;
        Double multiplicacao = num1 * num2;
        Double divisao = num1 / num2;
        
        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da subtracao é " + subtracao);
        System.out.println("O resultado da multiplicacao é " + multiplicacao);
        System.out.println("O resultado da divisao é " + soma);
    }
}

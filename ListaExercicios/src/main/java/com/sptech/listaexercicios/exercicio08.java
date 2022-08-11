
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira o nome do usuario: ");
        String userName = leitorNL.nextLine();
        
        
        System.out.println("Insira a primeira nota do usuario: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Insira a segunda nota do usuario: ");
        Double nota2 = leitor.nextDouble();
        
        
        Double somaNota = (nota1 + nota2);
        Double mediaNota = somaNota / 2;
        
        System.out.println("Olá, "+ userName +". Sua média foi de " + mediaNota);
    }
}

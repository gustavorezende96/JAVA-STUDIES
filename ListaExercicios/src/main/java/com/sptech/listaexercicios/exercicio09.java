
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira o nome do usuario: ");
        String userName = leitorNL.nextLine();
        
        System.out.println("Olá, "+ userName +"! Qual o ano de seu nascimento? ");
        Integer dataNasc = leitor.nextInt();
        
        Integer contaAnosNoFuturo = (2030 - dataNasc);
        
        System.out.println("Em 2030 você terá " + contaAnosNoFuturo + " anos");
        
    }
}

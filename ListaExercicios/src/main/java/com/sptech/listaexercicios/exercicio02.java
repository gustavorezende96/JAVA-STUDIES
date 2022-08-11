
package com.sptech.listaexercicios;

import java.util.Scanner;


public class exercicio02 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira seu login: ");
        String user = leitorNL.nextLine();
        
        System.out.println("Insira sua senha: ");
        String password = leitorNL.nextLine();
        
        System.out.println("Insira quantidade de tentativas: ");
        Integer trys = leitor.nextInt();
        
        System.out.println("Seu login é "+ user + ", sua senha é " + password +
                " e você tem " + trys + " tentativas antes de ter o acesso bloqueado!");
    } 
}

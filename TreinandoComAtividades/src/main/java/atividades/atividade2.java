package atividades;

import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Insira aqui o seu ID: ");
        String userId = leitorNL.nextLine();

        System.out.println("Insira aqui a sua senha: ");
        String password = leitorNL.nextLine();

        System.out.println("Insira aqui a quantidade de tentativas " +
                "antes de bloquear o acesso: ");
        Integer loginTrys = leitorNL.nextInt();

        System.out.println("Seu ID e " + userId + ", sua senha e " + password + " e você " +
                "tem " + loginTrys + " tentativas antes de ter o acesso bloqueado!");

  }
}

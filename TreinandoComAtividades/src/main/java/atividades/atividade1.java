package atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Insira abaxio quantos filhos de 0 a 3 anos você possui: ");
        Integer qtdFilhos3Anos = leitor.nextInt();;

        System.out.println("Insira abaxio quantos filhos de 4 a 16 anos você possui: ");
        Integer qtdFilhos16Anos = leitor.nextInt();

        System.out.println("Insira abaxio quantos filhos de 17 a 18 anos você possui: ");
        Integer qtdFilhos18Anos = leitor.nextInt();;


        Double conta3Anos = qtdFilhos3Anos * 25.12;
        Double conta16Anos = qtdFilhos16Anos * 15.88;
        Double conta18Anos = qtdFilhos18Anos * 12.44;

        Integer totalFilhos = qtdFilhos18Anos + qtdFilhos16Anos + qtdFilhos3Anos;
        Double totalDeBolsa = conta3Anos + conta16Anos + conta18Anos;

        System.out.println("Você tem um total de "+ totalFilhos + " filhos e " +
                "vai receber R$" + totalDeBolsa + " de bolsa");
    }
}

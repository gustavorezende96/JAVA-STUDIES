
package com.sptech.listaexercicios;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
         Scanner leitorNL = new Scanner(System.in);
         
         System.out.println("Quantos filhos de 0 a 3 anos você possui? ");
         Integer tresAnos = leitor.nextInt();
         
         System.out.println("Quantos filhos de 4 a 16 anos você possui? ");
         Integer dezesseisAnos = leitor.nextInt();
         
         System.out.println("Quantos filhos de 17 a 18 anos você possui? ");
         Integer dezoitoAnos = leitor.nextInt();
         
         Double contaTresAnos = (tresAnos * 25.12);
         
         Double contaDezesseisAnos = (dezesseisAnos * 15.88);
         
         Double contaDezoitoAnos = (dezoitoAnos * 12.44);
         
         Integer totalFilhos = tresAnos + dezesseisAnos + dezoitoAnos;
         Double totalBolsa = (contaTresAnos + contaDezesseisAnos + contaDezoitoAnos);

         System.out.println("Você tem um total de " + totalFilhos +
                 " filhos e vai receber R$"+ totalBolsa + " de bolsa");
    }
}

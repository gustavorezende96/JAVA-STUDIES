
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira quantos minutos você se aquece: ");
        Integer minAquecimento = leitor.nextInt();
        
        System.out.println("Insira quantos minutos você realiza exercicios aerobicos: ");
        Integer minAerobico = leitor.nextInt();
        
        System.out.println("Insira quantos minutos você realiza musculação: ");
        Integer minMusculacao = leitor.nextInt();
        
        Integer calAquecimento = (minAquecimento * 12);
        Integer calAerobico = (minAerobico * 20);
        Integer calMusculacao = (minMusculacao * 25);
        
        Integer somaMin = minAquecimento + minAerobico + minMusculacao;
        Integer somaCal = calAquecimento + calAerobico + calMusculacao;
        
        System.out.println("Olá, Jorge. Você fez um total de " + somaMin +
                 " minutos de exercícios e perdeu cerca de " + somaCal +
                         " calorias");
        
      }
}

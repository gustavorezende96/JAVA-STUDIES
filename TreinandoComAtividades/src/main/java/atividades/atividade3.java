package atividades;

import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Quantos minutos se aquece por dia: ");
        Integer minAquecimento = leitor.nextInt();

        System.out.println("Quantos minutos realiza exercicios aerobicos por dia: ");
        Integer minAerobico = leitor.nextInt();

        System.out.println("Quantos minutos realiza musculacao por dia: ");
        Integer minMusculacao = leitor.nextInt();

        Integer calAquecimento = minAquecimento * 12;
        Integer calAerobico = minAerobico * 20;
        Integer calMusculacao = minMusculacao * 25;

        Integer totalMin = minAerobico + minAquecimento + minMusculacao;
        Integer totalCalorias = calAquecimento + calAerobico + calMusculacao;

        System.out.println("Você se exercitou por " + totalMin + " minutos e perdeu " + totalCalorias +
                " calorias.");
    }
}

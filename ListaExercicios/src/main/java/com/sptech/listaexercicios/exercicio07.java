
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira o limete de peso do elevador: ");
        Double pesoElevador = leitor.nextDouble();
        
        System.out.println("Insira o limite de pessoas no elevador: ");
        Integer maxPessoas = leitor.nextInt();
        
        System.out.println("Insira o peso da primeira pessoa: ");
        Double pesoPessoa1 = leitor.nextDouble();
        
        System.out.println("Insira o peso da segunda pessoa: ");
        Double pesoPessoa2 = leitor.nextDouble();
        
        System.out.println("Insira o peso da terceira pessoa: ");
        Double pesoPessoa3 = leitor.nextDouble();
        
        Double pesoTotalElevador = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
        
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " 
                + maxPessoas +" pessoas.\n" + "O peso total no elevador é de "
                        + pesoTotalElevador + "KG, sendo que ele suporta "
                                + pesoElevador + "KG.");
    }
}

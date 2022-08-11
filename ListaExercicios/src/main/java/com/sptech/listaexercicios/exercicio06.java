
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira o salario bruto: ");
        Double salarioBruto = leitor.nextDouble();
        
        Double descontoINSS = salarioBruto * 0.1;
        Double descontoIr = salarioBruto * 0.2;
        
        System.out.println("Quanto custa a condução diaria de ida para o trabalho? ");
        Double conduçãoIda = leitor.nextDouble();
        
        Double descontoVT = (conduçãoIda * 2) * 22;
        Double descontos = descontoINSS + descontoIr + descontoVT;
        Double salarioLiquido = salarioBruto - descontos;
        
        
        System.out.println("Seu salário bruto é R$"+salarioBruto+", tem um total de R$"+ 
                descontos +" em descontos e receberá um líquido de R$"+salarioLiquido);
    } 
}

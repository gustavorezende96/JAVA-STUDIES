
package com.sptech.listaexercicios;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        
        System.out.println("Insira o valor do produto: ");
        Double valorProduto = leitor.nextDouble();
        
        System.out.println("Insira a quantidade vendida: ");
        Integer qtdVendida = leitor.nextInt();
        
        System.out.println("Insira o valor pago pelo cliente: ");
        Double valorPago = leitor.nextDouble();
        
        
        Double totalCompra = valorProduto * qtdVendida;
        Double trocoCliente = valorPago - totalCompra;
        
        System.out.println("Seu troco será de R$" + trocoCliente + ".");
    }
}

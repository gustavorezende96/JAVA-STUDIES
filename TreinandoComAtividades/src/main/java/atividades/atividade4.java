package atividades;
import java.math.BigDecimal;
import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Insira aqui o valor do produto: ");
        Double valorUnidade = leitor.nextDouble();

        System.out.println("Insira a quantidade vendida: ");
        Integer qtdVendida = leitor.nextInt();

        System.out.println ("Insira o valor pago pelo cliente: ");
        Double valorPago = leitor.nextDouble();


        Double valorConta = valorUnidade * qtdVendida;
        Double valorTroco = valorPago - valorConta;


        System.out.println("A compra ficou em R$" + valorConta +
                " e seu troco em R$" + valorTroco + ".");
    }
}

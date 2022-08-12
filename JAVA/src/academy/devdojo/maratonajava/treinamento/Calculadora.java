package academy.devdojo.maratonajava.treinamento;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Insira a operacao: ");
        String sinal = leitorNL.nextLine();

        System.out.println("Insira o primeiro numero: ");
        Integer num1 = leitor.nextInt();

        System.out.println("Insira o segundo numero: ");
        Integer num2 = leitor.nextInt();



        if(sinal.equals("+")){
            Integer mais = num1 + num2;
            System.out.println("O resultado e: " + mais);
        } else if (sinal.equals("-")) {
            Integer menos = num1 - num2;
            System.out.println("O resultado e: " + menos);
        }  else if (sinal.equals("*")) {
            Integer multiplicacao = num1 * num2;
            System.out.println("O resultado e: " + multiplicacao);
        } else if (sinal.equals("/")) {
            Integer divisao = num1 / num2;
            System.out.println("O resultado e: " + divisao);
        } else{
            System.out.println("Operacao invalida!");
        }

    }
}

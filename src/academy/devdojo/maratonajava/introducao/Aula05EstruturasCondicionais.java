package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        Short idade = 18;
        String categoria = "";

        /*if (idade < 15){
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18){
            categoria = "Juvenil";
        } else{
            categoria = "Adulta";
          }*/
        //ou
        categoria = idade < 15 ? "infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulta";
        System.out.println("Categoria: " + categoria);


        double salario = 9000;
        String mensagemDoar = "Irei doar 20 pila";
        String mensagemNaoDoar = "vo dua nada kkj";
        String mensagemResultado = salario > 7000 ? mensagemDoar : mensagemNaoDoar;


        System.out.println(mensagemResultado);


        double salarioAno = 45000;
        double primeiraTaxa = 9.70/100;
        double segundaTaxa = 37.35/100;
        double terceiraTaxa = 49.50/100;
        double impostoValor;

        if(salarioAno <= 34712){
            impostoValor = salarioAno * primeiraTaxa;
        }
        else if(salarioAno > 34712 && salarioAno <= 68507){
            impostoValor = salarioAno * segundaTaxa;
        }
        else {
            impostoValor = salarioAno * terceiraTaxa;
        }

        System.out.println(impostoValor);
    }
    }
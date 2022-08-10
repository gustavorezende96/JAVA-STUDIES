package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Camaro";
        carro1.cor = "Amarelo";
        carro1.ano = 2020;

        carro2.nome = "Porche";
        carro2.cor = "Azul";
        carro2.ano = 2018;

        System.out.println("Nome do carro: " + carro1.nome + ", cor do carro: " + carro1.cor + ", e ano do carro: " + carro1.ano + ".");
        System.out.println("Nome do carro: " + carro2.nome + ", cor do carro: " + carro2.cor + ", e ano do carro: " + carro2.ano + ".");
    }
}

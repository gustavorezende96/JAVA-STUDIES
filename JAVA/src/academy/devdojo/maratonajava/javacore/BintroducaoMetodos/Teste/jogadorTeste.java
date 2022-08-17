package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Jogador;

public class jogadorTeste {
    public static void main(String[] args) {


        Jogador jogador = new Jogador();
        jogador.setNickName("yotei");
        jogador.setNivel(200);
        jogador.setHorasJogadas(900.32);

        System.out.println(jogador.getNickName());
        System.out.println(jogador.getNivel());
        System.out.println(jogador.getHorasJogadas());
    }
}
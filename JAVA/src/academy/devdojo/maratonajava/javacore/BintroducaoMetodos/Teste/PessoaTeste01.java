package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        /*
        pessoa.nome = "Gustavo";
        pessoa.idade = 17;
    */
        pessoa.setNome("Gustavo");
        pessoa.setIdade(89);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}

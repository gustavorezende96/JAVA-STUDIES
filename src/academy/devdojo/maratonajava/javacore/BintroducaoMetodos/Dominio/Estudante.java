package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Estudante {
    public String nome = "Itadori";
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("-------------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}


package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Pessoa {
    private String nome;
    private int idade;


/*public void Imprime(){
    System.out.println(this.nome);
    System.out.println(this.idade);
    }*/

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
    if(idade < 0){
        System.out.println("Idade invalida");
        return;
    }
    this.idade = idade;
    }
    public String getNome(){
    return this.nome;
    }
    public int getIdade(){
    return this.idade;
    }
}

package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class ImpressoraEstudantes {
 public void imprime(Estudante estudante){

  System.out.println(estudante.nome);
  System.out.println(estudante.idade);
  System.out.println(estudante.sexo);
  estudante.nome = "gohan";
 }
}

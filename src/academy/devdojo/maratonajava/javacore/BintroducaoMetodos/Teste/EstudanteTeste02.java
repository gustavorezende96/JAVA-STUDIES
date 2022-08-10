package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.ImpressoraEstudantes;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "GOKU";
        estudante1.idade = 13;
        estudante1.sexo = 'M';

        estudante2.nome = "Boa Hancock";
        estudante2.idade = 23;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}

package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio.ImpressoraEstudantes;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante1.nome = "GOKU";
        estudante1.idade = 13;
        estudante1.sexo = 'M';
        
        estudante2.nome = "Boa Hancock";
        estudante2.idade = 23;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
        System.out.println("Aqui!");
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
    System.out.println("------------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}

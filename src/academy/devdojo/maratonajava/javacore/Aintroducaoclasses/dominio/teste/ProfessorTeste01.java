package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Neiva";
        professor.idade = 54;
        professor.sexo = 'F';
        String genero;
        if(professor.sexo == 'F'){
            genero = "Mulher";
        }
        else{
            genero = "Homem";
        }
        System.out.println(professor.nome + " " + professor.idade + " " + genero);

    }
}

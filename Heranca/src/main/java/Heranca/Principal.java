package Heranca;

public class Principal extends Pessoa{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();


        p1.setNome("Gustavo");
        p2.setNome("Thais");
        p3.setNome("Pedro");
        p4.setNome("Leticia");

        p2.setCurso("Atuação");
        p3.setSalario(1800.00);
        p4.setSetor("Nutricionista");
        
    }
}

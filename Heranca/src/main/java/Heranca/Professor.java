package Heranca;

public class Professor extends Pessoa{

    private String materia;
    private double salario;

    public void aumentarSalario(){
        this.salario = this.salario + 1000;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

package Heranca;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean ativo;

    public void mudarTrabalho(){
        this.setor = getSetor();
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

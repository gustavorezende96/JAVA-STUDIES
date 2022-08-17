package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.Dominio;

public class Jogador {
    private String nickName;
    private int nivel;
    private double horasJogadas;


    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public void setHorasJogadas(double horasJogadas){
        this.horasJogadas = horasJogadas;
    }

    public String getNickName(){
        return this.nickName;
    }
    public int getNivel(){
        return this.nivel;
    }
    public double getHorasJogadas(){
        return this.horasJogadas;
    }
}

package academy.devdojo.maratonajava.introducao;

public class exercicioFor {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}

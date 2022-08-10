package academy.devdojo.maratonajava.introducao;

public class AulaArray {
    public static void main(String[] args) {
        int[] idades = new int[3];
        idades[0] = 76;
        idades[1] = 66;
        idades[2

                ] = 56;
        for (int i = 0; i <= idades.length - 1; i++) {
            System.out.println(idades[i]);
        }

        String[] nomesPersonagens = new String[3];

        nomesPersonagens[0] = "Eren";
        nomesPersonagens[1] = "MIkasa";
        nomesPersonagens[2] = "Levi";

        for (int i = 0; i < idades.length; i++) {
            System.out.println(nomesPersonagens[i]);
        }
    }
}

package academy.devdojo.maratonajava.DIcas;

public class ArredondandoNumeros {
    public static void main(String[] args) {
        Double num1 = 1.5432;
        Double num2 = 1.543232232232;


        //Arredondar para uma casa decimal
        //num2 = Double.valueOf((Math.round(num2)));
        num2 = (Double) (100*1.5432);

        //Arredondar para duas casas decimais
        Double num3 = (Double)(100 * 1.5432);
        Double num3Arredondado = (Double)(num3 / 100);

        System.out.println("Numero antes de arredondar " + num1);
        System.out.println("Numero arredondado para uma casa decimal "
        + num2);
        System.out.println("Numero arredondado para duas casas decimais "
        + num3);
    }
}

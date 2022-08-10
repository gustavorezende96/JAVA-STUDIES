package academy.devdojo.maratonajava.introducao;

public class AulaSwitch {
    public static void main(String[] args) {
        byte dia = 9;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Escolha um numero de 1 a 7!");
        }

        char sexo = 'g';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Muie");
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }
}

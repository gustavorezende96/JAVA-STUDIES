package academy.devdojo.maratonajava.introducao;

public class ExercicioSwitch {
    public static void main(String[] args) {
        byte dia = 1;

        switch (dia){
//            case 1:
//                System.out.println("Domingo, fim de semana");
//                break;
//            case 2:
//                System.out.println("Segunda, dia util");
//                break;
//            case 3:
//                System.out.println("Terca, dia util");
//                break;
//            case 4:
//                System.out.println("Quarta, dia util");
//                break;
//            case 5:
//                System.out.println("Quinta, dia util");
//                break;
//            case 6:
//                System.out.println("Sexta, dia util");
//                break;
//            case 7:
//                System.out.println("Sabado, fim de semana");
//                break;
//            default:
//                System.out.println("Invalido");
//                break;
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Invalido");
        }
    }
}

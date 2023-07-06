package seccion5;

public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num = 3;

        switch (num) {

            case 0:
                System.out.println("El numero es 0: ");
                break;
            case 1:
                System.out.println("El numero es 1: ");
                break;
            case 2:
                System.out.println("El numero es 2: ");
                break;
            case 3:
                System.out.println("El numero es 3: ");
                break;

            default:
                System.out.println("Numero o Caracter Desconocido");
        }

        String nombre = "Matias";

        switch (nombre){
            case "Matias":
                System.out.println("Hola admin! 😾");
                break;
            case "Barbara":
                System.out.println("Bienvenida Barbara 🐑");
                break;
            case "Vicho":
                System.out.println("Bienvenido Vicho 🐈");
                break;

            default:
                System.out.println("Su nombre no esta ingresado en el sistema");
        }

    }
}

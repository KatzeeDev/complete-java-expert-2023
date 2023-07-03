package seccion4;

import java.util.Scanner;

public class OperadoresLogicosLoginArray {
        public static void main(String[] args) {

            /* Forma antigua que habiamos visto en el curso
            String[] usuarioSistema = new String[4];
            String[] passwordSistema = new String[4];
            usuarioSistema [0] = "Barbara";
            passwordSistema [0] = "12";

            usuarioSistema [1] = "Matias";
            passwordSistema [1] = "123";

            usuarioSistema [2] = "Vicho";
            passwordSistema [2] = "1234";

            usuarioSistema [3] = "Copito";
            passwordSistema [3] = "12345";
            */

            String[] usuarioSistema = {"Barbara", "Matias", "Vicho", "Copito"};
            String[] passwordSistema = {"12", "123", "1234", "12345"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el UserName: ");
            String usuarioConsola = scanner.next();

            System.out.println("Ingrese la contraseña: ");
            String passwordConsola = scanner.next();

            boolean autenticado = false;

            for (int i = 0; i < usuarioSistema.length; i++) {
                if (usuarioSistema[i].equals(usuarioConsola) && passwordSistema[i].equals(passwordConsola)) {
                    autenticado = true;
                    break;
                }
            }

            if (autenticado) {
                System.out.println("Login Exitoso. Bienvenido usuario ".concat(usuarioConsola).concat("!"));
            } else {
                System.out.println("Usuario o contraseña ingresados son incorrectos");
                System.out.println("Lo siento, se requiere autenticacion");
            }
        }
}

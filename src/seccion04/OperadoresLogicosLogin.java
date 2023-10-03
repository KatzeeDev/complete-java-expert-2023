package seccion04;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {

        // Datos sistema
        String usuarioSistema = "matias";

        String passwordSistema = "12345";

        String usuarioSistema2 = "barbara";
        String passwordSistema2 = "123";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el UserName: ");
        String usuarioConsola = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String passwordConsola = scanner.next();

        boolean autenticado = false;

        if ((usuarioConsola.equals(usuarioSistema) && passwordConsola.equals(passwordSistema)) ||
                (usuarioConsola.equals(usuarioSistema2) && passwordConsola.equals(passwordSistema2))){
            autenticado = true;
        } else {
            System.out.println("Usuario o contraseña ingresados son incorrectos");
        }

        if (autenticado) {
            System.out.println("Login Exitoso. Bienvenido usuario " .concat("!"));
        } else {
            System.out.println("Lo siento, se requiere autenticacion");
        }


    }


}

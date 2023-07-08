package seccion04;

import java.util.Scanner;

public class OperadorTernarioLoginArray {
        public static void main(String[] args) {
            String[] usuarioSistema = {"Barbara", "Matias", "Vicho", "Copito"};
            String[] passwordSistema = {"12", "123", "1234", "12345"};

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el UserName: ");
            String usuarioConsola = scanner.next();

            System.out.println("Ingrese la contraseña: ");
            String passwordConsola = scanner.next();

            boolean autenticado = false;

            for (int i = 0; i < usuarioSistema.length; i++) {
                autenticado = usuarioSistema[i].equals(usuarioConsola) &&
                        passwordSistema[i].equals(passwordConsola) || autenticado;
            }

            String mensaje = autenticado ? "Login Exitoso. Bienvenido usuario: ".concat(usuarioConsola) :
                    "Usuario o contraseña ingresados son incorrectos \n Lo sentimos, requiere autenticacion";

            System.out.println(mensaje);

        }
}

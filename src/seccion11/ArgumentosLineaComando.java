package seccion11;

public class ArgumentosLineaComando {

    public static void main(String[] args) {

        // En esta clase Agregamos argumentos atraves de la linea de consola


        if(args.length == 0) {
            System.out.println("Debe ingresar argumentos o parámetros");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++){
            System.out.println("Argumentos N°: " + i + ": " + args[i]);
        }

    }

}

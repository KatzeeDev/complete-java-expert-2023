package seccion5;

public class SentenciaBucleEtiquetasBuscarLetra {

    public static void main(String[] args) {

        // Programa para contar los carcteres de una frase.
        String frase = "Tres tristes tigres tragaban trigo en un trigal";
        int max = frase.length();
        int cantidad = 0;
        char letra = 't';
        for (int i = 0; i < max; i++) {
            // Recorremos cada indice del string. Si es igual a la letra t es porque lo encontro
            // Si es distinto que continue
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado: " + cantidad + " veces el caracter " + letra + " en la frase");

    }

}

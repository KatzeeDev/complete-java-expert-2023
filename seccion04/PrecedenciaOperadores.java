package seccion04;

public class PrecedenciaOperadores {

    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;


        // La manera correcta es esto.
        double promedio = (i + j + k) / 3d;
        System.out.println(promedio);

        // Ejemplos de precedencia de operadores

        // Primero divide, luego multiplica al final divide 20 en 3
        promedio = i + j + k / 3d * 10;
        System.out.println(promedio);

        // (15 + 8) + 66.6
        promedio = ++i + j-- + k / 3d * 10;
        System.out.println(promedio);

    }
}

package seccion3;

public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {

        /* Test de Rendimiento de Concatenacion
        Ejercicio:
        Realizar un bucle for para medir el rendimiento, segun lo que tarde veremos que forma de concatenacion posee mayor rendimiento

        Posterior a ello Utilizaremos String Builder
        Nota: El String Builder es Mutable a diferencia del String

        El bloque for consta de lo siguiente:
        1. Primero se inicializa la variable => i = 0
        2. Se evalua, para poder finalizar el ciclo  => i < 500. Es decir cuando llegue a 500 finaliza
        3. Y despues de cada iteracion se incrementa en 1 => i++

        Datos de Mediciones                                        Iteraciones/Tiempo
        Uso de concat: c = c.concat(a).concat(b).concat("\n");     500 =>    2  ms
                                                                  1000 =>    4  ms
                                                                 10000 =>  125  ms
                                                                100000 => 4563  ms



        Uso de concatenacion usando +=  c = c + a + b + "\n";     500 =>    13  ms
                                                                 1000 =>    13  ms
                                                                10000 =>    56  ms
                                                               100000 =>  1738  ms



        Uso de append: sb.append(a).append(b).append("\n");        500 =>   0  ms
                                                                  1000 =>   0  ms
                                                                 10000 =>   1  ms
                                                                100000 =>   9  ms






        Notas de Uso de StringBuilder:
        Se crea la clase
        StringBuilder sb = new StringBuilder(a);

        */

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();



        for(int i = 0; i < 100000; i++){
            sb.append(a).append(b).append("\n");


            /*  Esto seria lo mismo que
                sb.append(a)
                sb.append(b)
                sb..append("\n");
            */

        }


        long fin = System.currentTimeMillis();

        System.out.println(fin-inicio);

        System.out.println("c = " + c);
        System.out.println("sb = " + sb);

    }


}

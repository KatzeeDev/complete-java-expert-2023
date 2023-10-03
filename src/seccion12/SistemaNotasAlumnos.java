package seccion12;

import java.util.Scanner;

public class SistemaNotasAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de esudiantes para clase de matematicas: ");
        for (int i = 0; i < claseMatematicas.length ; i++) {
            claseMatematicas[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de esudiantes para clase de historia: ");
        for (int i = 0; i < claseHistoria.length ; i++) {
            claseHistoria[i] = scanner.nextDouble();
        }

        System.out.println("Ingrese 7 notas de esudiantes para clase lenguaje: ");
        for (int i = 0; i < claseLenguaje.length ; i++) {
            claseLenguaje[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 7 ;i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];

        }

        double promedioMatematicas = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        double promedioCurso = (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3;

        System.out.println("Promedio clase Matematicas: "  + promedioMatematicas);
        System.out.println("Promedio clase Historia: "  + promedioHistoria );
        System.out.println("Promedio clase Lenguaje: "  + promedioLenguaje);

        System.out.println("Promedio Final del curso: " + promedioCurso);


        System.out.println("Ingrese el identificador del alumno (De 0 a 6): ");
        int id = scanner.nextInt();

        double promedioAlumno = ((claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id]) / 3);
        System.out.println("El promedio del alumno Nro " + id + " :" + promedioAlumno);
    }

}

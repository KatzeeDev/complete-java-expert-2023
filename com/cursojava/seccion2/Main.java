package com.cursojava.seccion2;

// Curso de Andres Guzman
public class Main {
    public static void main(String[] args) {

        String saludar = "Hello Java 😾";
        System.out.println(saludar);
        System.out.println("saludar.toLowerCase() = " + saludar.toLowerCase());


        // Int => Dato Primitivo
        int numero = 10;
        System.out.println("numero = " + numero);
        // El int al ser un primitivo y no ser un objeto no tiene tanto con lo que trabajar o aplicar metodos.
        // por eso que al poner numero. no nos sugiere nada.

        // Integer => Tipo Clase. Permite manipularlo y cambiarlos a distintos tipos de datos.
        Integer numeroInteger = 10;
        numeroInteger.toString();
        System.out.println("numeroInteger = " + numeroInteger);

        // Contexto de una variable Siempre tiene. {}
        boolean valor = true;
        if(valor == true) {
            int numero1 = 1;
            System.out.println("El valor es verdadero");
            // Integer numeroInteger = 10; => Esto ya esta definido
        } else {
            System.out.println("El valor es Falso");
        }

        //System.out.println(numero1); numero1  => No existe dentro del contexto


        // Tipado Dinamico
        System.out.println(" -------------- Tipado Dinamico -------------- ");
        var numero3 = 15.4;
        System.out.println(numero3);

        System.out.println(" -------------- Reglas para definir una variable -------------- ");
        // Se puede definir sin dar un valor
        String nombre;
        nombre = "Matias";
        System.out.println("nombre = " + nombre);

        if (numero3 > 13) {
            nombre = "Nicolas";
            System.out.println("nombre = " + nombre);
        }



        System.out.println(" -------------- Primitivos Numeros enteros -------------- ");





    }
}
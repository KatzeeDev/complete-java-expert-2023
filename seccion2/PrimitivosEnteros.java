package com.cursojava.seccion2;

public class PrimitivosEnteros {

    public static void main(String[] args) {

        // En Java existen 2 tipos de Datos    Los Primitivos != Los de Referencia (Objetos)  Objetos => Instancia de una clase

        // Valores Primitivos =>  Representan un valor.
        System.out.println(" ----------- Byte -----------  ");
        // Si queremos representarlo a que tipo de bytes corresponde
        System.out.println(" Tipo Byte corresponde en byte a: " + Byte.BYTES);
        System.out.println(" Tipo Byte corresponde en bites a: " + Byte.SIZE);

        // Valores Maximos y Minimos Rango Posible -128 => 127
        System.out.println("El valor maximo de un Byte: " + Byte.MAX_VALUE);
        System.out.println("El valor minimo de un Byte: " + Byte.MIN_VALUE);


        System.out.println(" ----------- Short -----------  ");
        short numeroShort = 30000;
        // Si queremos representarlo a que tipo de bytes corresponde
        System.out.println(" Tipo Short corresponde en byte a: " + Short.BYTES);
        System.out.println(" Tipo Short corresponde en bites a: " + Short.SIZE);

        // Valores Maximos y Minimos Rango Posible -32768 => 32767
        System.out.println("El valor maximo de un Byte: " + Short.MAX_VALUE);
        System.out.println("El valor minimo de un Byte: " + Short.MIN_VALUE);


        System.out.println(" ----------- int -----------  ");

        int numeroIntMax = 2147483647;
        int numeroIntMin = -2147483648;

        // Si queremos representarlo a que tipo de bytes corresponde
        System.out.println(" Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println(" Tipo int corresponde en bites a: " + Integer.SIZE);

        // Valores Maximos y Minimos Rango Posible -2147483648 => 2147483647
        System.out.println("El valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int: " + Integer.MIN_VALUE);


        System.out.println(" ----------- Long (Super Integer) -----------  ");

        // Utilizar la L en longs
        long numeroLongMin = -9223372036854775807L;
        long numeroLongMax = 9223372036854775807L;

        // Si queremos representarlo a que tipo de bytes corresponde
        System.out.println(" Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println(" Tipo long corresponde en bites a: " + Long.SIZE);

        // Valores Maximos y Minimos Rango Posible -9223372036854775808 => 9223372036854775807
        System.out.println("El valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("El valor minimo de un long: " + Long.MIN_VALUE);









    }
}

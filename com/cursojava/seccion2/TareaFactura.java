package com.cursojava.seccion2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TareaFactura {

    public static void main(String[] args) {
        // Datos que pertenecen al Sistema
        String nombreDeLaEmpresa = "Vicho S.A";
        String rutDeLaEmpresa = "55.424.477-4";
        // Fecha Actual
        LocalDateTime dateTime = LocalDateTime.now();

        int cantidadProducto = 0;
        int precioProducto = 0;

        // Ingreso de Datos  =>   Datos que deben ser ingresados
        Scanner scanner = new Scanner(System.in);
        System.out.println(" -------------- Datos Factura -------------- ");
        System.out.println("Ingrese el Nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese el Rut del Cliente: ");
        String rutCliente = scanner.nextLine();
        System.out.println("Ingrese el nombre del Producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.println("Ingrese la cantidad del producto: ");
        cantidadProducto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese el precio del Producto: ");
        precioProducto = Integer.parseInt(scanner.nextLine());

        // Calculos
        int total = cantidadProducto * precioProducto;


        System.out.println("              Factura Emitida              ");
        System.out.println(" -------------- Datos Empresa -------------- ");
        System.out.println("Nombre de la Empresa: " + nombreDeLaEmpresa);
        System.out.println("Rut de la Empresa: " + rutDeLaEmpresa);
        System.out.println("Fecha de hoy: " + dateTime);

        System.out.println(" -------------- Datos Cliente -------------- ");
        System.out.println("Nombre del Cliente:  " + nombreCliente);
        System.out.println("Rut del Cliente: " + rutCliente);
        System.out.println("Nombre del Producto:  " + nombreProducto);
        System.out.println("Cantidad del Producto: " + cantidadProducto);
        System.out.println("Precio Unitario del Producto: " + precioProducto);
        System.out.println("Total de la Factura: $" + total);


    }



}

package seccion33.service;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
            /*
            La diferencia entre FileWriter y BufferedWriter es que:
            FileWriter: Escribe directamente al archivo sin buffering.
            BufferedWriter: Usa un buffer para escribir de manera eficiente y proporciona funcionalidades adicionales.
             */
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            // Al indicar true en la línea de arriba, escribira esto cada vez que se ejecute.
            buffer.append("Hola, este es mi Gato\n")
                    .append("Vicho")
                    .append("🐈");
            //buffer.close(); Lo quitamos ya que de forma automatica cuando finaliza el try lo va a cerrar
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Otra forma de crear un archivo seria. Utilizando PrintWriter, nos permite utilizar Printline, Printf etc
    // Como si fuera una consola
    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
            buffer.println("Hola, este es mi Gato\n");
            buffer.println("Vicho");
            buffer.printf("🐈 %s!", "🎣");
            System.out.println("El archivo se ha creado con éxito");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String leerArchivo(String nombre) {
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                sb.append(linea).append("\n");
            }
            //reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sb2 = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)) {
            s.useDelimiter("\n");
            while (s.hasNext()) {
                sb2.append(s.next()).append("\n");
            }
            //s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb2.toString();
    }

}


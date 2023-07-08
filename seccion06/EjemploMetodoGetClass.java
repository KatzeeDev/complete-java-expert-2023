package seccion06;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {

    public static void main(String[] args) {

        String texto = "Hola que  tal!";
        Class strClass = texto.getClass();

        // Nombre incluyendo el package
        System.out.println("strClass = " + strClass.getName());

        // Nombre, sin incluir el Package
        System.out.println("strClass = " + strClass.getSimpleName());

        // Obtener el nombre del package
        System.out.println("strClass = " + strClass.getPackageName());

        // Instancia de la clase clas por lo tanto da la siguiente informacion
        System.out.println("strClass = " + strClass);

        // Para sus metodos , campos,  atributos
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }


        Integer num = 34;
        Class intClass = num.getClass();

        System.out.println("getTypeName = " + intClass.getTypeName());
        System.out.println("getName = " + intClass.getName());
        System.out.println("getSimpleName = " + intClass.getSimpleName());
        // Super clase o clase padre. (Number)
        System.out.println("getSuperClass = " + intClass.getSuperclass());

        // Si preguntamos cual es la superClass de number seria algo asi como
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("getSuperClass = " + objClass);

        // Para ver todos los metodos que tienen los objetos
        for (Method metodoObjetos: intClass.getMethods()) {
            System.out.println("metodoObjetos.getName() = " + metodoObjetos.getName());
        }

        
    }

}

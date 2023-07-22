package seccion18.tarea21;

public class Main {

    public static void main(String[] args) {


        Gerente gerente = new Gerente("Matias", "Osorio", "123414",
                "direccion", 12000.0, 75000.0);

        System.out.println(" ------------------- Ejemplo Gerente ------------------- ");
        System.out.println("La remuneracion actual es de : " + gerente.getRemuneracion());
        // Aumentamos la remuneracion
        gerente.aumentarRemuneracion(23);
        // Vemos la remuneracion actual para ver los detalles
        gerente.imprimirRemuneracion(23);
        System.out.println(gerente);


        Empleado empleado = new Empleado("Vicho", "Vicharracus", "123123",
                "direccion2", 1000.0);
        System.out.println(" ------------------- Ejemplo Empleado ------------------- ");
        // Aumento de una remuneracion:
        System.out.println("La remuneracion actual es de " + empleado.getRemuneracion());
        // Aumentamos la remuneracion
        empleado.aumentarRemuneracion(23);
        // Vemos la remuneracion actual para ver los detalles
        empleado.imprimirRemuneracion(23);

        System.out.println(empleado);

        Cliente cliente = new Cliente("Copo", "De las nieves");
        Cliente cliente2 = new Cliente("Pelusa", "De las nieves");






    }

}

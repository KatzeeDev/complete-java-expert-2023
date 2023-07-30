package seccion22.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T t : camion) {
            if (t instanceof Animal) {
                System.out.println(((Animal) t).getNombre() + "tipo: " + ((Animal) t).getTipo());
            }
            else if (t instanceof Maquinaria) {
                System.out.println(((Maquinaria) t).getTipo());
            }
            else if (t instanceof Automovil) {
                System.out.println(((Automovil) t).getMarca());
            }
        }
    }


    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Vicho", "Caballo"));
        transporteCaballos.add(new Animal("Copito", "Caballo"));
        transporteCaballos.add(new Animal("Barbara", "Caballo"));
        transporteCaballos.add(new Animal("Daniel", "Caballo"));
        transporteCaballos.add(new Animal("Topocalma", "Caballo"));

        System.out.println("-------- Transporte Caballos -------- ");
        for (Animal a : transporteCaballos) {
            System.out.println(a.getNombre());
        }

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.add(new Maquinaria("Bulldozwer"));
        transporteMaquinaria.add(new Maquinaria("Grua Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        System.out.println("-------- Transporte Maquinaria -------- ");
        for (Maquinaria m : transporteMaquinaria) {
            System.out.println(m.getTipo());

        }

        System.out.println("-------- Transporte Automovil -------- ");
        Camion<Automovil> transporteAutos = new Camion<>(3);
        transporteAutos.add(new Automovil("Toyota"));
        transporteAutos.add(new Automovil("Mitsubishi"));
        transporteAutos.add(new Automovil("Chevrolet"));

        for (Automovil a : transporteAutos) {
            System.out.println(a.getMarca());
        }

    }

}

package seccion20.imprenta;

import seccion20.imprenta.model.*;


public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Matias" , "Grimes"),
                "Ingenieria en Informatica", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich" , "Gamma"),
                "Patrones de Diseño: Elem. Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));


        Informe informe = new Informe(new Persona("Erich", "Gamma"), new Persona("James", "Tognarelli"),
                "Estudio sobre microservicios");
        Imprimible.imprimir(cv);
        Imprimible.imprimir(informe);
        Imprimible.imprimir(libro);

        // Clase anonima De la interfaz Imprimible
        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Imprimiendo un objeto generico de una clase anonima";
            }
        };
        Imprimible.imprimir(objImp);

        // imprimir(libro); No se puede imprimir, por lo tanto, utilizamos interfaces
        System.out.println(Imprimible.TEXTO_DEFECTO);
    }


}

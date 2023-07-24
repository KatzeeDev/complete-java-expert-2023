package seccion19.pooclasesabstractas.form;

import seccion19.pooclasesabstractas.form.elementos.*;
import seccion19.pooclasesabstractas.form.elementos.select.Opcion;
import seccion19.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;


public class EjemploForm {

    public static void main(String[] args) {

        // No se puede crear un ElementoForm debido a que es abstracta
        // ElementoForm el = new ElementoForm() {}
        // Pero si se podria crear una Clase anonima para utilizarla pero no es reutilizable
        // Input Form con sus validaciones

        // Username
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        // Password
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12)); // Asignamos el min y el max

        // Email
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        // Edad
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        // Text Area
        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        // Lenguaje
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
        lenguaje.addOpcion(new Opcion("1", "Java"))
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "Rust"));
        // java.setSelected(true);

        // Clase anónima: Es una clase sin nombre, se usa para sobrescribir métodos de una clase o interfaz.
        // No es reutilizable.
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name ='" + this.nombre + "' value =\"" + this.valor + "\">";
            }
        };
        saludar.setValor("Hola que tal. Este campo esta deshabilitado! ");

        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia ...");

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        // Uso de expresiones Lambda
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(elemento -> {
            if (!elemento.esValido()) {
                elemento.getErrores().forEach(System.out::println);
            }
        });


    }


}

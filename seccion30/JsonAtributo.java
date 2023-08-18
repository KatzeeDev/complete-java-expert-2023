package seccion30;

import java.lang.annotation.*;
// Configuramos la annotation segun el contexto donde se utilizara
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    // Tiene la caracteristica que se puede arreglar un valor por defecto
    String nombre() default "";
    boolean capitalizar() default false;

}

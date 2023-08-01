package seccion26.lambda;

import seccion26.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String[] args) {

        // Predicate Retorna un Boolean
        Predicate<Integer> test = num -> num > 10;
        boolean resultado = test.test(11);
        System.out.println("resultado = " + resultado);

        // Utilizando el Equals para ver si dos Strings coniciden.
        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("t2.test(\"ROL_USER\") = " + t2.test("ROL_USER"));

        BiPredicate<String, String> t3 = String::equals; // (a, b) -> a.equals(b);
        System.out.println("Bi predicated (equals): " + t3.test("matias", "MATIAS"));

        BiPredicate<Integer, Integer> t4 = (i, j) -> j > i;
        boolean re2 = t4.test(5, 10);
        System.out.println("re2 = " + re2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Vicho");
        b.setNombre("Copito");

        // Vemos si 2 Usuario poseeen el mismo nombre utilizando el getNombre()
        BiPredicate<Usuario, Usuario> t5 = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(t5.test(a, b));

    }

}

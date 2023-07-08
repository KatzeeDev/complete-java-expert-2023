package seccion04;

public class OperadoresAsignacion {

    public static void main(String[] args) {

        // Operador de asignacion (=) => Asigna valor a una variable
        int i = 5;


        // Operadores Combinados o Compuestos
        i += 2;  // i = 5        i += 2  => i = 7
        System.out.println("i = " + i);

        // 7 + 5 = 12;
        i += 5;
        System.out.println("i = " + i);

        // i = 12

        // i = 12 - 6;
        i -= 6;
        System.out.println("i = " + i); 
        
        i *= 2;
        System.out.println("i = " + i);


        // Ejemplo de operador compuesto en strings
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Matias'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);



    }


}

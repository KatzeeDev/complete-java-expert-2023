# Antes de comenzar
## Acerca de Apuntes.md
En este MarkDown se encontraran apuntes del curso en general. Estos apuntes fueron creados por mi y en su mayoria son diapositivas entregadas en el curso o notas acerca de menciones durante este. Esto con el fin de llevar un registro y un progreso. Contiene cierto material del curso pero tal como dije anteriormente contiene material adicional que utilizare para hacer los apuntes de manera mas robusta.

## Acerca de Readme.md
En el caso del archivo Readme.md se llevara un registro de los conocimientos mas relevantes aprendidos durante el curso. Además se dara mención a las tareas de cada sección incluyendo recursos sobre como se abordaron los problemas, diagramas uml etc. Todo esto se ira incorporando a medida que se vaya avanzando durante el curso.

# Sección 1: Introducción
## Temas
- Fundamentos de Java SE: variables, tipo de datos primitivos y referencia, operadores, flujos de control, clase String, clase wraper, System, Math, Random, Date y Calendar, Arrays y Matrices, Clases y Objetos, Principios de POO (abstracción, encapsulamiento, polimosfismo, herencia, modularidad), clase abstracta
- Componentes más avanzados de Java SE: colecciones (Collection, List, Set, Map), manejo de excepciones, manejo de archivos (FIles), tipos genéricos (Generics), API stream, expresiones Lambda y CLosure, Optional, Multi-hilos (Thread), Base de Datos (JDBC) con MYSQL y PostgresSQL, hibernate/JPA, DAO (Data Access Object), GUI Swing, RXJava Reactive Strem(programación funcional y reactiva)
- Java EE(Enterprice): MVC(Model View Controller), Servidor JBoss WildFly, API Servlet/JSP, Java Server Face JSF 2 , Eld CDI, EJB 3, API REST; SOAP, JAAS Autenticación y Autorización, Spring 5, Struts 2

## Instalación del JDK
Se hizo recomendacion y especial enfasis a la utilización Desde la versión Java SE 14 en adelante.

## Intellij IDEA
Se recomendo el uso de IntelliJ Idea como IDE principal para el desarrollo del curso debido a su facilidad para trabajar con Java.

## Introducción a Java

* En 1995 desarrollado por Sun MicroSystem, para tarjetas inteligentes y sintonizadores de TV
* Equipo de 13 personas al mando de James Gosling, fueron "The Green project".
* Basado en C++, POO, con garbage colector. Inicialmente fue llamado Oak y luego renombrado a Java.
* En 1996 fue lanzado publicamente con HotJava de soporte web.
* Luego de 1998 Jva EE(Enterprise Edition)
* Lenguaje multiplataforma : Escribelo una vez y ejecutalo donde quieras.
* Lenguaje independiente al sistema operativo con un entorno de ejecucion llamado JVM (Java Virtual Machine)

```java
codigo      java      bytecode  -> JVM(Mac)
fuente  -> compiler -> (.class) -> JVM(Linux)
(.java)                         -> JVM(Windows)
```
> Diagrama utilizando durante la sección para explicar el funcionamiento interno de Java.

Todo codigo Java se compila en un lenguej intermedio que no es 100% binario, esta justo entremedio de la maquina y el código fuente y se le conoce como Bytecode.

En tiempo de ejecuci{on se interpreta el byte code en código binario o de maquina(0 y 1)


#### Características

- Muchos tipos de aplicaciones: consola, ventna, web, distribuidas, etc
- Multiplataforma
- POO
- Recolector de Basura (garbage colector), se evita fuga de memoria
- Polimorfismo, implementación de interfases, sobrecarga de métodos, herencia, etc
- Modularidad, más mantenible
- Principio de ocultación
- Lenguaje fuertemente tipado

### Primer Hola Mundo
Se explicaron los pasos para crear un Hola Mundo en Java

```
IntelliJ -> Create New Project -> y completamos: Name / Location / Languaje: Java / Build System: IntelliJ -> Create
```

El codigo para la creación fue este:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
```

Y en cosola imprimira:

```
Hello World!
```

**Conceptos que se profundizaran mas adelante **

public: Es un modificador de acceso. En este caso public indica que se puede ejecutar desde cualquier parte de la aplicación

void: Sin return en el metodo, solo ejecuta un proceso

args: Indica los argumentos que recibe

{}: Indicando el alcance del metodo, es el cuerpo.

class Porque es una clase.


# Sección 2: Variables


## Introducción a las variables

Una declaración de **variable** tiene dos partes:

**TipoDeDato nombreDeLaVariable;**

El tipo de la variable determina los valores que la variable puede contener y laas operaciones que se pueden realizar con ella.

\-> Desde Java versión 10 hay **var**, es un tipado dinámico.

- Hay dos categorías de tipo de dato:

\-**PRIMITIVOS**: un solo valor e incluyen: int(integer / entero), float(flotante / decimal), character, boolean. No son un objeto, son valores.

\-**REFERENCIADOS**: arrays, clases e interfaces(un contrato de implementación)

## Reglas para definir variables

- Los nombres de las variables empiezan con una letra minúscula
- Debe ser un juego de caracteres comprendido en la codificación Unicode
- No puede ser el mismo que una palabra clave (reservada del lenguaje) o el nombre de un valor boolean (true o false)

## Palabras Resevadas
En todo lenguaje de programación existen palabras reservadas que no se pueden utilizar para asignar variables. Esto con el fin de no alterar el funcionamiento del lenguaje en si.
Las palabras reservadas para Java son:

**Palabras reservadas**

abstract, boolean, break, byte, byvalue, case, catch, char, class, continue, const, default, do, double, else, extends, false, final, finally, float, for, goto, if, implements, import, instanceof, int, interface, long, native, new, null, package, private, protected, public, return, short, static, synchronized, switch, super, try, this, transient, threadsafe, throw, true, void, while

Imagen:

![palabrasreservadas](https://www.ciberaula.com/cursos/java/assets/img/Captura4.PNG)


Tips:

- No debe tener el mismo nombre que otras variables cuyas declaraciones aparezcan en el mismo ámbito
- Si una variable está compuesta de más de una palabra, como nombreDato, se utiliza camelCase
- Puede comenzar por una letra, un subrayado o un simbolo de dólar, siendo los sigueintes caracteres letras o dígitos.


## Primitivos
Son tipos de datos escalares que contienen un solo valor.

El tipo de dato se escribe enteramente en minuscula.

En el caso de enteros pueden ser:
```java
byte(8 bits)
short(16 bits)
int(32 bits)
long(64 bits)

```


Un entero es del conzunto Z = {..., -2, -1, 0, 1, 2, ...}

Difieren en las precisions y pueden ser positivos o negativos

```math
Z = \{\ldots, -2, -1, 0, 1, 2, \ldots\}

```

**Clase Wraper:** Byte, Short, Integer, Long

Su valor por defecto es 0;

**float**(**reales**): float(precision simple)(32bits), double(doble precision o reales)(64bits). Núumeros reales con coma(que es con el **.**).

``` java
float realFloat = 3.1416f; // la f por ser float
double realDouble = 4.7029235E3
```

Clase Wraper: Float, Double

Valor por defecto: 0.0f, 0.0d

Char: Usa unicode para expresar caracteres

```java
char a = 'a';
char c = '\u0021';
```

Tambien se puede utilizar por ejemplo para representar acciones.

| Char utilizado | Simbolo y/o Acción            |
| ------------------- | ------------------ |
| \\ b                | retroceso          |
| \\ n                | nueva linea        |
| \\ r                | retorno de carro   |
| \\ t                | tabulador          |
| \\ \\               | diagonal invertida |
| \\ "                | comillas dobles    |

Tiene un total de 16 bites.

Clase Wrapper desta clase: Character

Valor por defecto : u0000

Clase wraper: Character

\-Valor por defecto: u0000

- **boolean**: true ó false.

```
boolean verdadero = true;
boolean falso = false;
```

Tiene 1 bit

Clase wraper: Boolean
-Valor por defecto: false

# Sección 3: String
Los String en java son objetos del tipo de referencia:

```java
String nombre = new String ("Matias");
String apellido = new Sring ("Apellido")
```

Debido a que son ampliamente utilizados tiene una forma especial de asignación siendo asi esta la otra forma:

```java
String nombre = "Matias";
String nombreMascota = "Vicho";
String ejemplo = "Ejemplo de asignar String de una forma mas rapida"

```

## Concatenación
Para utilizar una concatenación en Java se expresa de la siguietne forma:

```java
String nombre = "Matias";
String nombreMascota = "Vicho";

System.out.println("Hola mi nombre es: " + nombre + " y el nombre de mi mascota es " + nombreMascota);

```

## Metodos de la Clase String

| Método                               | Acción que Realiza                                                                                                                                                        |
| ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `int length()`                       | Devuelve el número de caracteres en la cadena                                                                                                                             |
| `boolean equals(String b)`           | Compara si dos cadenas son iguales, sin tener en cuenta mayúsculas o minúsculas                                                                                           |
| `int compareTo(String b)`            | Compara la cadena con otra cadena 'b'. Devuelve un valor negativo si la cadena es lexicográficamente anterior a 'b', cero si son iguales, y un valor positivo si es posterior a 'b'|
| `String trim()`                      | Devuelve una copia de la cadena con espacios en blanco iniciales y finales eliminados                                                                                     |
| `char charAt(int posicion)`          | Devuelve el carácter en la posición especificada                                                                                                                          |
| `char[] toCharArray()`               | Convierte la cadena en un array de caracteres                                                                                                                             |
| `String substring(int a, int b)`     | Devuelve una subcadena que comienza en la posición 'a' y termina en la posición 'b'                                                                                        |
| `String substring(int desde)`        | Devuelve una subcadena que comienza en la posición 'desde' hasta el final de la cadena                                                                                     |
| `int indexOf(String cadena)`         | Devuelve la posición de la primera aparición del carácter o cadena especificada, buscando desde el inicio de la cadena                                                    |
| `int lastIndexOf(String cadena)`     | Devuelve la posición de la primera aparición del carácter o cadena especificada, buscando desde el final de la cadena                                                     |
| `boolean startsWith(String prefijo)` | Devuelve 'true' si la cadena comienza con el prefijo especificado                                                                                                         |
| `boolean endsWith(String sufijo)`    | Devuelve 'true' si la cadena termina con el sufijo especificado                                                                                                           |
| `String[] split(String patron)`      | Divide la cadena en varias subcadenas utilizando el patrón especificado como separador                                                                                    |


Imagen que muestra los metodos:

![metodos](https://4.bp.blogspot.com/-4dNkOIFBOrE/WOX84WRVzNI/AAAAAAAAAS0/YESWr3v8kq8wfZ1wCL5mUlpO7fCWkz6yQCLcB/s1600/String%2BMethods%2Bin%2BJava.jpg)




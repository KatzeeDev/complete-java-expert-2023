# Antes de comenzar
## Acerca de Apuntes.md
Este documento en formato Markdown reúne mis apuntes personales del curso. Se basa principalmente en diapositivas proporcionadas durante las sesiones del curso, así como en anotaciones sobre puntos mencionados de manera informal. El propósito de estos apuntes es documentar mi progreso y servir como un registro personal de mi aprendizaje.

Aunque contiene información del curso, este archivo va más allá de eso. He añadido material adicional relevante para complementar y robustecer mi entendimiento de los temas tratados. Por tanto, no solo sirve como una guía de estudio, sino también como una referencia valiosa para una revisión posterior y una comprensión más profunda del contenido del curso.

Por favor, ten en cuenta que estos apuntes son interpretaciones y adaptaciones personales del contenido del curso y, por lo tanto, pueden reflejar mi comprensión y perspectiva única.
## Acerca de Readme.md
El archivo Readme.md está diseñado para documentar los conocimientos más relevantes que se adquieran a lo largo del curso. Se mencionarán y detallarán las tareas correspondientes a cada sección, incluyendo los recursos utilizados para abordar los desafíos, los diagramas UML creados, y cualquier otro material auxiliar. Este archivo se actualizará continuamente conforme se vaya avanzando en el curso, proporcionando un resumen comprensible y detallado de los aprendizajes y logros obtenidos.
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


# Sección 4: Operadores
Java ofrece muchos tipos de operadores que se pueden utilizar según las necesidades. Estos se clasifican de acuerdo a la funcionalidad que proporcionan.

Estos operadores sirven para realizar cálculos, comparar valores, unir identificadores y literales, formar expresiones lógicas, tomar decisiones, entre otros.

## Operadores Aritmeticos
Estos se emplean para realizar operaciones aritméticas simples en tipos de datos primitivos.

- Multiplicación: `*`
- División: `/`
- Suma: `+`
- Resta: `-`
- Módulo/Resto: `%`
- Incremento: `++`
- Decremento: `--`
- Operadores combinados o compuestos: `-=` `+=` `/=` `*=` etc.
  `a += a` equivale a: `a = a + 5`

## Operador Incremento / Decremento
Utilizado para incrementar o decrementar el valor en 1. Existen dos variedades de este operador: pre y post.

- `++a`: pre-incremento, incrementa a en 1 y luego devuelve a.
- `a++`: post-incremento, devuelve a y luego incrementa en 1.
- `--a`: pre-decremento, decrementa a en 1 y luego devuelve a.
- `a--`: post-decremento, devuelve a y luego decrementa en 1.

Ejemplo:
```java
int a = 1;
int b = ++a;  // a y b valen 2
a = 1;
b = a++; // a vale 2 y b 1
```


## Operador Ternario o Condicional

Es como tal una version abreviada de las sentencias IF-ELSE y utiiza tres oprandos.

(condición) ? valorTrue : valorFalse;

Por ejemplo:

```java
int a = 2 > 3 ? 1 : 2; // a = 2
```

## Operadores Relacionales
Se utilizan para comprobar relaciones como igualdad, mayor que, menor que, etc., y devuelven un resultado booleano.

- `>` mayor que
- `>=` mayor o igual que
- `<` menor que
- `<=` menor o igual que
- `==` igual que
- `!=` distinto que

## Operadores Lógicos

- AND: `&&` o `&`, TRUE si ambos son verdaderos.
- OR: `||`, verdadero si alguno es verdadero.
- NOT: `!`, cambia al opuesto.
- XOR: `^`, cambia al opuesto.

## Precedencia de Operadores
Enumeración de la precedencia, desde la mas alta hasta la mas baja.

![precedencia](https://www.arkaitzgarro.com/java/images/cap04/prioridad.png)
## Operadores de asignación
Se usan para asignar un valor a una variable, por ejemplo: `=`.

## Operadores Unitarios
Invierten el signo del número. Ejemplo: `- * - -> +` y `- * + -> -`.

## Array
Permite guardar datos del mismo tipo. No son dinámicos, por lo que se debe indicar la dimensión.

- OperadoresAritmeticos
- OperadoresAsignacion
- OperadoresUnarios
- OperadoresIncrementales
- OperadoresRelacionales
- OperadoresLógicos
- OperadoresLogicosLogin
- OperadoresLogicosLoginArrays
- OperadorTernario: versión abreviada de un if-else.
- OperadorInstanceOf: permite determinar si una instancia es referencia de un tipo.

Todas las clases derivan de Object, y Double, Integer, Short y Long heredan de Number. Siempre se ve con las clases wrapper, no con los datos primitivos.

# Sección 5: Flujos de Control

## If
Ejecuta un bloque de código si la condición es verdadera, de lo contrario no ejecuta nada.
```java
if(expresion) {
  // ejecuta este bloque
}
```

## If-else
Si la condición no es verdadera, en vez de ejecutar el bloque de código del if, ejecuta el del else.

```java
if(expresion) {
  // ejecuta este bloque si se cumple
} else {
  // ejecuta si no se cumple
}
```


## Switch Case
La sentencia o interruptor se utiliza para realizar sentencias condicionalmente basadas en alguna expresión.

```java
switch(variable) {
  case valor1:
    // ejecuta sentencia1
    break;
  case valor2:
    // ejecuta sentencia2
    break;
  default:
    // si no hay coincidencia, se ejecuta sentencia default
}
```

## While
Ejecuta un bloque de código mientras se cumpla la condición.
```java
while(expresion) {
  // bloque a ejecutar
}
```

## Do while
Similar al while, excepto en que la expresión se evalúa al final del bucle, se ejecuta al menos una vez.
```java
do {
  // bloque a ejecutar
} while(expresion);
```

## For

La sentencia FOR se utiliza cuando se conocen los límites del bucle, su condición de término y su instrucción de incremento/decremento.
```java
for(inicializacion; condicion; incremento) {
  // bloque a ejecutar si cumple condicion
}

// Un ejemplo sería:
for(int i = 0; i > condicion ; i++) {
}
```

## Separadores
Existen caracteres en Java con significado especial, son los SEPARADORES:

- `()` para contener condiciones en sentencias de flujo.
- `{}` para definir bloques de código, definir ámbitos.
- `[]` para declarar arreglos o matrices y referenciar valores dentro de los mismos.
- `;` separa sentencias.
- `.` Separa un nombre de atributo o método de una variable de referencia u objeto.

## Arrays
Son tipos de datos de referencia que contienen varios elementos ordenados, una colección.

Declaración e instanciación
```java
int[] numeros;
int[] numeros2 = new int[3];
Producto[] productos = new Producto[3];
```


Inicialización
```java
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
productos[0] = new Productos("Mesa comedor")
```

Obtener elementos
```java
int num1 = numeros[0];
Producto mesa = productos[0];
```

Declaración, instanciación e inicialización de un array
```java
int[] numeros = {1, 2, 3};
Producto[] productos = {new Producto("Mesa"), new Producto("Televisor"), new Producto("Sofa")};
```

Recorrer array con for
```java
String[] nombres = {"Andres", "Ana", "Agustin"};
for(int i = 0; i < nombres.length; i++) {
    System.out.println("nombre = "+nombres[i]);
}
```

```java
String[] nombres = {"Andres", "Ana", "Agustin"};
for(String nombre: nombres) {
    System.out.println("nombre = " + nombre);
}
```

# Sección 6: Tipos de Datos de Referencia

## Basados en Tipos Primitivos
Cada tipo primitivo

Cada tipo primitivo tiene su equivalente en un tipo de referencia o clase. Estos ofrecen mayor funcionalidad para operaciones de comprobaciones y conversiones.

Tipo Primitivo | Clase Equivalente
--- | ---
`byte` | Byte
`short` | Short
`int` | Integer
`long` | Long
`float` | Float
`double` | Double
`char` | Character
`boolean` | Boolean

## La Clase Integer
Cada tipo numérico tiene su propia clase de objetos. Así el tipo `int` tiene la clase `Integer`. Se implementan varios métodos útiles dentro de la clase envoltorio `Integer`.

```java
Integer i = Integer.valueOf(1234567);
String s = i.toString();
int j = i.intValue();
long l = i.longValue();
float f = i.floatValue();
double d = i.doubleValue();
int k = Integer.parseInt("2147483647");
```

## Constantes de Integer

- `Integer.MIN_VALUE`
- `Integer.MAX_VALUE`

## Métodos Estáticos

- `String Integer.toString(int i, int base)`
- `String Integer.toString(int i)`
- `int Integer.parseInt(String s, int base)`
- `int Integer.parseInt(String s)`
- `Integer Integer.valueOf(String s, int base)`
- `Integer Integer.valueOf(String s)`

## Métodos de la Instancia

- `int intValue()`
- `long longValue()`
- `float floatValue()`
- `double doubleValue()`
- `String toString()`
- `int hashCode()`
- `boolean equals(Object obj)`
- `byte byteValue()`
- `short shortValue()`

### La Clase Long

Cada tipo numérico tiene su propia clase de objetos, así el tipo `long` tiene la clase `Long`. De la misma forma que con la clase `Integer`, se implementan muchas funciones útiles dentro de los métodos de la clase `Long`.

```java
Long l = Long.valueOf(2147483648L);
String s = l.toString();
int i = l.intValue();
long j = l.longValue();
float f = l.floatValue();
double d = l.doubleValue();
long k = Long.parseLong("9223372036854775807");
```

#### Constantes de Long

- `Long.MIN_VALUE`
- `Long.MAX_VALUE`

#### Métodos Estáticos

- `String Long.toString(long l, int base)`
- `String Long.toString(long l)`
- `long L.parseLong(String s, int base)`
- `long L.parseLong(String s)`
- `Long Long.valueOf(String s, int base)`
- `Long Long.valueOf(String s)`

#### Métodos de la Instancia

- `int intValue()`
- `long longValue()`
- `float floatValue()`
- `double doubleValue()`
- `String toString()`
- `int hashCode()`
- `boolean equals(Object obj)`
- `byte byteValue()`
- `short shortValue()`

### La Clase Double

Cada tipo numérico tiene su propia clase de objetos, así el tipo `double` tiene la clase `Double`. De la misma forma que con la clase `Integer` y `Long`, tenemos varias funciones útiles dentro de los métodos de la clase `Double`.

```
javaCopy code
Double d = Double.valueOf(3.14159);
String s = d.toString();
double j = d.doubleValue();
int i = d.intValue();
long l = d.longValue();
float f = d.floatValue();
double k = Double.parseDouble("314.159E-2");
```

#### Constantes de Double

- `Double.MIN_VALUE`
- `Double.MAX_VALUE`
- `Double.POSITIVE_INFINITY`
- `Double.NEGATIVE_INFINITY`

#### Métodos Estáticos

- `Double Double.valueOf(String s)`
- `Double Double.valueOf(double d)`
- `double Double.parseDouble(String s)`
- `String Double.toString(double d)`
- `boolean Double.isNaN(d)`
- `boolean Double.isInfinite(d)`
- `long Double.doubleToLongBits(d)`
- `double Double.longBitsToDouble(l)`

#### Métodos de la Instancia

- `boolean equals(Object o)`
- `String toString()`
- `int intValue()`
- `long longValue()`
- `float floatValue()`
- `double doubleValue()`
- `boolean isNaN()`
- `boolean isInfinite()`
- `byte byteValue()`
- `short shortValue()`

### La Clase Float

De la misma forma que con la clase `Double`, se han codificado varias funciones útiles dentro de los métodos de la clase `Float`.

```
javaCopy code
Float f = Float.valueOf(3.14159F);
String s = f.toString();
double d = f.doubleValue();
int i = f.intValue();
long l = f.longValue();
float j = f.floatValue();
float k = Float.parseFloat("314.159E-2f");
```

### La Clase Character

La clase `Character` también tiene métodos para comprobaciones y conversiones.

```
javaCopy code
Character c = Character.valueOf('A');
String s = c.toString();
char c2 = c.charValue();
char c3 = Character.toLowerCase(c);
boolean b = Character.isDigit(c);
boolean b2 = Character.isAlphabetic(c);
boolean b3 = Character.isUpperCase(c);
boolean b4 = Character.isLowerCase(c);
boolean b5 = Character.isLetter(c);
boolean b6 = Character.isSpaceChar(c);
boolean b7 = Character.isSpaceChar(' ');
boolean b8 = Character.isDigit('7');
```

#### Métodos Estáticos

- Conversiones de caracteres
- `Character Character.valueOf(c)`
- `char Character.toLowerCase(c)`
- `char Character.toUpperCase(c)`
- Comprobaciones booleanas
- `boolean Character.isLowerCase(c)`
- `boolean Character.isUpperCase(c)`
- `boolean Character.isDigit(c)`
- `boolean Character.isSpaceChar(c)`
- `boolean Character.isLetter(c)`
- `boolean Character.isAlphabetic(c)`

#### Métodos de la Instancia

- `String toString()`
- `char charValue()`
- `boolean equals(Object obj)`

### La Clase Boolean

El primitivo `boolean` también tiene su tipo asociado `Boolean`, aunque en este caso hay menos métodos implementados que para el resto de las clases numéricas.

```
javaCopy code
Boolean c = Boolean.valueOf(true);
Boolean c2 = Boolean.valueOf("true");
String s = c.toString();
boolean c3 = c.booleanValue();
```

#### Constantes de Boolean

- `Boolean.TRUE`
- `Boolean.FALSE`

#### Métodos de la Instancia

- `boolean booleanValue()`
- `String toString()`
- `boolean equals(Object obj)`




# Sección 7: Valor vs Referencia

En programación, la diferencia entre pasar por valor y por referencia es crucial.

- **Por Valor**: Los tipos primitivos en Java son pasados por valor. Esto significa que cuando pasas una variable de tipo primitivo a un método, lo que se pasa es una copia del valor. Los cambios realizados en la copia no afectan el valor original.

- **Por Referencia**: Los objetos en Java son pasados por referencia. Esto significa que cuando pasas un objeto a un método, estás pasando una referencia a ese objeto. Los cambios realizados en el objeto dentro del método afectan al objeto original.

```java
public void modifyValues(int value, MyObject obj) {
  value = value * 2; // No afecta al valor original.
  obj.modify();     // Modifica el objeto original.
}
```

# Sección 8: La clase Date y Calendar
Java ofrece dos clases principales para manejar fechas y tiempos: `Date` y `Calendar`.

- **La Clase `Date`**: Representa una fecha y hora en milisegundos desde la época (1 de enero de 1970). Ofrece métodos para comparar, formatear y manipular fechas.
- **La Clase `Calendar`**: Es una clase abstracta que proporciona métodos para obtener y manipular cualquier componente de la fecha y hora. `GregorianCalendar` es una implementación común.

```java
Date date = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(date);
calendar.add(Calendar.DAY_OF_MONTH, 5); // Añadir 5 días.
```

# Sección 9: La clase System
La clase `System` ofrece acceso a funcionalidades relacionadas con el sistema:

- **Propiedades del Sistema**: Permite acceder a las propiedades del sistema como la versión de Java.
- **Entrada y Salida**: Proporciona flujos de entrada y salida estándar.
- **Manipulación de Arrays**: Ofrece métodos para copiar arrays.
- **Tiempo**: Permite obtener el tiempo actual en milisegundos.

```java
String javaVersion = System.getProperty("java.version");
System.arraycopy(src, 0, dest, 0, length);
```

# Sección 10: La clase Math
La clase `Math` incluye una gran cantidad de métodos estáticos para realizar operaciones matemáticas:

- **Aritméticas**: Suma, resta, multiplicación, división.
- **Trigonometría**: Seno, coseno, tangente.
- **Exponenciación y Logaritmos**: Potencias y raíces, logaritmos naturales y en base 10.
- **Redondeo**: Redondeo al entero más cercano, hacia arriba o hacia abajo.
```java
double result1 = Math.sin(Math.PI / 2); // Resultado: 1.0
double result2 = Math.log(10);         // Logaritmo natural de 10.
```

# Sección 11: Linea de Comando
La línea de comando en Java permite la entrada de datos en el momento de la ejecución del programa:

- **Argumentos de Comando**: Se pueden pasar argumentos a través de la línea de comando que el programa luego puede utilizar.
- **Acceso a Argumentos**: Los argumentos se acceden a través del array de strings `args` en el método `main`.
- **Utilización**: Esto permite una gran flexibilidad, permitiendo que un programa se ejecute con diferentes configuraciones sin cambiar el código.

```java
public static void main(String[] args) {
    for (String arg : args) {
        System.out.println(arg);
    }
}
```


# Sección 12: Arreglos
## ¿Qué son los arreglos?

Los arreglos en programación se asocian siempre a un solo tipo de datos.
Son tipos de datos de referencia que contienen varios elementos ordenados, formando una colección. Sus elementos o valores están asociados a una llave o índice y pueden contener tanto tipos de referencia como tipos primitivos.

## Representación

- Comienzan en el índice 0.
- Total de elementos se accede con `length = 10`.

## Ubicación de un Elemento

- Ejemplo: `int 5` se encuentra en el índice 4.

## Declaración e Instanciación

La declaración de un arreglo tiene dos partes:

- El tipo de datos del arreglo seguido de corchetes.
- El nombre de la variable.
- Ejemplo: `int[] numeros;`
- Al crear un arreglo, se utiliza el operador `new`, más el tipo de los elementos, más el número de elementos. Ejemplo: `int[] numeros = new int[3];`
- También puede contener objetos: `Producto[] productos = new Producto[3]; String[] nombres = new String[5];`

## Inicialización de Elementos

- Asignamos elementos mediante la llave o índice:

  ```java
  int[] numeros = new int[3];
  numeros[0] = 1;
  numeros[1] = 2;
  numeros[2] = 3;
  Producto[] productos = new Producto[3];
  productos[0] = new Producto("Mesa Comedor");
  productos[1] = new Producto("TV Sony LED 55");
  productos[2] = new Producto("Bicicleta Oxford");
  String[] nombres = new String[5];
  nombres[0] = "Andres";
  nombres[1] = "Maria";
  nombres[2] = "Jose";
  nombres[3] = "Isabel";
  nombres[4] = "Juan";
  ```



## Obtener Elementos

- Accedemos a los elementos del arreglo mediante la llave o índice:

  ```java
  int num1 = numeros[0];
  Producto mesa = productos[0];
  String nombre1 = nombres[0];
  ```

## Declaración, Instanciación e Inicialización de un Arreglo

- Se usa cuando ya conocemos la cantidad de elementos que va a contener:

  ```java
  int[] numeros = {1 , 2 , 3};
  Producto[] productos = { new Producto("Mesa Comedor"), new Producto("TV Sony LED 55"), new Producto("Bicicleta Oxford") };
  String[] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan" };
  ```

## Recorrer Arreglo Usando `for`

- Ejemplo:

  ```java
  String[] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan"};
  for(int i = 0; i < nombres.length; i++) {
      System.out.println("nombre = " + nombres[i]);
  }
  ```

## Recorrer Arreglo Usando `for each`

- Ejemplo:

  ```java
  String[] nombres = {"Andres", "Maria", "Jose", "Isabel", "Juan"};
  for(String nom: nombres) {
      System.out.println("nombre = " + nom);
  }
  ```

Los arreglos son una estructura de datos fundamental en la programación que permite organizar y manipular colecciones de elementos del mismo tipo.


# Sección 13: Matrices -> Arreglos Bidimensionales

## ¿Qué son las matrices?

Son arreglos bidimensionales. Cada uno de sus elementos puede ser un arreglo en su segunda dimensión.

```java
int[][] matriz;
```

Cuando creamos una matriz, usamos el operador `new`, seguido del tipo de los elementos, y el número de filas y columnas.

```java
int[][] numeros = new int[2][3];
```

Podemos obtener el tamaño de la matriz con el atributo `length` para filas y columnas.

```java
int[][] numeros = new int[2][3];
System.out.println("número de filas: " + numeros.length);
System.out.println("número de columna: " + numeros[0].length);
```

Además de tipos primitivos, las matrices pueden almacenar tipos de referencia, es decir, objetos.

```java
Producto[][] productos = new Producto[2][3];
String[][] nombres = new String[3][5];
```

## Inicialización de elementos

Asignamos elementos a la matriz indicando el índice de la fila y de la columna.

```java
int [][] numeros = new int[2][4];
numeros[0][0] = 1; 
numeros[0][1] = 2; 
numeros[0][2] = 3; 
numeros[0][3] = 4; 
numeros[1][0] = 5; 
numeros[1][1] = 6; 
numeros[1][2] = 7; 
numeros[1][3] = 8; 
```

Ejemplo para matriz de objetos de tipo `Producto`:

```java
Producto[][] productos = new Producto[2][2];

productos[0][0] = new Producto("Mesa comedor");
productos[0][1] = new Producto("TV Sony LED 55");
productos[1][0] = new Producto("Bicicleta Oxford");
productos[1][1] = new Producto("Bicicleta Estática Gimnasio");
```

## Obtener elementos

Accedemos a los elementos de la matriz mediante los índices de la fila y columna.

```java
Producto tvSony = productos[0][1];
```

## Declaración, instanciación e inicialización de una matriz

Se utiliza cuando conocemos los elementos y el tamaño de la matriz.

```java
int[][] numeros = { {1,2,3,4} , {5,6,7,8} };
```

## Recorrer una matriz usando for

```java
String[][] nombres = new String[3][2];
nombres[0][0] = "Pepe";
nombres[0][1] = "María";
nombres[1][0] = "Pato";
nombres[1][1] = "Bea";
nombres[2][0] = "Lucas";
nombres[2][1] = "Luci";

for(int i = 0; i < nombres.length; i++) {
    for(int j = 0; j < nombres[i].length; j++) {
        System.out.println("nombre = " + nombres[i][j]);
    }
}
```


# Sección 14: Poo Clases y Objetos
Los objetos, como concepto, existen fuera de la informática y han estado presentes antes de la programación.

El paradigma de la POO consiste en tomar un objeto de la vida real y llevarlo a la programación.

Los **OBJETOS** son entidades que combinan:

- **Estado**: las propiedades, los atributos, las características.
- **Comportamiento**: los métodos, cómo se relacionan unos con otros.

Una clase es como un molde. Primero, definimos un diseño de cómo va a ser la entidad que queremos crear. De la clase prototipo se crean instancias, los objetos.

```java
public class Automovil { // Declaración de la clase
    // Properties (atributos) representan el estado
    String modelo;
    String color;
    double cilindrada;
    
    // Métodos
    public void acelerar() {}
    public void frenar() {}
}
```

La clase se declara utilizando **UpperCamelCase**.

También se puede representar en un diagrama UML:

```
----------------------
      Automovil
----------------------
-modelo: String
-color: String
-cilindrada: double
----------------------
+acelerar(): void
+frenar(): void
```

## Crear objetos

El operador `new` reserva memoria dinámica para un objeto y se asigna una referencia a ese objeto.

```java
Automovil auto = new Automovil();
```


# Sección 15: Poo Paquetes
## ¿Qué son los paquetes?
Son como un contenedor que nos permite agrupar y organizar nuestras clases!

## Características:
- Agrupan y organizan nuestras clases.
- Además evitan conflictos de nombre entre clases.
- Según modificadores ocultan el acceso a sus clases y/o a sus miembros.

## Estándar en nombres de paquetes
Deben estar escrito completamente en minúscula y los subpackage se separan con un punto.
Típicamente las empresas utilizan la extensión de su dominio (com, org, es, cl, mx) seguido del nombdre dle dominio, ejemplo: com.google, com.fabebook. Si hay más de un proyecto de agrupan:
- com.aguzman.proyectoa
- com.guzman.proyectob
  Y dentro de cada proyecto puedo tener sub paquetes:
- com.aguzman.compras.proyectoa
- com.guzman.ventas.proyectoa

## Definiendo el package en nuestra clase
Utilizamos la palabra reservada `package` seguido del nombre del paquete:
```java
package com.aguzman.datos;
public class Persona {
}
```


# Sección 19 - POO - Herencia y Clases Abstractas

## ¿Qué es una clase abstracta?

Es una clase que representa un concepto genérico o conceptual y, como tal, no debe ser ejemplarizada. Sus métodos también son abstractos, y las clases hijas deben sobrescribirlos.

## Concepto

Es cuando tenemos una jerarquía de clases en que algún comportamiento está presente en todas ellas pero se materializa de formas distintas en cada una.

```java
abstract public class Persona {
    protected Integer id;
    protected String firstName;
    protected String lastName;
    
    abstract public void register();
    
    abstract public void deleted();
}
```

# Sección 20 - POO - Interface

## ¿Qué es una interface?

Una interfaz es una colección de métodos abstractos (sin implementar) y de valores constantes (final) que puede realizar un objeto determinado.

## Concepto

Una interface es como una clase abstracta pero no permite que ninguno de sus métodos estén implementados. Es un tipo de dato de referencia y puede utilizarse como tipo de dato del objeto.

## Ejemplos de interfaces

```java
public interface Imprimible {
    public void imprimir();
}

public class Curriculum implements Imprimible {
    @Override
    public void imprimir() {
        // Debe implementar el método de la interface
    }
}
```

## Herencia múltiple a nivel de interfaces

Una misma clase puede implementar varias interfaces.

```java
public class Perro implements IPuedeSaltar, IPuedeCorrer, IPuedeNadar {
    @Override
    public void saltar() { /* ... */ }
    @Override
    public void correr() { /* ... */ }
    @Override
    public void nadar() { /* ... */ }
}
```

# Sección 23 - Manejo de Excepciones

## ¿Qué son las excepciones?

Una excepción es un problema o evento que ocurre durante la ejecución del programa que interrumpe el flujo normal.

## Características

- Separa el código que gestiona los errores del código principal.
- Nos permite manejar el error y continuar con la ejecución del programa.

## Sintaxis

```java
try {
    // bloque que lanza la excepción
} catch(Exception ex) {
    // aquí manejamos el error
} finally {
    // bloque opcional, siempre se ejecuta
}
```

## La cláusula `THROWS`

```java
public class PersonalizadaException extends Exception { /* ... */ }

public class NoZeroIdException extends Exception { /* ... */ }

public class ClienteRepositorio {
    public Cliente porId(int id) throws Exception {
        if(id ==0) {
            throw new NoZeroIdException("id no puede ser cero");
        }
    }
}

public static void main(String[] args) throws Exception {
    ClienteRepositorio repo = new ClienteRepositorio();
    Cliente cliente = repo.porId(2);
}
```

Los métodos deben capturar o propagar todas las excepciones chequeadas que puedan ser lanzadas dentro de su ámbito. Esto se hace con la cláusula `throws` que lista una o varias excepciones que son lanzadas en el método.


# Sección 23: Api Collection Java (Colleciones)
## ¿Qué son las colecciones?
Las colecciones son para almacenar objetos, agrupar y tienen 2 grandes tipos:
- Collection: List - Set
- Map

## Tipo de agrupaciones
Los Collection es una API para agrupación de objetos y consta de tres tipos: List, Set, y Map.

- Una **LIST** almacenará objetos en una secuencia determinada.
- Un **SET** no permitirá elementos duplicados y no mantiene el orden de sus elementos.
- Los **MAP** (mapas) almacenan información en base a parejas de llaves y valores (como los diccionarios de otros lenguajes).


## Métodos de Collection
- `boolean add(Object)`: agregar un elemento a la colección. Devuelve false si no se pudo agregar.
- `boolean addAll(Collection)`: agregar una colección que se pasa por argumento.
- `void clear()`: Elimina todos los elementos que componen la colección.
- `boolean contains(Object)`: verdadero si la colección contiene el objeto que se pasa como parámetro, utiliza el método equals() para ubicar el objeto.
- `boolean isEmpty()`: verdadero si la colección está vacía, no contiene elementos.
- `Iterator iterator()`: devuelve un objeto Iterator que se puede utilizar para avanzar a través de los elementos.
- `boolean remove(Object)`: elimina un elemento de la colección y devuelve true si se ha conseguido.
- `boolean removeAll(Collection)`: elimina todos los elementos que están contenidos en el argumento. Devuelve true si consigue eliminar cualquiera de ellos.
- `boolean retainAll(Collection)`: mantiene solamente los elementos que están contenidos en el argumento, es lo que sería una intersección en la teoría de conjuntos. Devuelve verdadero en caso de que se produzca algún cambio.
- `int size()`: devuelve el número de elementos que componen la colección.
- `Object[] toArray()`
- `addFirst()`, `addLast()`, `getFirst()`, `getLast()`, `removeFirst()`, `removeLast()`: que no están definidos en ningún interfaz o clase base y permiten utilizar la Lista Enlazada como una Pila y una Cola.
- `getFirst()`, `getLast()`, `removeFirst()`, `removeLast()`: lanzan NoSuchElementException si la lista está vacía.

# Sección 24: Hilos y Concurrencia

## ¿Qué son?
Los hilos son objetos que dan la capacidad de hacer más de una tarea al mismo tiempo. Pueden trabajar de forma paralela (CPU Multi-Core) o concurrente (CPU de un solo Core).

## Características
- La JVM es un sistema multi-thread, capaz de ejecutar varias tareas (o subprogramas) simultáneamente.
- Java soporta Thread con algunas clases, interfaces y métodos específicos en la clase Object.
- La JVM gestiona todos los detalles, asignación de tiempos de ejecución, prioridades, de forma similar a como gestiona un S.O. (Sist. Oper.).

## ¿Cómo crearlos?
- Extender de la clase Thread de Java.
- Utilizar el método `.start()` en una nueva instancia de `CalculoThread()`.

## Ciclo de vida de un Thread
1. **NEW**: Un hilo NEW es uno que se ha creado pero que aún no se ha iniciado con el método `start()`.
2. **RUNNABLE**: Un hilo runnable es uno que se ha creado e iniciado con el `start()`.
3. **BLOCKED**: Un hilo está bloqueado cuando actualmente no es elegible para ejecutarse.
4. **WAITING**: Un hilo está en estado WAITING cuando está esperando que otro hilo realice una acción en particular.
5. **TERMINATED**: Este es el estado de un hilo muerto. Está en el estado TERMINATED cuando ha finalizado la ejecución o se terminó de forma anormal.

## Métodos wait(), notify(), notifyAll()
- La clase Object tiene 3 métodos que permiten que los hilos se sincronicen y comuniquen sobre el estado bloqueado de un recurso.

## Método sleep()
- `Thread.sleep()` envía el hilo actual al estado TIME_WAITING durante algún tiempo.


# Sección 25: Expresiones Lambda
Las expresiones lambda en Java proporcionan una forma concisa y funcional de escribir código. A continuación, se describen algunas de las interfaces funcionales más comunes junto con los conceptos relacionados con los streams.

## Supplier
**Devuelve un valor.**
Ejemplo:
```java
// Modo más extenso
Supplier<String> proveedor1 = () -> {
    return "Hola mundo lambda supplier - versión extensa -";
};
System.out.println(proveedor1.get());

// Modo simplificado:
Supplier<String> proveedor2 = () -> "Hola mundo lambda supplier - versión simplificada -";
System.out.println(proveedor2.get());
```

## Consumer

Es una expresión lambda que permite pasar por argumento un solo parámetro (del tipo del genérico). Se le puede implementar alguna función a lo que se pasa por parámetro. Es un método VOID, sin return. Utilizado principalmente para operaciones de consumo, como procesar o imprimir un valor.

- **es un CONSUMIDOR del PARÁMETRO del MÉTODO**
- **una EXPRESIÓN LAMBDA se traduce a una INTERFAZ FUNCIONAL**

```java
Consumer<String> imprimir = str -> System.out.println(str);
imprimir.accept("Texto a imprimir");
```

## Biconsumer

Tiene 2 argumentos, similar a Consumer, pero acepta dos parámetros en lugar de uno. Permite realizar acciones con dos entradas.

```java
BiConsumer<String, String> concatenarYImprimir = (a, b) -> System.out.println(a + b);
concatenarYImprimir.accept("Hola, ", "mundo!");
```

## Predicate

Siempre devuelve BOOLEAN. Utilizado para evaluar una condición sobre un objeto.

Ejemplo:

```java
Predicate<Integer> test = num -> num > 10;
boolean resultado = test.test(7);
System.out.println("resultado de 7 > 10 => " + resultado);
```

## BiPredicate

Expresiones booleanas en expresiones lambda. Similar al Predicate, pero recibe 2 parámetros. Ideal para comparaciones o condiciones que involucran dos objetos.

```java
BiPredicate<Integer, Integer> esMayor = (a, b) -> a > b;
System.out.println(esMayor.test(5, 3)); // Devuelve true
```

## Function

Combinación entre el Consumer (que recibe un argumento) y el Supplier (que retorna/devuelve algún resultado). Puede ser usado para transformar un objeto en otro.

```java
Function<String, Integer> obtenerLongitud = str -> str.length();
System.out.println(obtenerLongitud.apply("Ejemplo")); // Devuelve 7
```

## BiFunction

Recibe dos argumentos y tiene return. Similar a Function pero acepta dos parámetros.

```java
BiFunction<Integer, Integer, String> sumarYConvertir = (a, b) -> Integer.toString(a + b);
System.out.println(sumarYConvertir.apply(2, 3)); // Devuelve "5"
```

## Api Stream

## ¿Qué son los streams?

Combina las mejores ideas del **Iterator** y la programación funcional para **implementar flujos de datos**.

- **Una secuencia de elementos**, que provienen de una fuente de datos (List, Set, interfaz Collection o un Array). A cada elemento se le realiza una operación.
- **Es como una tubería de agua.**
- **El orden de los elementos se mantiene.**
- **No sirve para guardar datos**, sino para tratarlos, es como un canal de entrada y salida.

## Características

- **Crea flujos continuos** que contiene operadores para procesar secuencias de elementos.
- **Los operadores reducen las tareas de transformaciones.**
- **Transforma y compone flujos con los operadores**: map, filter, concat, distinct, flatmap, sorted, foreach, reduce, etc.
- **Pueden ser creados desde listas, arreglos, rangos.**
- **Son inmutables.**
- **Concurrencia hecho fácil.**

```java
List<String> lista = Arrays.asList("a", "b", "c");
Stream<String> stream = lista.stream();
stream.forEach(elemento -> System.out.println(elemento));
```

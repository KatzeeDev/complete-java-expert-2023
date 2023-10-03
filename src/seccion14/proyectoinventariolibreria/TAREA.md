# Proyecto Inventario Libreria

La tarea es crear un proyecto nuevo llamado ProyectoInventarioLibreria de la siguiente manera:

1. Se requiere crear la clase VentaLibros con los siguientes campos privados: 
   * identificador tipo Integer autoincremental
   * nota String, 
   * fecha tipo Date, 
   * lector del tipo Lector
   * un atributo de tipo arreglo de libros con 3 elementos: Libro[] libros.


2. la clase VentaLibros, crear un constructor que inicialice solo la nota.

3. En la clase VentaLibros, crear métodos getter para todos los atributos.

4. En la clase VentaLibros, implementar solo métodos set para lector y fecha.

5. Respecto a los libros de la clase VentaLibros, solo se pueden agregar usando el método public void addLibro(Libro libro), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.

6. La clase VentaLibros debe tener un método que devuelva el gran total, sumando los precios de los libros.

7. Crear la clase Libro con tres atributos:
   * editorial tipo String
   * titulo String
   * precio int. 

8. Inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

9. Crear la clase Lector con dos atributos: nombre y apellido. 
10. Inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.

11. Escribir un programa, clase con método main, la cual llamaremos EjemploVentas:

12. Crear tres ventas de libros, con sus respectivos valores, el lector, agregar los tres libros a cada una, cada venta con distintos libros, que no se repitan.

13. Para cada una, imprimir sus valores en consola usando método getter incluyendo los libros, donde con el método getter obtenemos el arreglo de libros y con un foreach recorremos e imprimimos sus atributos editorial, titulo y precio. Tener en cuenta en la salida el gran total de cada venta, los lectores, todo.
# Tipos de datos, variables

Que es una variable: espacio en memoria que utilizamos para almacenar datos.
Tipos de datos: 
- int -> números enteros - 14
- String -> texto dentro de comillas dobles "text"
- Float -> números flotantes - 2.12f
- char -> texto dentro de comillas simples 'text'
- double -> números decimales - 3.14
- boolean -> lógico (verdadero / falso)

# Operadores
- aritméticos -> (+, -, *, /, %)
- relacionales -> (=, >=, !=, <, >)
- lógicos -> AND, NOT, OR
  - AND -> 
# Estructuras de control
Sirven para **tomar** deciciones
- Estructuras de control -> condicionales
  - if
  - else
  - switch 
  - 
Bucles
  - while
  - do-while
  - for 
  - forEach
## if, else if, else

~~~java
// permite tomar decisiones basadas en condiciones
    if(condicion){
        //código si la condición es verdadera
    }else{
        // si la condición no se cumple
    }
    
    
    if(condicion){
        //código si la condición es verdadera
    }else if(condicion){
        //codigo si la otra condición es verdadera
    }else{
        //código si ninguna de las anteriores es verdadera
    }
~~~
## Switch
~~~java
// Alternativa a múltiples else-if
        // uso cotidiano -> menús de opciones, rellenar un array, etc...
        
        switch (variable){
            case 1: 
                //código
                break;
            case 2:
                //código
                break;
            default:
                //código si no coincide ningun caso
        }
~~~

### Ejercicio en clase
Una cafetería tiene un sistema en la web. Dicho sistema tiene un menú. 
Las opciones del menú son las siguientes:
1. Café "Ok, ya le preparamos su Café"
2. Coca Cola "Ok, ya le preparamos su Coca Cola"
3. Pastel "Ok, ya le preparamos su Pastel"
4. Rosquilla "Ok, ya le preparamos su Rosquilla"

Si el cliente ingresa una opción diferente de las anteriores, el sistema debe mostrar el siguiente mensaje.
"Opción no válida."

Requisitos.
- Utilizar switch
- Utilizar Scanner para preguntarle al cliente que opción del menú desea.

## Tarea para el Lunes 
Una biblioteca maneja un sistema de Libros, cada libro está organizado en una sección específica.
Las secciones son:
- Terror
- Romance
- Poesía
- Novela
- Comics
- Historia
- Comedias
- Mangas
- Cuentos

El sistema normalmente le pregunta al usuario lo siguiente: 
"En que sección se encuentra el libro que quieres hoy?"
Y le muestra que sección eligió, por ejemplo "Tu libro está en la sección de terror, ya voy por el."
Si elige una sección no válida el mensaje es "Sección no disponible en esta Biblioteca."

Requisitos
- Usar switch
- Usar Scanner
- Pueden hacerlo con int o con String y de ambas maneras deben mostrar exactamente lo mismo.

## Bucles
Nos sirven para **repetir** acciones en el programa.
- For -> se usa cuando sabemos el número de iteracciones (++, --)
- While -> ejecutar una condición mientras sea verdadera
~~~java
//Sintaxis
        while(condicion){
            //Código que se ejecuta mientras la condición sea verdadera
        }
~~~
- Do While -> parecido al while, pero este se ejecuta al menos una vez
- ForEach -> Recorrer arrays.

## Tarea de While
Ingresar edad y mostrar promedio.
1. Pedir al usuario que ingrese las edades de sus familiares que sean mayores de edad, una a la vez.
2. El bucle debe parar cuando el usuario ingrese una edad menor a 18.
3. Mostrar en consola el promedio de las edades ingresadas por el usuario.

# Tarea con Math
Realizar 10 operaciones diferentes para un solo número.
Pero si son operaciones que necesitan más de 1 variable o número, pueden inventarse el segundo número.
El número es:
- David 965 como entero y 2567.56 como decimal
- Paola 359 como entero y 19035.34 como decimal

5 operaciones con el entero y 5 con el decimal.

Para todas imprimirlas en pantalla con soutv

https://docs.oracle.com/en/java/javase/17/docs/api/index.html -> documentación java

# Operador ternario 
condicion ? valor_si_es_verdadero : valor_si_es_falso; -> estructura
int nombreVariable = condicion ? valor_si_es_verdadero : valor_si_es_falso; -> almacenamos el resultado en una variable
## Do While
~~~java
do{
//código a ejecutar y este se ejecuta al menos una vez.
}while(condicion);
~~~
## For
~~~java
for (declarar o declarar e inicializar; condicion ; decremento o incremento) {
            //código  que se va a repetir mientras la condición sea verdadera.
        }
~~~
# Primer prueba técnica: 📝 Consigna: Sistema simple de seguimiento de hábitos
Crea un programa en Java que simule un sistema básico de seguimiento de hábitos diarios. El programa debe permitir al usuario:
1. Ingresar su nombre y edad usando Scanner.
2. Mostrar un menú con opciones:
   1. Registrar hábito
   2. Ver estado del día
   3. Salir
3. Si elige 1, se le debe preguntar:
   * Cuántos vasos de agua ha tomado hoy (número entero).
   * Cuántos minutos ha hecho ejercicio (número entero).
   * Cuántas horas ha dormido (número entero).
   * Luego, almacenar estos datos en variables.
4. Si elige 2, el programa debe:
* Usar condiciones if, else if, else para mostrar mensajes según los datos registrados:
  * Agua: si tomó menos de 4 vasos, decir "Debes hidratarte más".
  * Ejercicio: si hizo menos de 30 minutos, decir "Intenta moverte un poco más".
  * Sueño: si durmió menos de 7 horas, decir "Tu cuerpo necesita más descanso".

* También usar un switch para mostrar un mensaje según la edad del usuario:
  * Menor de 18: "Aún estás creciendo, cuida tus hábitos."
  * Entre 18 y 60: "Mantén tu bienestar con constancia."
  * Mayor de 60: "Recuerda hacer chequeos regulares de salud."
5. El programa debe seguir mostrando el menú hasta que el usuario elija salir (opción 3), usando un ciclo do-while.
6. Dentro del menú, muestra los números del 1 al 3 usando un bucle for.

### Condiciones del ejercicio
1. Usar al menos:
   * 3 tipos de datos (String, int, boolean, etc.)
   * 2 estructuras de control (if-else, switch)
   * 3 tipos de bucle (while, do-while, for)
   * Operadores (<, >, ==, &&, ||, +, etc.)
2. Validar la entrada para que el menú solo acepte valores entre 1 y 3 usando while.
3. Comentar el código donde creas necesario.
## Ejercicio tienda
Estás desarrollando una app para una tienda. Debes guardar la siguiente información:

* El nombre del producto
* Su precio
* La cantidad disponible en inventario
* El impuesto fijo del 19%

Crea una clase llamada ProductoTienda que contenga un método main donde declares:

1. Una variable nombreProducto tipo String con el valor "Laptop Asus".
2. Una variable precio tipo double con el valor 2800000.
3. Una variable cantidadEnStock tipo int con valor 15.
4. Una constante IMPUESTO tipo double con valor 0.19.

# Repaso semana
1. Estructuras de control -> permiten decidir que hacer y cuando hacerlo. (if, else if, else, switch).

* if -> cuando la condicion es verdadera
* else -> cuando la condicion no se cumple (lo contrario)
* else if -> si no se cumple la primera condicion (if) - debe ser verdadera tambien 
* switch -> evalúa una expresión y ejecuta el bloque de código asociado al case que coincide.

2. Bucles -> permite repetir acciones teniendo en cuenta condiciones (for, forEach, while, do while)

* for -> repite un bloque de código un número determinado de veces
* while -> repite el bloque de código mientras la condición sea verdadera
* do while -> igual que while, pero garantiza que se va a ejecutar al menos 1 vez.

---
# Array
Es una estructura que almacena múltiples valores del mismo tipo de dato en una sola variable.

* su índice comienza desde 0.

* Tipos de array:
  * Array unidimensional (vectores): solo podemos almacenar en filas o en columnas
  * Array bidimensional (matriz): podemos almacenar en filas y columnas


# Ejercicios de práctica semanal
## Estructuras de control
Estás programando un sistema para verificar los pagos de servicios de un conjunto residencial.

Crea una clase llamada PagosServicios.
Declara un arreglo (String[]) con los nombres de 5 residentes.
Declara un arreglo (double[]) con los montos que deben pagar.
Usa un for para recorrer los nombres y montos.
Por cada residente:

Si debe más de 200000, imprime: "Pago pendiente alto"
Si debe entre 50000 y 200000, imprime: "Pago pendiente medio"
Si debe menos de 50000, imprime: "Pago pendiente bajo"
Al final, imprime cuántos pagos están pendientes (cuenta total).

## Casteo
En una empresa de logística, los empleados tienen un bono mensual que se calcula como un porcentaje (float) del sueldo base (double). Por políticas del sistema, el bono debe mostrarse como un número entero.

Crea una clase Empleado con atributos nombre, sueldoBase (double) y bonoPorcentaje (float).
Calcula el bono como: sueldoBase * bonoPorcentaje / 100.
Convierte ese bono a int y muéstralo junto con el nombre del empleado.
Usa un ejemplo en el método main.

## Array
Declara una matriz bidimensional de tipo boolean de 3 filas y 4 columnas que represente los asientos (true si está ocupado, false si está libre).
Marca los siguientes asientos como ocupados: (0,1), (1,3), (2,2).
Recorre toda la matriz e imprime el estado de cada asiento con el formato:
Asiento [i][j]: Ocupado o Asiento [i][j]: Libre

# forEach
~~~java
for (tipoDeDato variable : array){
            //código
        }
~~~

# POO
Organiza el código en torno a objetos.
- clases -> una fabrica para crear objetos, tiene atributos y metodos
- objetos -> una instancia de una clase, hereda los atributos y metodos de la clase.
- encapsulamiento
- herencia
- polimorfismo
- abstracción

Las clases tienen además de atributos y métodos, constructores, getter y setter
- constructor -> método especial de una clase que se ejecuta automáticamente (nos sirve para darle valores iniciales a los atributos de un objeto)

## Tareas
1. Crear una Heladería la cual tenga 5 tipos de helado diferentes
2. Cada helado debe tener su propio precio, nombre, calificación de 1 a 5 (1 malo 5 muy bueno)
3. Imprimir en consola cada tipo de helado (5).
4. 3 de esos helados deben poder correr.

## Ejercicio Array Bidimensional
🧩 Consigna: Registro de notas de estudiantes
Crea un programa en Java que:

1. Utilice un array bidimensional para almacenar las notas de 4 estudiantes en 3 materias.
2. Las notas deben ingresarse manualmente o estar predefinidas como valores fijos.

El programa debe:

* Mostrar todas las notas en forma de tabla.
* Calcular y mostrar el promedio de cada estudiante.
* Calcular y mostrar el promedio de cada materia.
* Decir cuál fue el estudiante con mejor promedio.
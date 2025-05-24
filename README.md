# Semana 1
## Día 1: Tipos de datos, variables y operadores

Que es una variable: espacio en memoria que utilizamos para almacenar datos.
Tipos de datos: 
- int -> números enteros - 14
- String -> texto dentro de comillas dobles "text"
- Float -> números flotantes - 2.12f
- char -> texto dentro de comillas simples 'text'
- double -> números decimales - 3.14
- boolean -> lógico (verdadero / falso)

Operadores
- aritméticos -> (+, -, *, /, %)
- relacionales -> (=, >=, !=, <, >)
- lógicos -> AND, NOT, OR
  - AND -> 
## Día 2: Estructuras de control
Sirven para **tomar** deciciones
- Estructuras de control -> condicionales
  - if
  - else
  - switch
- Bucles
  - while
  - do-while
  - for 
    - forEach
### if, else if, else

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
### Switch
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

## Dia 3: Bucles
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

### Tarea de While
Ingresar edad y mostrar promedio.
1. Pedir al usuario que ingrese las edades de sus familiares que sean mayores de edad, una a la vez.
2. El bucle debe parar cuando el usuario ingrese una edad menor a 18.
3. Mostrar en consola el promedio de las edades ingresadas por el usuario.

### Tarea con Math
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
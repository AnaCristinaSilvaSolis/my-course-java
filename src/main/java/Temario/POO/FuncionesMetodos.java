package Temario.POO;

public class FuncionesMetodos {
    //aquí van los métodos o funciones

   /* //metodo con parametros
    public static tipoDeDato nombreDeLaFuncion(parametros){
    }

    //metodos sin parametros
    public static void nombreDeLaFuncion(){
    }

    //metodos que no retorna un valor
    public static void nombreDeLaFuncion(parametro){
    }*/

    //-------------------------------
    //metodo con parametros
    public static int sumar (int numero1, int numero2) {
        return numero1 + numero2;
    }

    //metodos con void pero con parametros
    public static void saludar(String nombre, int edad, double salario){
        System.out.println("Hola, " + nombre + " tienes " + edad + " años y ganas $" + salario + " pesos.");
    }

    //metodos con void sin parametro
    public static void mensajeBienvenida(){
        System.out.println("Hola, bienvenido a la aplicación.");
    }

    public static void main(String[] args) {
        //métodos -> bloques de codigo que ejecuta tarea.
        //pueden o no recibir parametros
        // pueden o no devolvernos algo
        //si no devuelve nada se usa void como tipo de dato
        //todas las funciones o métodos van dentro de una clase en java, pero, fuera del main
        //se declaran o crean fuera del main y se llaman dentro del main

        //----------------------------------------------------------------
        //forma 1 de llamar la función
        int resultado = sumar(2,6);
        /*System.out.println(resultado); //imprime 8*/

        //forma 2 de llamar la función
       /* System.out.println(sumar(30, 20)); //imprime 50*/

        //uso de saludar
        saludar("David", 21, 5000000);
        saludar("Paola", 23, 5000000);
        saludar("Paola", 23, 5000000);
        saludar("Paola", 23, 5000000);

        //uso del mensaje de bienvenida
        mensajeBienvenida();
        mensajeBienvenida();
        mensajeBienvenida();
        mensajeBienvenida();

    }
}

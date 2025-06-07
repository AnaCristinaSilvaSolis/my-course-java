package Temario.java_basico;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {

        // Imprimir números del 1 al 10
        /*int numero = 1;
        while(numero <= 10){
            System.out.println("numero = " + numero);
            numero++; // -> Incrementar
        }*/

        // Imprimir días de la semana
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        /*int numeroDia = 0;
        while(numeroDia < diasSemana.length ){
            System.out.println(diasSemana[numeroDia]);
            numeroDia++;
        }*/

        // Imprimir los números del 10 al 1
        /*int number = 10; //desde donde arrancamos

        while(number >= 1){ //el 1 es el final
            System.out.println("number = " + number);
            number--; //-> Decrementar
        }*/

        // while con Scanner
        //Pedir un numero al usuario
        //cuando el usuario ingrese un 0, el bucle se detiene
        // mostrar en consola la suma total de los numeros ingresados, sin contar el cero.

        Scanner teclado = new Scanner(System.in); //Permite que el usuario ingrese datos en consola.
        int numero;
        int suma = 0;

        System.out.println("Señor usuario, ingrese todos los número de su preferencia, uno a la vez.");

        while(true){
            numero = teclado.nextInt();
            System.out.println("Número ingresado: " + numero);

            if(numero == 0){
                break; //termina el bucle si el número es cero
            }

            //suma += numero;
            suma = suma + numero; //acumula los números
        }

        System.out.println("la suma total de los números ingresados es: " + suma);
        teclado.close();





    }
}

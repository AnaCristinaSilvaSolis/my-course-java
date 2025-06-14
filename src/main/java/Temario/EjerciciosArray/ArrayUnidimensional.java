package Temario.EjerciciosArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        //1. Crear un Array de 5 nombres de personas e imprimirlos en pantalla con un for.
        String[] nombresPersonas = {"Paola", "David", "Ana", "Juanchito", "Pedro"};

        for (int i = 0; i < nombresPersonas.length; i++) {
            System.out.println("En la posición: " + i + " El nombre de la persona es: " + nombresPersonas[i]);
        }

        //2. Crear un array de números enteros, sumarlos e imprimir el resultado final.
        int[] numerosEnteros = {6, 5, 22, 40, 28, 8, 10, 15};
        int suma = 0;

        for (int i = 0; i < numerosEnteros.length; i++) {
            suma += numerosEnteros[i];
        }

        System.out.println(suma);

        //3. Crear un array con dos números secretos, luego, pedir al usuario que escriba un número por consola
        // y verificar si ese número pertenece a uno de los dos números secretos. (usar un bucle para buscar)
        Scanner teclado = new Scanner(System.in);

        int[] numerosSecretos = {9, 2, 10, 50, 700, 20, 1};

        boolean encontrado = false;

       /* while (!encontrado){
            System.out.println("Hola, ingresa el número que crees que es secreto: ");
            int numeroIngresado = teclado.nextInt();

            for (int i = 0; i < numerosSecretos.length; i++) {
                if (numerosSecretos[i] == numeroIngresado){
                    encontrado = true;
                    break;
                }
            }
            if (encontrado){
                System.out.println("El número " + numeroIngresado + " SI es uno de los números secretos.");
            }else{
                System.out.println("El número " + numeroIngresado + " NO es uno de los números secretos, intentalo nuevamente.");
            }
        }*/
teclado.close();




        //------------------------------------------------------
        boolean[] array1 = {true, false, false};
        boolean[] array2 = {true, true, false};

        if (Arrays.equals(array1, array2)){
            System.out.println("Es igual");
        }else{
            System.out.println("No es igual");
        }


    }
}

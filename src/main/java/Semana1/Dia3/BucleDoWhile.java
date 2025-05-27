package Semana1.Dia3;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        //Ingresar la edad al menos una vez hasta que sea válida.
        Scanner teclado = new Scanner(System.in);

        int edad; //declaramos

        do{
            System.out.println("Ingresa tu edad: ");
            edad = teclado.nextInt(); //inicializar
        }while(edad > 5);

        // Imprimir los números del 1 al 10
        int numero = 1; //declaramos e inicializamos

        do{
            System.out.println("numero: " + numero);
            numero++;
        }while(numero <= 10);

        //Imprimir los números del 300 al 799
        int numero2 = 300; //declaramos e inicializamos
        do {
            System.out.println("numero = " + numero2);
            numero2++;
        }while(numero2 <= 799);
    }
}

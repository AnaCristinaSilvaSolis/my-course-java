package Temario;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //-> está siempre es y será la estructura

        int edad = 0;

        // if
        if(edad == 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

        //else if
        if(edad >= 18){
            System.out.println("Ya tienes cédula");
        } else if (edad >= 19) {
            System.out.println("Ok, puedes salir.");
        }else{
            System.out.println("No eres mayor de edad y por ende no sales.");
        }

        //Scanner
        System.out.println("¿Cuantos dedos tienes?");
        int respuestaUsuario = teclado.nextInt(); //-> Leer un número entero

        if (respuestaUsuario >= 4){
            System.out.println("Estas casi completa");
        } else if (respuestaUsuario < 1) {
            System.out.println("Oye!, ve al médico");
        } else if (respuestaUsuario == 2) {
            System.out.println("Te falta 3 para llegar a 5");
        }else{
            System.out.println("Mmmmmm, bueno.");
        }

        teclado.close(); //-> Cerrar el scanner (buena práctica)
    }

}

package EjerciciosEnClase;

import java.util.Scanner;

public class Cafeteria {
    public static void main(String[] args) {
        //1. Instanciamos el Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenidos a la Cafetería Paola");
        System.out.println("1. Café");
        System.out.println("2. Coca Cola");
        System.out.println("3. Pastel");
        System.out.println("4. Rosquilla");

        //2. Preguntamos
        System.out.println("¿Que desea hoy?");
        int respuestaUsuario = teclado.nextInt(); //3. Leemos

        //4. trabajammos con la respuesta
        switch (respuestaUsuario){
            case 1:
                System.out.println("Ok, ya le preparamos su Café");
                break;
            case 2:
                System.out.println("Ok, ya le preparamos su Coca Cola");
                break;
            case 3:
                System.out.println("Ok, ya le preparamos su Pastel");
                break;
            case 4:
                System.out.println("Ok, ya le preparamos su Rosquilla");
                break;
            default:
                System.out.println("Opción no válida.");
        }

    }
}

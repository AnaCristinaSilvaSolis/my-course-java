package Temario.java_basico;

import java.util.Scanner;

public class RepasoSemanaEstructuraControl {
    public static void main(String[] args) {
        //Una aplicación evalúa el rol de los usuarios que ingresan a la misma.
        // 1. ADMINISTRADOR
        // 2. CLIENTE
        // 3. USUARIO NUEVO
        //Imprimir en pantalla el tipo de rol ingresado.
        //_______________________________________________________________
        Scanner teclado = new Scanner(System.in);

        //Variables
        int rol;

        System.out.println("Por favor, ingresa el número de tu respectivo rol. (1, 2 o 3)");
        rol = teclado.nextInt();

        // if

        if (rol == 1){
            System.out.println("ADMINISTRADOR");
        } else if (rol == 2) {
            System.out.println("CLIENTE");
        } else{
            System.out.println("CLIENTE NUEVO");
        }
        rol = 2;

        // switch
        switch (rol){
            case 1:
                System.out.println("ADMINISTRADOR");
                break;
            case 2:
                System.out.println("CLIENTE");
                break;
            default:
                System.out.println("CLIENTE NUEVO");
        }





    }
}

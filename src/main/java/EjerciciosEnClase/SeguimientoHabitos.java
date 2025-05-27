package EjerciciosEnClase;

import java.util.Scanner;

public class SeguimientoHabitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Declarar variables
        String nombre;
        int edad;
        int vasosDeAgua;
        int minutosEjercicio;
        int horasDormido;
        int opcion;

        //1. Preguntar por nombre y edad
        System.out.println("¿Cuál es tú nombre?: ");
        nombre = teclado.nextLine();

        System.out.println("¿Cúal es tú edad?: ");
        edad = teclado.nextInt();

        //2. Mostrar menú de opciones con for
        // (1. Registrar hábito, 2. Ver estado del día, 3. Salir)
        System.out.println("******************MENÚ DE OPCIONES*********************");
        for (int opcionesMenu = 1; opcionesMenu <= 3; opcionesMenu++) {
            switch (opcionesMenu){
                case 1:
                    System.out.println("1. Registrar hábito");
                case 2:
                    System.out.println("2. Ver estado del día");
                case 3:
                    System.out.println("3. Salir");
            }
        }

        // Preguntar por una opción
        System.out.println("Por favor, selecciona una de las opciones (1-3). ");
        opcion = teclado.nextInt();

        //Validar opción
        while(opcion < 1 || opcion > 3){
            System.out.println("Opción inválida, intenta nuevamente (1-3). ");
            opcion = teclado.nextInt();
        }

        //3. Preguntar por vasos, horas de sueño y minutos de ejercicio.
        switch (opcion){
            case 1: System.out.println("¿Cuántos vasos de agua ha tomado hoy?: ");
            vasosDeAgua = teclado.nextInt();

            case 2: System.out.println("¿Cuántos minutos ha hecho ejercicio?: ");
            minutosEjercicio = teclado.nextInt();

            case 3:  System.out.println("¿Cuántas horas ha dormido?: ");
            horasDormido = teclado.nextInt();
        }







    }
}

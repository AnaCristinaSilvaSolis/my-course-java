package Temario;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //----------------------sintáxis unidimensional-------------------------
        //1. Crear e inicializar un array
        double[] notasEstudiantes = {2.1, 5.0, 4.5, 2.0, 0.0, 1.0, 9.0}; //declaramos e inicializamos

        System.out.println("Indice 6 antes de modificarlo: " + notasEstudiantes[6]);

        //2. trabajar con el: acceder a cada elemento dentro del array
        /*System.out.println("Tu nota es: " + notasEstudiantes[0]); //dentro de las [] va el índice
        System.out.println("Tu nota es: " + notasEstudiantes[1]); //dentro de las [] va el índice
        System.out.println("Tu nota es: " + notasEstudiantes[2]); //dentro de las [] va el índice
        System.out.println("Tu nota es: " + notasEstudiantes[3]); //dentro de las [] va el índice
        System.out.println("Tu nota es: " + notasEstudiantes[4]); //dentro de las [] va el índice
        System.out.println("Tu nota es: " + notasEstudiantes[5]); //dentro de las [] va el índice*/

        //recorrer con for

        /*for (int i = 0; i < notasEstudiantes.length; i++) {
            System.out.println("Tu nota desde dentro del for: " + notasEstudiantes[i]);
        }*/

        //3. trabajar con el: modificar elementos dentro del array
        notasEstudiantes[6] = 1.0;
        System.out.println("Indice 6 despues de la modificación: " + notasEstudiantes[6]);

        notasEstudiantes[6] = 2.0;


        //-----------------bidimensional-------------------------
        //int[][] edades = new int[filas][columnas];

        String[][] asientos = {
                {"OCUPADO", "LIBRE","OCUPADO", "LIBRE"},
                {"LIBRE", "OCUPADO"},
                {"OCUPADO", "LIBRE", "OCUPADO"}
        };

        System.out.println(asientos[1][1]);



    }
}

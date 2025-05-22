package EjerciciosEnClase;

import java.util.Scanner;

public class PromedioEdades {
    public static void main(String[] args) {
        //1. Instanciar Scanner
        Scanner teclado = new Scanner(System.in);
        int edad;
        int suma = 0;
        int contador = 0;


        //formula promedio -> suma total / cantidad de datos
        // 18
        // 20
        // 30
        // suma = 68
        // contador = 3

        //2. Preguntarle a el usuario
        System.out.println("Ingresa las edades de tus familiares que sean mayores de edad, por favor una a la vez.");

        //3. Leer la información entregada por el usuario
        System.out.println("Edad: ");
        edad = teclado.nextInt();

        //4. Trabajar con la información
        while (edad >= 18){
            suma = suma + edad; //acumular el total de edades
            contador++; //acumular la cantidad de edades

            System.out.println("Edad: ");
            edad = teclado.nextInt();
        }

        // Promedio
        if(contador > 0){
            /*double promedio = (double) suma / contador; */
            double promedio = suma / contador;
            System.out.println("El promedio de las edades es: " + promedio);
        }else{
            System.out.println("No se ingresaron edades válidas mayores a 18.");
        }
        
        //5. Cerrar el scanner
        teclado.close();


    }
}

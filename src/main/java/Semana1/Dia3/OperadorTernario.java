package Semana1.Dia3;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Es mayor de edad?
        int edad = 10;
        String resultado = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(resultado);

        //como sería con el else-if
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("Es menor de edad");
        }

        //Ejercicio - pasar este condicional if-else a operador ternario.
        int nota = 4;
        if (nota >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobado");
        }

        String resultados = (nota >= 5) ? "Aprobado" : "No aprobado";
        System.out.println("Resultados: "  + resultados);

        // Verificar usando operador ternario, si un numero es par o impar
        // formula para saber si el numero es par -> (numero % 2 == 0)

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = teclado.nextInt();

        String resultadoParImpar = numero % 2 == 0 ? "Par" : "Impar";
        System.out.println("resultadoParImpar = " + resultadoParImpar);

    }
}

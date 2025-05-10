package Semana1.Dia1;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 30;

        //aritméticos
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(division);
        System.out.println(modulo);

        //relacionales
        boolean mayorQue = numero1 > numero2;
        boolean distinto = numero1 != numero2;
        boolean mayorOIgual = numero1 >= numero2;
        System.out.println(mayorQue);
        System.out.println(distinto);
        System.out.println(mayorOIgual);

        // lógicos
        // AND
        int edad = 10;
        boolean noTieneClasesHoy = false;

        if(edad >= 18 && noTieneClasesHoy == true){
            System.out.println("Puedes entrar a la fiesta.");
        }

        // OR
        if(edad >= 18 || noTieneClasesHoy == true){
            System.out.println("Puedes entrar a la fiesta.");
        }

        //NOR
        if(!(edad >= 18 || noTieneClasesHoy == true)){
            System.out.println("Puedes entrar a la fiesta.");
        }
    }

}

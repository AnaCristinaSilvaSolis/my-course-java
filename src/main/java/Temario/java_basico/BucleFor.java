package Temario.java_basico;

public class BucleFor {
    public static void main(String[] args) {

        // Imprimir los números del 1 al 10
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("numerox: " + numero);
        }

        // Imprimir los números del 1 al 10
        int numero = 1;
        while (numero <= 10){
            System.out.println("numeroy: " + numero);
            numero++;
        }

        // Imprimir los números del 1 al 10
        do {
            System.out.println("numeroz: " + numero);
            numero++;
        }while(numero <= 10);

    }
}

package Temario;

public class RepasoBucles {
    public static void main(String[] args) {
        // Imprimir los números del 23 al 50, excepto el 32 y el 44.
        
        //for
        int numeros = 51;

        for (numeros = 23; numeros <= 50; numeros++) {
            //excepto el 32 y el 44
            if(numeros == 32 || numeros == 44){
                continue;
            }
            System.out.println("Numero desde for: " + numeros);
        }

        //while
        while (numeros <= 50){
            //excepto el 32 y el 44
            if(numeros != 32 && numeros != 44){
                System.out.println("Numero desde while: " + numeros);
            }
            numeros++;
        }

        //do while
        do {
            //excepto el 32 y el 44.
            if(numeros != 32 && numeros != 44){
                System.out.println("Numero desde do while: " + numeros);
            }
            numeros++;
        }while (numeros <= 50);
    }
}

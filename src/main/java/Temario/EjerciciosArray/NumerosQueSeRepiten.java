package Temario.EjerciciosArray;

public class NumerosQueSeRepiten {
    public static void main(String[] args) {
       /* Dado un array de enteros, encuentra que numeros se repiten y cuantas veces aparece cada uno
       * Datos de entrada: int[] nums = {2,3,5,2,3,4,2,5}
       * */

        //Array original
        int[] numeros = {2,3,5,2,3,4,2,5};

        int longitudDeNumeros = numeros.length;

        //arrays auxiliares
        int[] numerosUnicos = new int[longitudDeNumeros]; //maximo que podría haber de numeros unicos
        int[] conteoNumeros = new int[longitudDeNumeros]; //cantidad de veces que aparece cada numero unico
        int totalNumerosUnicos = 0; //contador de cuantos números unicos llevamos guardados


        for (int i = 0; i < longitudDeNumeros; i++) {
            int numeroActual = numeros[i];
            boolean encontrado = false;

            //revisar si ya contamos ese numero antes
            for (int j = 0; j < totalNumerosUnicos; j++) {
                if (numerosUnicos[j] == numeroActual){
                    conteoNumeros[j]++; //si ya está en la lista, sumamos su contador

                    encontrado = true;
                    break;
                }
            }

            //si no lo he contado anteriormente, lo agrego a los arrays auxiliares
            if (!encontrado){
                numerosUnicos[totalNumerosUnicos] = numeroActual; //guardamos el nuevo numero

                conteoNumeros[totalNumerosUnicos] = 1; //empezamos su conteo en 1
                totalNumerosUnicos++; //aumentar el total de numeros unicos
            }
        }

        //mostramos resultados
        System.out.println("veces que se repite el número: ");
        for (int i = 0; i < totalNumerosUnicos; i++) {
            System.out.println(numerosUnicos[i] + " - " + conteoNumeros[i] + " vez/veces");

        }


    }
}

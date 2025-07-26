package Temario.EjerciciosArray;

public class ArrayBidimensional {
    public static void main(String[] args) {
        // Declaramos un array bidimensional de 4 estudiantes (filas) y 3 materias (columnas)
        double[][] notas = {
                {3.5, 4.0, 3.8}, // Estudiante 1
                {2.8, 3.7, 4.1}, // Estudiante 2
                {4.5, 4.9, 4.2}, // Estudiante 3
                {3.0, 2.5, 3.5}  // Estudiante 4
        };

        // Variables para guardar cuántos estudiantes y materias hay
        int estudiantes = notas.length;         // cantidad de filas = estudiantes
        int materias = notas[0].length; // Cantidad de materias (columnas) que tiene el primer estudiante
        // Obtenemos cuántas materias hay usando la primera fila (todas tienen el mismo número de materias)
        //Estamos viendo cuántas notas tiene el primer estudiante para saber cuántas materias hay en total.
        //Como todos tienen la misma cantidad, usamos el primero.


        // Variables para guardar el mejor promedio y qué estudiante lo obtuvo
        double mejorPromedio = 0.0;
        int estudianteTop = 0;

        System.out.println("📋 Notas de los estudiantes:\n");

        // Recorremos cada estudiante (cada fila del array)
        for (int i = 0; i < estudiantes; i++) {
            double suma = 0; // Acumulador de notas del estudiante i
            System.out.print("Estudiante " + (i + 1) + ": ");

            // Recorremos cada materia (cada columna)
            for (int j = 0; j < materias; j++) {
                System.out.print(notas[i][j] + "  "); // Mostramos cada nota
                suma += notas[i][j];                 // Sumamos la nota al total del estudiante
            }

            // Calculamos el promedio del estudiante
            double promedio = suma / materias;

            // Mostramos el promedio del estudiante
            System.out.printf("| Promedio: %.2f\n", promedio);

            // Si este promedio es el mejor hasta ahora, lo guardamos
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                estudianteTop = i + 1; // Guardamos el número del estudiante (no el índice)
            }
        }

        System.out.println("\n📊 Promedio por materia:\n");

        // Recorremos cada materia (columna)
        for (int j = 0; j < materias; j++) {
            double suma = 0; // Acumulador de notas de la materia j

            // Recorremos cada estudiante para sumar las notas de esta materia
            for (int i = 0; i < estudiantes; i++) {
                suma += notas[i][j];
            }

            // Calculamos el promedio de la materia
            double promedioMateria = suma / estudiantes;

            // Mostramos el promedio de la materia j
            System.out.printf("Materia %d: %.2f\n", (j + 1), promedioMateria);
        }

        System.out.println("\n🏅 Estudiante con mejor promedio:");
        // Mostramos cuál fue el estudiante con el promedio más alto
        System.out.printf("Estudiante %d con promedio: %.2f\n", estudianteTop, mejorPromedio);
    }
}

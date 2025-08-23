package Temario.Collections.List.ArrayList.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class MainTwo {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Piña");
        frutas.add("Pera");
        frutas.add("Fresa");
        frutas.add("Banano");

        //Eliminar la segunda fruta de la lista
        frutas.remove(1);

        for (String fruta : frutas){
            System.out.println("Muestra las frutas disponibles: " + fruta);
        }
    }
}

package Temario.Collections.List.ArrayList.Contains;


import java.util.ArrayList;
import java.util.List;

public class Contains {
    public static void main(String[] args) {
        // Creamos un ArrayList de números enteros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(40);
        numeros.add(105);

        // Verificamos si contiene ciertos elementos
        System.out.println(numeros.contains(105)); //Devuelve true
        System.out.println(numeros.contains(5)); //Devuelve false

        //EJEMPLO CON STRING
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Mango");

        System.out.println(frutas.contains("Pera")); //Devuelve true
        System.out.println(frutas.contains("Piña")); //Devuelve false

        if (frutas.contains("Mango")) {
            System.out.println("Sí, la lista contiene Mango.");
        } else {
            System.out.println("No, la lista no contiene Mango.");
        }

        //CON OBJETOS PERSONALIZADOS
        //es decir, no Integer, String, Bolean, etc.
        //En este ejemplo será con la clase Persona
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana"));
        personas.add(new Persona("Paola"));
        personas.add(new Persona("David"));

        // Aunque sea un nuevo objeto "Ana", gracias a equals() lo reconoce como igual
        System.out.println(personas.contains(new Persona("Ana"))); // true
        System.out.println(personas.contains(new Persona("Pedro"))); // false

    }
}



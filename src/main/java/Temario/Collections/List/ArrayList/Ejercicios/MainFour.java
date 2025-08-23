package Temario.Collections.List.ArrayList.Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainFour {
    public static void main(String[] args) {
        List<String> peliculas = new ArrayList<>();

        peliculas.add("Matrix 1, 2 y 3");
        peliculas.add("Implacable 1, 2 y 3");
        peliculas.add("En busca de la felicidad");
        peliculas.add("World War Z");
        peliculas.add("Cerrando el circulo");

        for (String pelicula: peliculas){
            System.out.println("Peli: " + pelicula);
        }

        System.out.println("**************************");
        peliculas.set(2, "En búsqueda de la felicidad");
        
        for (String pelicula : peliculas){
            System.out.println("pelicula = " + pelicula);
        }
    }
}

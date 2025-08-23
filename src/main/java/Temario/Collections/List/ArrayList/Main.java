package Temario.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        //permite elementos duplicados
        //FIFO
        //Permite acceso aleatorio (tiene índice)
        //Manipulación lenta (para aplicar un cambio, debe recorrer toda la lista)

        //1. Declarar e inicializar
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona(1, "Ana", 23));
        listaPersonas.add(new Persona(1, "Ana", 23));
        listaPersonas.add(new Persona(2, "Ani", 23));

        //listaPersonas.remove(0);
        //listaPersonas.remove(2);



        System.out.println(listaPersonas); //trae todo el array

        //Forma 1: recorrer pon índice
        for (int i = 0; i <listaPersonas.size(); i++){
            System.out.println("Persona: " + listaPersonas.get(i).getName()); //trae solo el nombre
            System.out.println("Persona: " + listaPersonas.get(i)); //trae todo el objeto
        }

        System.out.println("------------------------------");

        //Forma 2: ForEach
        /*for (Clase instancia : lista){

        }*/

        for (Persona personas : listaPersonas){
            System.out.println("Persona: " + personas.getName());
        }

        //System.out.println("La lista contiene a Ani? " + listaPersonas.contains("Ani"));

        String nombreBuscado = "Ani";

        if (listaPersonas.contains(new Persona(0, nombreBuscado, 0))){
            System.out.println(nombreBuscado + " Está en la lista 👍");
        }else{
            System.out.println(nombreBuscado + " No está en la lista ⚠️");
        }
    }
}

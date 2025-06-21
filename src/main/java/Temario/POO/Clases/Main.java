package Temario.POO.Clases;


import Temario.POO.Clases.EjemploCarro.Carro;

public class Main {
    public static void main(String[] args) {
        Persona personita1 = new Persona(); //instanciamos la clase Persona
        Carro toyota2 = new Carro();
        toyota2.nombre = "hola";

        personita1.nombre = "David";
        personita1.comidaFavorita = "Pizza";
        personita1.saludar();


        Persona personita2 = new Persona();
        personita2.nombre = "Paola";
        personita2.comidaFavorita = "Ensalada";
        personita2.alimentarse();

        System.out.println(personita1);
        System.out.println(personita2);


        //------------------------------------------
        Animal gato = new Animal();

        gato.nombre = "Oto";
        gato.raza = "Siberiano";

        System.out.println(gato);


    }
}

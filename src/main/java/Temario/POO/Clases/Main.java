package Temario.POO.Clases;

public class Main {
    public static void main(String[] args) {
        Persona personita1 = new Persona(); //instanciamos la clase Persona

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

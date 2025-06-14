package Temario.POO.Clases;

public class Persona {
    //atributos
    String nombre;
    String comidaFavorita;

    //métodos -> acciones que puede realizar la clase
    public void saludar(){
        System.out.println("Hola, soy " + nombre);
    }

    public void alimentarse(){
        System.out.println("Hola, soy " + nombre + " mi comida favorita es " + comidaFavorita);
    }


    //debemos implementar el metodo toString para que nos permita mostrar objetos en consola

    @Override
    public String toString() {
        return "Persona: nombre " + nombre + ",  comida favorita " + comidaFavorita;
    }
}

package Temario.POO.Clases;

public class Animal {
    String nombre;
    String raza;
    boolean isVacunado;
    int edad = 3;

    //constructor
    public Animal() {
    }

    public Animal(String nombre, String raza, boolean isVacunado, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.isVacunado = isVacunado;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return isVacunado;
    }

    public void setVacunado(boolean vacunado) {
        isVacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Hola, Soy " + nombre + ", tengo " + edad + ", mi raza es " + raza + " ¿estoy vacunado? " + isVacunado;
    }

}

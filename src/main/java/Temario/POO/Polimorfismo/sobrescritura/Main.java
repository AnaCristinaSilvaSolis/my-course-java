package Temario.POO.Polimorfismo.sobrescritura;

public class Main {
    public static void main(String[] args) {
        Animal misAnimales = new Perro(); //Singleton

        misAnimales.hacerSonido();
        misAnimales.vacunar();
        misAnimales.saludar();

        System.out.println(misAnimales);

        misAnimales = new Gato();
        misAnimales.hacerSonido();
        misAnimales.vacunar();
        misAnimales.saludar();
        System.out.println(misAnimales);
    }
}

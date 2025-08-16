package Temario.POO.Polimorfismo.sobrescritura;

public class Perro extends Animal{

    @Override
    public void hacerSonido() {
        System.out.println("Guau!!!");
    }

    public void saltar(){
        System.out.println("Estoy saltando");
    }

    @Override
    protected void vacunar() {
        System.out.println("Soy el perro y David ya me vacunó.");
    }
}

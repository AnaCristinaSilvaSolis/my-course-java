package Temario.POO.ClasesAbstractasEInterfaces.ClasesAbtractas;

public class Bus extends Transporte implements Conducible, Robable{
    @Override
    void arrancar() {
        System.out.println("El bus arranca y se va");
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el bus por la Caracas");
    }

    @Override
    public void robar() {
        System.out.println("El bus será asaltado, obviamente.");
    }
}

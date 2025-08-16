package Temario.POO.ClasesAbstractasEInterfaces.ClasesAbtractas;

public class Bicicleta extends Transporte {

    @Override
    void arrancar() {
        System.out.println("La bicicleta arranco.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo.");
    }
}

package Temario.POO.ClasesAbstractasEInterfaces.ClasesAbtractas;

abstract class Transporte {
    abstract void arrancar(); //métodos abstracto

    public void detener(){ //métodos normales o concretos
        System.out.println("Transporte detenido.");
    }

}

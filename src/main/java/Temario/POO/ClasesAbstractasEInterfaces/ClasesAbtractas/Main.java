package Temario.POO.ClasesAbstractasEInterfaces.ClasesAbtractas;

public class Main {
    public static void main(String[] args) {
        Transporte miTransporte = new Bus();

        miTransporte.arrancar();
        miTransporte.detener();
        System.out.println(miTransporte);

        miTransporte = new Bicicleta();
        miTransporte.arrancar();
        miTransporte.detener();
        System.out.println(miTransporte);
    }
}

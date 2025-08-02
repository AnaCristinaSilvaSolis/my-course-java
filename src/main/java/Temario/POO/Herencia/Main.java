package Temario.POO.Herencia;

public class Main {
    public static void main(String[] args) {
        Padre padre1 = new Padre("David", "Medrano", 22, EstadoCivil.CACHONEADO);

        Hijo hijo1 = new Hijo();

        hijo1.getDeporteQuePractica();
        hijo1.getName();
        hijo1.setName("Jeison");
        hijo1.setEstadoCivil(EstadoCivil.SOLTERO);

        //Hijo hijo2 = new Hijo("Pepito", "Pepita", 1, EstadoCivil.CACHONEADO); por el encapsulamiento no podemos crear hijos así

        System.out.println(padre1);
        System.out.println(hijo1);
    }
}

package Temario.POO.Herencia;

public class Hijo extends Padre{
    private String deporteQuePractica;

    public Hijo(){
    }

    public Hijo(String name, String lastName, int age, EstadoCivil estadoCivil, String deporteQuePractica) {
        super(name, lastName, age, estadoCivil);
        this.deporteQuePractica = deporteQuePractica;
    }


    public String getDeporteQuePractica() {
        return deporteQuePractica;
    }

    public void setDeporteQuePractica(String deporteQuePractica) {
        this.deporteQuePractica = deporteQuePractica;
    }


}

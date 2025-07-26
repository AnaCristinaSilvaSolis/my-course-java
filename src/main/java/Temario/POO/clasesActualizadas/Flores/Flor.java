package Temario.POO.clasesActualizadas.Flores;

public class Flor {

    private String color;
    private int size;
    private String name;
    private boolean isNatural;

    public Flor() {
    }

    public Flor(String color, int size, String name, boolean isNatural) {
        this.color = color;
        this.size = size;
        this.name = name;
        this.isNatural = isNatural;
    }

    //métodos a acciones de la flor
    public void crecer(){
        System.out.println("Crecí!");
    }

    public boolean puedeGerminar(boolean isNatural){
        return true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNatural() {
        return isNatural;
    }

    public void setNatural(boolean natural) {
        isNatural = natural;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "color='" + color + '\'' +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", isNatural=" + isNatural +
                '}';
    }
}

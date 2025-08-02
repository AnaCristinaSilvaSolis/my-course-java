package Temario.POO.Encapsulamiento;

public class Fruta {
    private String name;
    private COLOR colorDeFruta;
    public int precio;

    public Fruta() {
    }

    public Fruta(String name, COLOR colorDeFruta, int precio) {
        this.name = name;
        this.colorDeFruta = colorDeFruta;
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public COLOR getColorDeFruta() {
        return colorDeFruta;
    }

    public void setColorDeFruta(COLOR colorDeFruta) {
        this.colorDeFruta = colorDeFruta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "name='" + name + '\'' +
                ", colorDeFruta=" + colorDeFruta +
                ", precio=" + precio +
                '}';
    }
}

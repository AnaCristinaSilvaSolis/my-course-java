package Temario.POO.Encapsulamiento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Fruta manzana = new Fruta();

        manzana.getName();
        manzana.getColorDeFruta();
        manzana.getPrecio();

        manzana.setName("Manzana");
        manzana.setColorDeFruta(COLOR.NARANJA);
        manzana.setPrecio(25000);

        System.out.println(manzana);
    }
}

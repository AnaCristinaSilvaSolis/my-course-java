package Temario.POO.clasesActualizadas.Flores;

public class FlorMain {

    public static void main(String[] args) {
        //Clase nombreObjeto = new Clase()
        Flor rosa = new Flor();
        Flor tulipan = new Flor();
        Flor girasol = new Flor();
        Flor orquidea = new Flor();

        rosa.getName();
        rosa.setName("rosa");
        orquidea.crecer();
        tulipan.puedeGerminar(false);
        girasol.puedeGerminar(true);

        System.out.println(girasol);
        System.out.println(rosa);

    }
}

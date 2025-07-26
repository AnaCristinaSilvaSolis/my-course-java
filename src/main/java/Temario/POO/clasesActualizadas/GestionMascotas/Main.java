package Temario.POO.clasesActualizadas.GestionMascotas;

public class Main {
    public static void main(String[] args) {
        Mascota perro = new Mascota(
                "Juan",
                "perro",
                Race.DOG,
                10,
                "David",
                true);
        Mascota gato = new Mascota();
        Mascota caballo = new Mascota(
                "Alberto",
                "Caballo",
                Race.HORSE,
                8,
                "Juan David",
                true);
        Mascota pajarito = new Mascota();

        gato.setName("Otto");
        gato.setSpecies("gato");
        gato.setRace(Race.CAT);
        gato.setAge(3);
        gato.setHumanName("Paola");
        gato.setDesparacited(false);

        /*pajarito.vacunar();
        pajarito.desparasitar(true);
        pajarito.revisarSalud();*/

        //vacunas
        gato.vacunar();
        perro.vacunar();
        caballo.vacunar();

        //desparasitar
        gato.desparasitar(false);
        perro.desparasitar(true);
        caballo.desparasitar(false);

        //ver salud
        gato.revisarSalud();
        perro.revisarSalud();
        caballo.revisarSalud();

        /*System.out.println(pajarito);
        System.out.println(gato);
        System.out.println(perro);
        System.out.println(caballo);*/
        gato.resumen();
        perro.resumen();
        caballo.resumen();
        pajarito.resumen();

    }
}

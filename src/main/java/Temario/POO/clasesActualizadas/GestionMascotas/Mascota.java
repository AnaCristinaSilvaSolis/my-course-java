package Temario.POO.clasesActualizadas.GestionMascotas;

public class Mascota {

    private String name;
    private String species;
    private Race race; //es igual a tener private String race -> es decir, nos evita escribir manualmente el tipo de mascota
    private int age;
    private String humanName;
    private boolean isDesparacited;

    public Mascota() {
    }

    public Mascota(String name, String species, Race race, int age, String humanName, boolean isDesparacited) {
        this.name = name;
        this.species = species;
        this.race = race;
        this.age = age;
        this.humanName = humanName;
        this.isDesparacited = isDesparacited;
    }

    public void resumen(){
        System.out.println("Nombre: " + name);
        System.out.println("Raza: " + race);
        System.out.println("Especie: " + species);
        System.out.println("Edad: " + age);
        System.out.println("Nombre del humano: " + humanName);
        System.out.println("¿Está desparacitado?: " + isDesparacited);
    }

    public void vacunar(){
        System.out.println("El animal " + name + " ha sido vacunado 💉");
    }
    public void desparasitar(boolean isDesparacited){

        if (isDesparacited){
            System.out.println("Ya está desparasitado.");
        }else{
            System.out.println("No está desparasitado, ya lo desparasitamos.");
        }
    }

    public void revisarSalud(){
        System.out.println("El animalito está en perfecto estado.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }else{
            System.out.println("Este perro no es perro");
            this.age = 0;
        }
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public boolean isDesparacited() {
        return isDesparacited;
    }

    public void setDesparacited(boolean desparacited) {
        isDesparacited = desparacited;
    }

    /*@Override
    public String toString() {
        return "Mascota{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", race=" + race +
                ", age=" + age +
                ", humanName='" + humanName + '\'' +
                ", isDesparacited=" + isDesparacited +
                '}';
    }*/
}

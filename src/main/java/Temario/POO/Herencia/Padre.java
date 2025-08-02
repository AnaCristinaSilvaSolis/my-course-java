package Temario.POO.Herencia;

public class Padre {
    private String name;
    private String lastName;
    private int age;
    private EstadoCivil estadoCivil;

    public Padre() {
    }

    public Padre(String name, String lastName, int age, EstadoCivil estadoCivil) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.estadoCivil = estadoCivil;
    }

    public void work(){
        System.out.println("Trabajo!");
    }

    public void puedeTomarAlcohol(int age){
        if (age >= 20){
            System.out.println("Puede tomar");
        }else {
            System.out.println("No puede tomar");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Padre{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}

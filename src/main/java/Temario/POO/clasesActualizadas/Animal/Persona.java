package Temario.POO.clasesActualizadas.Animal;

public class Persona {

    public String name;
    private String lastName;
    protected int age;
    public boolean isActive;

    public Persona() {
    }

    public Persona(String name, String lastName, int age, boolean isActive) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isActive = isActive;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }


}

package Temario.Collections.List.ArrayList;

import java.util.Objects;

public class Persona {
    private int id;
    private String name;
    private int edad;

    public Persona() {
    }

    public Persona(int id, String name, int edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (!(obj instanceof Persona)) return  false;

        Persona persona = (Persona) obj;
        return Objects.equals(name, persona.name);
    }

}

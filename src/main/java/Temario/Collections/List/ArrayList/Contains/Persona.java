package Temario.Collections.List.ArrayList.Contains;

public class Persona {
    String nombre;

    public Persona() {
    }

    Persona(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribimos equals() para que compare por nombre
    @Override
    public boolean equals(Object obj) {
        // 1️⃣ Si el objeto actual (this) es exactamente el mismo en memoria que obj → son iguales
        if (this == obj) return true;

        // 2️⃣ Si el objeto que llega no es una instancia de Persona → no se pueden comparar
        if (!(obj instanceof Persona)) return false;

        // 3️⃣ Convertimos obj a Persona (hacemos "cast") para poder acceder a su atributo nombre
        Persona otra = (Persona) obj;

        // 4️⃣ Comparamos los nombres. Si son iguales, equals devuelve true; si no, false
        return this.nombre.equals(otra.nombre);
    }
}

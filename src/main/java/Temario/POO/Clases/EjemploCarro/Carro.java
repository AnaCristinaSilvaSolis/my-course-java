package Temario.POO.Clases.EjemploCarro;

public class Carro {
    //atributos
    //modificadores de acceso -> public, private, protected
    public String nombre;
    public String nombreDelDueño;
    public String color;
    protected int cantidadPuertas;
    protected String motor;
    protected String modelo;
    protected int cantidadSillas;

    //métodos
    public static void acelerar(){
        System.out.println("Rum Rum!");
    }

    public static void frenar(){
        System.out.println("¡STOP!");
    }

    public static void indicarColor(String color){
        System.out.println("Tu color es: " + color);
    }

    public static String esUnBus(int cantidadPuertas, int cantidadSillas){
        String respuesta = "Eres un bus";

        if (cantidadPuertas > 4 || cantidadSillas > 6){
            System.out.println(respuesta);
        }
        return respuesta;
    }

    //constructores
    public Carro() {
    }

    public Carro(String nombre, String color, int cantidadPuertas, String motor, String modelo, int cantidadSillas) {
        this.nombre = nombre;
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
        this.motor = "2.000cm";
        this.modelo = modelo;
        this.cantidadSillas = cantidadSillas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDelDueño() {
        return nombreDelDueño;
    }

    public void setNombreDelDueño(String nombreDelDueño) {
        this.nombreDelDueño = nombreDelDueño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }

    @Override
    public String toString() {
        return "El vehículo tiene estas caracteristicas: {" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", cantidadPuertas=" + cantidadPuertas +
                ", motor='" + motor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cantidadSillas=" + cantidadSillas +
                '}';
    }
}

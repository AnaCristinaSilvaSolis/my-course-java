package Temario.POO.Clases.EjemploCarro;

public class MainCarro {
    public static void main(String[] args) {
        //en el main creamos los objetos
        Carro toyota = new Carro(); //toyota es un objeto

        //declararle cada atributo
        toyota.color = "Negro";
        toyota.cantidadPuertas = 4;
        toyota.modelo = "2026";
        toyota.cantidadSillas = 7;
        //toyota.getMotor();
        toyota.nombre = "Toyota verde de Juan David";

        //declararle métodos
        toyota.acelerar();
        toyota.frenar();

        Carro chevrolet = new Carro();


        //chevrolet.setColor("Negro");
        chevrolet.color = "Blanco";
        chevrolet.motor = "1.4cm^3";
        chevrolet.cantidadSillas = 4;
        chevrolet.nombre = "Chevrolet";
        chevrolet.nombreDelDueño = "David";
        //chevrolet.getColor();

        chevrolet.acelerar();
        chevrolet.indicarColor("Rojo");
        chevrolet.esUnBus(5, 7);

        System.out.println(toyota);
        System.out.println(chevrolet);
    }
}

package Semana1.Dia2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Instanciando Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿De qué color es el vestido de Juana?");
        String respuestaVestido = teclado.nextLine();

        switch (respuestaVestido){
            case "azul":
                System.out.println("El vestido de Juana es azul.");
                break;
            case "rojo":
                System.out.println("El vestido de Juana es rojo.");
                break;
            case "cafe":
                System.out.println("El vestido de Juana es café");
                break;
            default:
                System.out.println("Pues preguntale.");
                System.out.println("¿Ya le preguntaste? 1 si si, 2 si no");
                int respuesta2 = teclado.nextInt();
                if (respuesta2 == 1){
                    System.out.println("Ok, que buena amiga.");
                }else{
                    System.out.println("Mmmmmm, mala amiga.");
                }
            }
        }
    }

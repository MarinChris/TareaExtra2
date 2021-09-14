package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        InfoViaje Mony = new InfoViaje();
        Taxi t1 = new Taxi();

        int opcion = 0;
        while (opcion !=3) {
            System.out.println("Escoge el medio que quiere usar");
            System.out.println("1. Taxi");
            System.out.println("2. Uber");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    Mony.Greetings("Jose");
                    t1.encender();
                    System.out.print("Cual es la distancia del viaje en km");
                    int km = scanner.nextInt();
                    System.out.println("La tarifa es de Q15.00 por km");
                    Mony.costo(km, 15);
                    System.out.print("Estas de acuerdo con el Total? (Si,No)");
                    String agreement = scanner.next();

                    if (agreement.equalsIgnoreCase("si")) {
                        System.out.println("Empezamos el viaje");
                            System.out.print("Velocidad deceada?");
                            int velo = scanner.nextInt();

                        Mony.acelerar(velo);
                        Mony.restante(km, velo);
                        Mony.InfoTrabajador("Taxis Guatemala", "Jose");
                        t1.apagar();
                        t1.salida("2017", "Toyota");
                        System.out.println(" ");
                        System.out.println("Viaje terminado");
                        System.out.println(" ");
                        System.out.println("Dejanos comentarte nuestro listado de pilotos");
                        //Heredado
                        t1.listaDO2("Taxis de Guatemala", "Jose", 150);
                        System.out.println(" ");
                    } else {
                        System.out.println("No perdone por menos dinero no lo podemos hacer mejor pruebe en UBER");
                    }
                }
                case 2 -> {
                    System.out.println(" ");
                    System.out.println("Area en construccion");
                    System.out.println(" ");
                }
                default -> {
                }
            }
        }
        System.out.println(" Saliste del sistema");
    }
}

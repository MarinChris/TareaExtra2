package com.company;
//Clase A
public class InfoViaje {
    String Empresa,Conductor;
    Integer Velocidad,distancia,tiempo;
    double tarifa;

   public InfoViaje() {

    }

    public void Greetings(String Conductor){
        System.out.println("Muy buenos dias mi nombre es "+Conductor);
    }

    public void acelerar(int Velocidad){
        System.out.println("El vehiculo ira a "+Velocidad +"kmH");
    }

    public void costo(int distancia, double tarifa){
        System.out.println("La tarifa sera basada en la distancia de "+distancia +"kmH");
        double costoV = distancia*tarifa;
        System.out.println("Tu viaje tendra un costo de Q" +costoV);
    }

    public void restante (int velocidad, int distancia){
        int tiempo= 1;
        int rest = velocidad-distancia;
        do {
            System.out.println(" Despues de "+tiempo+" hora Nos quedan "+rest+"kmH restantes");
            rest = rest - distancia;
            tiempo = tiempo+1;

            try{
                Thread.sleep(900);
            }catch(InterruptedException e ) {
            }

        } while (rest>0);
        System.out.println("Tu viaje duro "+tiempo+" horas");
    }

    public void InfoTrabajador(String Empresa, String Conductor){
        System.out.println("Gracias por viajar con "+Empresa+","+Conductor+" fue tu piloto hoy.");
    }

    /*void listaDO (String empresa, String conductor, Integer velocidad){
        System.out.println("Nuestros pilotos son:\n Jose\n Mario\n David");
    }*/
}

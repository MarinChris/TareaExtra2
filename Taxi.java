package com.company;
//Clase B
public class Taxi extends InfoViaje implements Transporte{
    String Marca, Modelo,antiguedad;
    int detener;

    public Taxi() {

    }

    //FROM InfoViaje CLASE A
   public void listaDO2 (String empresa, String conductor, Integer velocidad){
        System.out.println("Nuestros pilotos son:\n Jose\n Mario\n David");
    }

    //interface
    @Override
    public void encender() {
        System.out.println("Encendemos el Taxi para un nuevo viaje");
    }
    @Override
    public void apagar() {
        System.out.println("Apagamos el vehiculo");
    }

    // PROPIO
    void salida (String Modelo, String Marca){
        System.out.println("El modelo del vehiculo es "+Modelo+" de la marca "+Marca);
    }
}

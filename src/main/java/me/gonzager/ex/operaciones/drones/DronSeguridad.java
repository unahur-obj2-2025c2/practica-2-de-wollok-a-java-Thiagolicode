package me.gonzager.ex.operaciones.drones;

public class DronSeguridad extends Dron{

    @Override
    public Boolean esAvanzadoSegunDron() {
        return nivelDeProcesamiento > 50;
    }
    
}

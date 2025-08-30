package me.gonzager.ex.operaciones.drones;

public class DronComercial extends Dron {

    @Override
    public Double eficienciaOperativa() {
        
        return super.eficienciaOperativa() + 15.0;
    }

    @Override
    public Boolean esAvanzadoSegunDron() {
        
        return Boolean.FALSE;
    }
    
}

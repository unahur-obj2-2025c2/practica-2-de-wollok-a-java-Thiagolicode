package me.gonzager.ex.operaciones.drones;

import me.gonzager.ex.operaciones.misiones.Mision;

public abstract class Dron {
    protected Double autonomia;
    protected Double nivelDeProcesamiento;
    protected Mision mision;

    public Double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }

    public void setMision(Mision mision) {
        this.mision = mision;
    }

    public Double eficienciaOperativa(){
        return autonomia * 10 + mision.eficienciaOperativa();
    }

    public Boolean esAvanzado(){
        return esAvanzadoSegunDron() || esAvanzadoSegunMision()
    }
    
    public abstract Boolean esAvanzadoSegunDron(){};

    public  Boolean esAvanzadoSegunMision(){
        return mision.esAvanzada(this);
    }

    
}

package me.gonzager.ex.operaciones.zonas;

import me.gonzager.ex.operaciones.operaciones.Escuadron;

public class Zona {
    private Double tamanioTotal;
    private Double cantidadDeOperaciones;
    public Double getTamanioTotal() {
        return tamanioTotal;
    }
    public Double getCantidadDeOperaciones() {
        return cantidadDeOperaciones;
    }
    public Zona(Double tamanioTotal, Double cantidadDeOperaciones) {
        this.tamanioTotal = tamanioTotal;
        this.cantidadDeOperaciones = cantidadDeOperaciones;
    }
    public void operarPorEscuadron(Escuadron escuadron){
        if(escuadron.puedeOperarEn(this)){
            cantidadDeOperaciones += 1;
            escuadron.getDrones().stream().forEach(d->d.setAutonomia(d.getAutonomia() - 2));
        }
    }
    
}

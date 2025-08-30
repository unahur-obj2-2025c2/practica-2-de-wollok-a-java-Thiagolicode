package me.gonzager.ex.operaciones.misiones;

public class MisionDeTransporte extends Mision {
     @Override
    public Boolean esAvanzada(Dron dron){
        return dron.autonomia() > 50
    }
}

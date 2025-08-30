package me.gonzager.ex.operaciones.misiones;

public class MisionDeExploracion extends Mision {
    @Override
    public Boolean esAvanzada(Dron dron){
        return dron.eficienciaOperativa() % 2 == 0;
    }
}

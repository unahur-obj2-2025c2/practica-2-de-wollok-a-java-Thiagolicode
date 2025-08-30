package me.gonzager.ex.operaciones.misiones;

import java.util.List;

public class MisionDeVigilancia extends Mision{
    List <Sensor> sensores;

    @Override
    public Double eficienciaOperativa(){
        return sensores.stream().mapToDouble(s-> ) ;
    }

    @Override 
    public Boolean esAvanzada(Dron dron){
        return sensores.stream().allMatch(s->s.esDuradero()) ;
    }
}

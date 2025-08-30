package me.gonzager.ex.operaciones.sensores;

import java.util.List;

public class Sensor {
    private final Double durabilidad;
    private final Double capacidad;
    
    
    public Boolean esDuradero(){
        return durabilidad > (capacidad * 2) ;
    }
    
}

package me.gonzager.ex.operaciones.operaciones;

import java.util.List;

import me.gonzager.ex.operaciones.drones.Dron;
import me.gonzager.ex.operaciones.zonas.Zona;

public class Escuadron {
    private List <Dron> drones;
    private static Integer limiteDeDrones = 10;
    
    public static void setLimiteDeDrones(Integer limiteDeDrones) {
        Escuadron.limiteDeDrones = limiteDeDrones;
    }

    public List<Dron> getDrones() {
        return drones;
    }

    public static Integer getLimiteDeDrones() {
        return limiteDeDrones;
    }

    public void agregarDron(Dron dron){
        if(drones.size() == limiteDeDrones) {
            throw new RuntimeException("supera la cantidada maxima definida por la ciudad") ;
        }
        drones.add(dron);
    }

    public Boolean puedeOperarEn(Zona zona){
        return drones.stream().anyMatch(d->d.esAvanzado()) && capacidadOperativa() > 2 * zona.getTamanioTotal();
        
    }

    public Double capacidadOperativa(){
        return drones.stream().mapToDouble(d->d.eficienciaOperativa()).sum();
    }


    
    
    
    
    
    
    
          



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author SP
 */
public class Domicilio extends Drogueria{ 
  private String barrio;  
  private String direccion;  

    public Domicilio( String medicamento, String cantidadmedicamento, String Precio, String tipo,String barrio, String direccion) {
        super(medicamento, cantidadmedicamento, Precio, tipo);
        this.barrio = barrio;
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
  public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);  
  }
                      
                 
}

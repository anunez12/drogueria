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
public class Drogueria implements java.io.Serializable{

    private String medicamento;
    private String cantidadmedicamento;
    private String Precio;
    private String Tipo; 
    
    public Drogueria(String medicamento, String cantidadmedicamento, String Precio,String tipo) {
        this.medicamento = medicamento;
        this.cantidadmedicamento = cantidadmedicamento;
        this.Precio = Precio; 
        this.Tipo = tipo; 
    }

    public String getTipo() {
        return Tipo;  
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
                        
    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getCantidadmedicamento() {
        return cantidadmedicamento;
    }

    public void setCantidadmedicamento(String cantidadmedicamento) {
        this.cantidadmedicamento = cantidadmedicamento;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);

    }
}
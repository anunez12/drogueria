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
public class Cliente extends Persona {
      
    private String numerodetelefono;
    private String numero_de_factura;
    private String email;

    public Cliente(String cedula, String nombre, String apellido, String edad, String sexo, String numerodetelefono, String numero_de_factura, String email) {
        super(cedula, nombre, apellido, edad, sexo);
        this.numerodetelefono = numerodetelefono;
        this.numero_de_factura = numero_de_factura;
        this.email = email;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public void setNumerodetelefono(String numerodetelefono) {
        this.numerodetelefono = numerodetelefono;
    }

    public String getNumero_de_factura() {
        return numero_de_factura;
    }

    public void setNumero_de_factura(String numero_de_factura) {
        this.numero_de_factura = numero_de_factura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}

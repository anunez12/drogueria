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
public class Medicamento extends Drogueria {

    private String codigo;
    private String fechadevencimiento;

    public Medicamento(String medicamento, String cantidadmedicamento, String Precio, String tipo, String codigo, String fechadevencimiento) {
        super(medicamento, cantidadmedicamento, Precio, tipo);
        this.codigo = codigo;
        this.fechadevencimiento = fechadevencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechadevencimiento() {
        return fechadevencimiento;
    }

    public void setFechadevencimiento(String fechadevencimiento) {
        this.fechadevencimiento = fechadevencimiento;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}

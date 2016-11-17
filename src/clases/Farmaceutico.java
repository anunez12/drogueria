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
public class Farmaceutico extends Persona {

    private String añosDeExperenciaLaboral;
    private String carrerasEstudiadas;
    private String nivelCarreraEstudiadas;
    private int Salario;
    private String formaDePago; 

    public Farmaceutico(String cedula, String nombre, String apellido, String edad, String sexo, String añosDeExperenciaLaboral, String carrerasEstudiadas,String nivelcarreraestudiada, int Salario, String formaDePago) {
        super(cedula, nombre, apellido, edad, sexo);
        this.añosDeExperenciaLaboral = añosDeExperenciaLaboral;
        this.carrerasEstudiadas = carrerasEstudiadas; 
        this.nivelCarreraEstudiadas = nivelcarreraestudiada;         
        this.Salario = Salario;
        this.formaDePago = formaDePago;
    }

    public String getAñosDeExperenciaLaboral() {
        return añosDeExperenciaLaboral;
    }

    public void setAñosDeExperenciaLaboral(String añosDeExperenciaLaboral) {
        this.añosDeExperenciaLaboral = añosDeExperenciaLaboral;
    }

    public String getCarrerasEstudiadas() {
        return carrerasEstudiadas;
    }

    public void setCarrerasEstudiadas(String carrerasEstudiadas) {
        this.carrerasEstudiadas = carrerasEstudiadas;
    }

    public String getNivelCarreraEstudiadas() {
        return nivelCarreraEstudiadas;
    }

    public void setNivelCarreraEstudiadas(String nivelCarreraEstudiadas) {
        this.nivelCarreraEstudiadas = nivelCarreraEstudiadas;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }
}

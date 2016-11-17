/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SP
 */
public class TestPersona {

    public static void main(String[] args) {

        System.out.println("Clase Cliente");
        System.out.println("");

        Cliente persona = new Cliente("98060162727", "Albin", "Nuñez", "18", "Masculino", "3015353510", "0-1623-14", "anunez12@cuc.edu.co");
        System.out.println("La cedula del cliente es:" + persona.getCedula());
        System.out.println("El nombre del cliente es:" + persona.getNombre());
        System.out.println("El apellido del cliente es:" + persona.getApellido());
        System.out.println("La edad del cliente es:" + persona.getEdad());
        System.out.println("El sexo del cliente es:" + persona.getSexo());
        System.out.println("El numero de telefono es:" + persona.getNumerodetelefono());
        System.out.println("El numero de factura del cliente:" + persona.getNumero_de_factura());
        System.out.println("El email del cliente es:" + persona.getEmail());
        
        System.out.println("");            
        
        System.out.println("Clase Farmaceutico");
        System.out.println("");

        Farmaceutico doufensmirthz = new Farmaceutico("456789023", "Heinz", "Doufensmirthz", "56", "Masculino", "24", "Quimica y Farmacia,Enfermeria,Gestion y Control de Productos Farmaceuticos", "Profesional,Tecnico,Tecnologo", 120000, "Diario");
        System.out.println("La cedula del farmaceutico es:" + doufensmirthz.getCedula());
        System.out.println("El nombre del farmaceutico es:" + doufensmirthz.getNombre());
        System.out.println("El apellido del farmaceutico es:" + doufensmirthz.getApellido());
        System.out.println("La edad del farmaceutico es:" + doufensmirthz.getEdad());
        System.out.println("El sexo del farmaceutico:" + doufensmirthz.getSexo());
        System.out.println("Años Laborados:" + doufensmirthz.getAñosDeExperenciaLaboral());
        System.out.println("Carrera Estudiadas:" + doufensmirthz.getCarrerasEstudiadas());
        System.out.println("Nivel Carreras Estudiadas:" + doufensmirthz.getNivelCarreraEstudiadas());
        System.out.println("Salario:" + doufensmirthz.getSalario()); 
        System.out.println("Forma de pago:" + doufensmirthz.getFormaDePago());

    }
} 

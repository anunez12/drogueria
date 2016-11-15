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
public class Test {

    public static void main(String[] args) {
        Domicilio lachiki = new Domicilio("acetaminofen", "2", "1000", "comercial", "lucero", "calle 48b-34#41");
        System.out.println("El medicamento a comprar es:" + lachiki.getMedicamento());
        System.out.println("La cantidad a comprar es:" + lachiki.getCantidadmedicamento());
        System.out.println("El precio del medicamento a comprar es:" + lachiki.getPrecio());
        System.out.println("El tipo de medicamento a comprar es:" + lachiki.getTipo());
        System.out.println("El barrio a llevar el domicilio es:" + lachiki.getBarrio());
        System.out.println("La direccion a llevar el medicamento a domicilio es:" + lachiki.getDireccion());

        Persona p = new Persona("novalgina", " 1", "12500", "generico", "32891918", "Annys", "Perez", "37", "femenino");
        System.out.println("El medicamento a comprar es:" + p.getMedicamento());
        System.out.println("La cantidad a comprar es:" + p.getCantidadmedicamento());
        System.out.println("El precio del medicamento a comprar es:" + p.getPrecio());
        System.out.println("El tipo de medicamento a comprar es:" + p.getTipo());
        System.out.println("La cedula de la persona es:" + p.getCedula());
        System.out.println("El nombre de la persona es:" + p.getNombre());  
        System.out.println("El apellido de la persona es:" + p.getApellido());
        System.out.println("La edad de la persona es:" + p.getEdad());
        System.out.println("El sexo de la persona es:" + p.getSexo());
    }

}

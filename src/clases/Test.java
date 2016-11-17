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

        System.out.println("clase domicilio"); 
        System.out.println("");

        Domicilio lachiki = new Domicilio("acetaminofen", "2", "1000", "comercial", "lucero", "calle 48b-34#41");
        System.out.println("El medicamento a comprar es:" + lachiki.getMedicamento());
        System.out.println("La cantidad a comprar es:" + lachiki.getCantidadmedicamento());
        System.out.println("El precio del medicamento a comprar es:" + lachiki.getPrecio());
        System.out.println("El tipo de medicamento a comprar es:" + lachiki.getTipo());
        System.out.println("El barrio a llevar el domicilio es:" + lachiki.getBarrio());
        System.out.println("La direccion a llevar el medicamento a domicilio es:" + lachiki.getDireccion());
        System.out.println("");       

        System.out.println("clase medicamento"); 
        System.out.println("");

        Medicamento Drogueria_La_Guaca = new Medicamento("Novalgina", "2", "12500", "generico", "A78234T", "2/10/2017");
        System.out.println("El medicamento a comprar es:" + Drogueria_La_Guaca.getMedicamento());
        System.out.println("La cantidad a comprar es:" + Drogueria_La_Guaca.getCantidadmedicamento());
        System.out.println("El precio del medicamento a comprar es:" + Drogueria_La_Guaca.getPrecio());
        System.out.println("El tipo de medicamento a comprar es:" + Drogueria_La_Guaca.getTipo());
        System.out.println("El codigo del medicamento es:" + Drogueria_La_Guaca.getCodigo());
        System.out.println("La fecha de vencimiento del medicamento es:" + Drogueria_La_Guaca.getFechadevencimiento());

    }   
   
}

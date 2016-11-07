/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SP
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int numfilas, numcolumnas;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;

        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static ArrayList traerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList personas = new ArrayList();
        Object datos;

        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((datos = entrada.readObject()) != null) {
                personas.add(datos);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return personas;
    }

    public static void llenarTabla(JTable tabla, String ruta) {
        DefaultTableModel tm;

        int numfilas;

        ArrayList<Drogueria> medicamento = traerDatos(ruta);

        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        numfilas = medicamento.size();
        tm.setRowCount(numfilas);

        for (int i = 0; i < numfilas; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(medicamento.get(i).getMedicamento(), i, 1);
            tabla.setValueAt(medicamento.get(i).getCantidadmedicamento(), i, 2);
            tabla.setValueAt(medicamento.get(i).getPrecio(), i, 3);
            tabla.setValueAt(medicamento.get(i).getTipo(), i, 4);
        }
    }

    public static void llenarTabla(JTable tabla, ArrayList<Drogueria> Droguerias) {
        DefaultTableModel tm;
        int nf;
        tm = (DefaultTableModel) tabla.getModel();
        limpiadoTabla(tabla);
        nf = Droguerias.size();
        tm.setRowCount(nf);
        for (int i = 0; i < nf; i++) {
            tabla.setValueAt(i + 1, i, 0);
            tabla.setValueAt(Droguerias.get(i).getMedicamento(), i, 1);
            tabla.setValueAt(Droguerias.get(i).getCantidadmedicamento(), i, 2);
            tabla.setValueAt(Droguerias.get(i).getPrecio(), i, 3);
            tabla.setValueAt(Droguerias.get(i).getTipo(), i, 4);
        }
    }

    public static void volcadoDrogueria(ObjectOutputStream salida, ArrayList personas) {
        for (int i = 0; i < personas.size(); i++) {

            try {
                salida.writeObject(personas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    public static boolean buscarPreciomedicamento(String precio, String ruta) {
        ArrayList<Drogueria> Drogueria = traerDatos(ruta);
        for (int i = 0; i < Drogueria.size(); i++) {
            if (Drogueria.get(i).getPrecio().equals(precio)) {
                return true;
            }
        }
        return false;
    }

    public static Drogueria traerPreciomedicamento(String precio, String ruta) {
        ArrayList<Drogueria> Drogueria = traerDatos(ruta);
        for (int i = 0; i < Drogueria.size(); i++) {
            if (Drogueria.get(i).getPrecio().equals(precio)) {
                return Drogueria.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Drogueria> actualizacionMedicamento(String ruta, String medicamento, String cantidadmedicamento, String Precio, String tipo) {
        ArrayList<Drogueria> Drogueria = traerDatos(ruta);
        for (int i = 0; i < Drogueria.size(); i++) {
            if (Drogueria.get(i).getMedicamento().equals(medicamento)) {
                Drogueria.get(i).setCantidadmedicamento(cantidadmedicamento);
                Drogueria.get(i).setPrecio(Precio);
                Drogueria.get(i).setTipo(tipo);

                i = Drogueria.size();
            }
        }
        return Drogueria;
    }

    public static ArrayList<Drogueria> actualizacionMedicamento(String ruta, Drogueria dondevirgilio) {
        ArrayList<Drogueria> Drogueria = traerDatos(ruta);
        for (int i = 0; i < Drogueria.size(); i++) {
            if (Drogueria.get(i).getMedicamento().equals(dondevirgilio.getMedicamento())) {
                Drogueria.get(i).setCantidadmedicamento(dondevirgilio.getCantidadmedicamento());
                Drogueria.get(i).setPrecio(dondevirgilio.getPrecio());
                Drogueria.get(i).setTipo(dondevirgilio.getTipo());

                i = Drogueria.size();
            }
        }
        return Drogueria;
    }

    public static void listadoGenerico_Comercial(JTable tabla, String ruta, String tipo) {
        ArrayList<Drogueria> Drogueria = traerDatos(ruta);
        ArrayList<Drogueria> Droguerias = new ArrayList();
        for (int i = 0; i < Drogueria.size(); i++) {
            if (Drogueria.get(i).getTipo().equals(tipo)) {
                Droguerias.add(Drogueria.get(i));
            }

        }
        llenarTabla(tabla, Droguerias);

    }
}

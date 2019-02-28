/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aparcerozas
 */
public class Tienda implements MetodosComunes {
    private ArrayList<Producto> catalogo = new ArrayList<>();

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    @Override
    public void mostrar() {
        System.out.println("Catálogo:");
        for (Producto p : catalogo){
            System.out.println(p);
        }
    }

    @Override
    public void engadirProducto() throws Exception {
        String nome = JOptionPane.showInputDialog("Introduzca nome de producto:");
        for (Producto p : catalogo){
            if(p.getNome()==nome){
                throw new Exception("O nome do producto xa existe no catálogo");
            }
        }
        float precio = Float.parseFloat(JOptionPane.showInputDialog("Introduzca precio de producto:"));
        String tipo = JOptionPane.showInputDialog("Introduzca tipo de producto:");
        int numUnid = Integer.parseInt(JOptionPane.showInputDialog("Introduzca número de unidades:"));
        Producto p = new Producto(nome,precio,tipo,numUnid);
        catalogo.add(p);
    }

    @Override
    public void eliminarProducto() {
        String nome = JOptionPane.showInputDialog("Introduzca nome de producto:");
        for (Producto p : catalogo){
            if(p.getNome()==nome){
                catalogo.remove(p);
            }
        }
    }

    @Override
    public void engadirUnidades() {
        
    }

    @Override
    public void quitarUnidades() {
        
    }
    
}

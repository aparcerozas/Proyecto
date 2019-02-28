/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author aparcerozas
 */
public class Producto {
    //Atributos
    private String nome;
    private float precio;
    private String tipo;
    private int numUnid;

    public Producto(String nome, float precio, String tipo, int numUnid) {
        this.nome = nome;
        this.precio = precio;
        this.tipo = tipo;
        this.numUnid = numUnid;
    }

    public Producto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumUnid() {
        return numUnid;
    }

    public void setNumUnid(int numUnid) {
        this.numUnid = numUnid;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", Precio:" + precio + ", Tipo:" + tipo + ", Número de unidades:" + numUnid;
    }
    
    
    
}

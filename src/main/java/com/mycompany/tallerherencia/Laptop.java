/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Laptop extends Computador {
    private String tamano;
    private double peso;

    public Laptop(String tamano, double peso, String discoDuro, String memoria, boolean DVD, String procesador, String SO, int codigo, double precioVenta, double precioCompra, String tipo, String voltaje, String tipoConector, String tipoArticulo) {
        super(discoDuro, memoria, DVD, procesador, SO, codigo, precioVenta, precioCompra, tipo, voltaje, tipoConector, tipoArticulo);
        this.tamano = tamano;
        this.peso = peso;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    protected String print(){
        return super.print()+"\nTamaño: -> "+tamano+"\nPeso: -> "+peso;
    }
}

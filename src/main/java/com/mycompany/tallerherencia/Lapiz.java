/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Lapiz extends Item{
    private String color;
    private String tamano;
    public Lapiz(final int codigo, final double precioVenta, final double precioCompra, final String tipo, final String color, final String tamano){
        super(codigo,precioVenta,precioCompra,tipo);
        this.color=color;
        this.tamano=tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    @Override
    protected String print(){
        return super.print() + "\nColor -> "+color+"\nTamaño -> "+tamano;
    }
    
}

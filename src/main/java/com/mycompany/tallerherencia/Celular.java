/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Celular extends electronico{
    private String pantalla;
    private String RAM;
    private String camara;
    private String procesador;

    public Celular(String pantalla, String RAM, String camara, String procesador, int codigo, double precioVenta, double precioCompra, String tipo, String voltaje, String tipoConector, String tipoArticulo) {
        super(codigo, precioVenta, precioCompra, tipo, voltaje, tipoConector, tipoArticulo);
        this.pantalla = pantalla;
        this.RAM = RAM;
        this.camara = camara;
        this.procesador = procesador;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    @Override
    protected String print(){
        return super.print()+ "\nPantalla: -> "+pantalla+"\nMemoria RAM: -> "+RAM+ "\nCamara: -> "+camara+"\nTipo de procesador: -> "+procesador;
    }
}

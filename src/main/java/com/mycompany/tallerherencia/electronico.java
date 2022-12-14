/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class electronico extends Item {
    private String voltaje;
    private String tipoConector;
    private String tipoArticulo;
    public electronico(final int codigo, final double precioVenta, final double precioCompra, final String tipo, 
            final String voltaje, final String tipoConector, final String tipoArticulo) {
        super(codigo, precioVenta, precioCompra, tipo);
        this.voltaje=voltaje;
        this.tipoConector= tipoConector;
        this.tipoArticulo=tipoArticulo;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }
    
    @Override
    protected String print(){
        return super.print()+ "\nVoltaje -> "+voltaje+"\nTipo de conector -> "+tipoConector+ "\nTipo de Articulo -> "+tipoArticulo;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Item {
    private int codigo;
    private double precioVenta;
    private double precioCompra;
    private String tipo;
    
    public Item(final int codigo, final double precioVenta, final double precioCompra, final String tipo) {
        this.codigo= codigo;
        this.precioVenta= precioVenta;
        this.precioCompra= precioCompra;
        this.tipo=tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    protected String print(){
        return "codigo -> "+codigo+" Precio de venta -> "+ precioVenta+" Precio de compra -> "+precioCompra+" Tipo -> "+tipo;
    }
}

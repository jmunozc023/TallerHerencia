/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Impresora extends electronico {
    private String tecnologia;
    private String tinta;
    private String conexion;

    public Impresora(String teconologia, String tinta, String conexion, int codigo, double precioVenta, double precioCompra, String tipo, String voltaje, String tipoConector, String tipoArticulo) {
        super(codigo, precioVenta, precioCompra, tipo, voltaje, tipoConector, tipoArticulo);
        this.tecnologia = teconologia;
        this.tinta = tinta;
        this.conexion = conexion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getTinta() {
        return tinta;
    }

    public void setTinta(String tinta) {
        this.tinta = tinta;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    @Override
    protected String print(){
        return super.print() +"\nTipo de tecnologia: -> "+tecnologia+"\nTipo de tinta: -> "+ tinta+"\nTipo de conexion: -> "+conexion;
    }
}

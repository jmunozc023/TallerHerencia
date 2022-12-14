/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Computador extends electronico{
    private String discoDuro;
    private String memoria;
    private boolean DVD;
    private String procesador;
    private String SO;
    public Computador(String discoDuro, String memoria, boolean DVD, String procesador, String SO, int codigo, double precioVenta, double precioCompra, String tipo, String voltaje, String tipoConector, String tipoArticulo) {
        super(codigo, precioVenta, precioCompra, tipo, voltaje, tipoConector, tipoArticulo);
        this.discoDuro = discoDuro;
        this.memoria = memoria;
        this.DVD = DVD;
        this.procesador = procesador;
        this.SO = SO;
    }
    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public boolean getDVD() {
        return DVD;
    }

    public void setDVD(boolean DVD) {
        this.DVD = DVD;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
    @Override
    protected String print(){
        return super.print()+ "\nDisco Duro: -> "+discoDuro+"\nMemoria Ram: ->"+memoria+"\nDVD ROM: -> "+DVD+ "\nTipo de procesador: -> "+procesador+"\nSistema Operativo: -> "+SO;
    }
    
}

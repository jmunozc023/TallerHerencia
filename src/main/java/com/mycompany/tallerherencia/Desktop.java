/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Desktop extends Computador{
    private String monitor;
    private String mouse;
    private String teclado;
    private String caseSize;
    private String parlantes;

    public Desktop(String monitor, String mouse, String teclado, String caseSize, String parlantes, String discoDuro, String memoria, boolean DVD, String procesador, String SO, int codigo, double precioVenta, double precioCompra, String tipo, String voltaje, String tipoConector, String tipoArticulo) {
        super(discoDuro, memoria, DVD, procesador, SO, codigo, precioVenta, precioCompra, tipo, voltaje, tipoConector, tipoArticulo);
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.caseSize = caseSize;
        this.parlantes = parlantes;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getCaseSize() {
        return caseSize;
    }

    public void setCaseSize(String caseSize) {
        this.caseSize = caseSize;
    }

    public String getParlantes() {
        return parlantes;
    }

    public void setParlantes(String parlantes) {
        this.parlantes = parlantes;
    }
    @Override
    protected String print(){
        return super.print()+"\nMonitor: -> "+monitor+"\nMouse: -> "+mouse+"\nTeclado: -> "+teclado+"\nTamaño del case: -> "+caseSize+"\nParlantes: -> "+parlantes;
    
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

/**
 *
 * @author josep
 */
public class Libro extends Item{
    private int cantPaginas;
    private int edicion;
    private String editorial;
    private String autor;

    public Libro(int cantPaginas, int edicion, String editorial, String autor, int codigo, double precioVenta, double precioCompra, String tipo) {
        super(codigo, precioVenta, precioCompra, tipo);
        this.cantPaginas = cantPaginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.autor = autor;
    }
    
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    @Override
    protected String print(){
        return super.print()+ "\nCantidad de paginas -> "+ cantPaginas+"\nEdicion -> "+edicion+ "\nEditorial -> "+editorial+"\nAutor -> "+autor;
    }
}

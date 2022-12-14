/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerherencia;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Tienda {

    private Libro[] compraL;
    private Lapiz[] compraLa;
    private Laptop[] compraLap;
    private Desktop[] compraDes;
    private Impresora[] compraIm;
    private Celular[] compraCel;

    private Scanner scanner;
    private int sel;
    int cant = 0;

    public Tienda() {
        compraL = new Libro[1];
        compraLa = new Lapiz[1];
        compraLap = new Laptop[1];
        compraDes = new Desktop[1];
        compraIm = new Impresora[1];
        compraCel = new Celular[1];
    }
    public void menuPrincipal() {

        scanner = new Scanner(System.in);
        do {
            System.out.println("***********************************");
            System.out.println("***************Menu****************");
            System.out.println("***********************************");
            System.out.println("* 1- Libros                       *");
            System.out.println("* 2- Lapices                      *");
            System.out.println("* 3- Electronicos                 *");
            System.out.println("* 0- Salir                        *");
            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("Elija una opcion");
            sel = scanner.nextInt();
            switch (sel) {
                case 1:
                    System.out.println("Cuantos articulos desea comprar?");
                    cant = scanner.nextInt();
                    compraL[0] = new Libro(300, 10, "Santander", "James Coulson", 001, cant * 32500.30, 28275.26, "Pasta dura");
                    System.out.println("Articulos: " + cant);
                    for (var i : compraL) {
                        System.out.println(i.print());
                    }
                    break;
                case 2:
                    System.out.println("Cuantos articulos desea comprar?");
                    cant = scanner.nextInt();
                    compraLa[0] = new Lapiz(002, cant * 1500.50, 1305.43, "HB", "Negro", "Mediano");
                    System.out.println("Articulos: " + cant);
                    for (var i : compraLa) {
                        System.out.println(i.print());
                    }
                    break;
                case 3:
                    do {
                        System.out.println("***********************************");
                        System.out.println("********Menu Electronicos**********");
                        System.out.println("***********************************");
                        System.out.println("* 1- Laptop                       *");
                        System.out.println("* 2- Desktop                      *");
                        System.out.println("* 3- Impresoras                   *");
                        System.out.println("* 4- Celulares                    *");
                        System.out.println("* 0- Salir                        *");
                        System.out.println("***********************************");
                        System.out.println("***********************************");
                        System.out.println("Elija una opcion");
                        sel = scanner.nextInt();
                        switch (sel) {
                            case 1:
                                System.out.println("Cuantos articulos desea comprar?");
                                cant = scanner.nextInt();
                                compraLap[0] = new Laptop("15 pulgadas", 150.5, "250GB", "16GB", true, "AMD Ryzen 9", "Windows 11", 003, cant * 525000.00, 456750.00, "Acer", "120 VAC", "Convencional", "Electronico");
                                System.out.println("Articulos: " + cant);
                                for (var i : compraLap) {
                                    System.out.println(i.print());
                                }
                                break;
                            case 2:
                                System.out.println("Cuantos articulos desea comprar?");
                                cant = scanner.nextInt();
                                compraDes[0] = new Desktop("32 pulgadas curvo", "5 botones", "Mecanico con teclado numerico", "Full Tower", "5.1 Sorround", "1 TB", "256 GB", false, "Intel I9", "Windows 11", 004, cant * 1285450.3, 1118341.76, "Cougar", "120 VAC", "Con tierra", "Electronico");
                                System.out.println("Articulos: " + cant);
                                for (var i : compraDes) {
                                    System.out.println(i.print());
                                }
                                break;
                            case 3:
                                System.out.println("Cuantos articulos desea comprar?");
                                cant = scanner.nextInt();
                                compraIm[0] = new Impresora("Multifuncional", "Colores", "WiFi", 005, 250000, 217500, "Epson", "120 VAC", "Con tierra", "Electronico");
                                System.out.println("Articulos: " + cant);
                                for (var i : compraIm) {
                                    System.out.println(i.print());
                                }
                                break;
                            case 4:
                                System.out.println("Cuantos articulos desea comprar?");
                                cant = scanner.nextInt();
                                compraCel[0] = new Celular("6.2 pulgadas", "12 GB", "108 Megapixeles", "Kirin", 480000, 417600, 006, "Huawei", "12 VDC", "USB C", "Electronico");
                                System.out.println("Articulos: " + cant);
                                for (var i : compraCel) {
                                    System.out.println(i.print());
                                }
                                break;
                        }
                    } while (sel != 0);
            }

        } while (sel != 0);

    }
}

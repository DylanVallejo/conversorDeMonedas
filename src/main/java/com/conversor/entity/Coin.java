package com.conversor.entity;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Coin   {
        private String nombre;
        private String simbolo;
        private String nombrePlural;
        private double equivalencia;
        private String cambioAPeso;
        private String CambioDePeso;

        public Divisas(String nombre, String simbolo, String nombrePlural, double equivalencia, String cambioAPeso, String CambioDePeso) {
                super();
                this.nombre = nombre;
                this.simbolo = simbolo;
                this.nombrePlural = nombrePlural;
                this.equivalencia = equivalencia;
                this.cambioAPeso = cambioAPeso;
                this.CambioDePeso = CambioDePeso;

        }
        public String getNombre() {
                return nombre;
        }
        public String getSimbolo() {
                return simbolo;
        }
        public String getNombrePlural() {
                return nombrePlural;
        }
        public double getEquivalencia() {
                return equivalencia;
        }
        public String getCambioAPeso() {
                return cambioAPeso;
        }
        public String getCambioDePeso() {
                return CambioDePeso;
        }
        public void cambiarAPesos(double input) {
                double ouput= input*equivalencia;
                DecimalFormat formatearMoneda = new DecimalFormat("#.##");
                JOptionPane.showMessageDialog(null, input+" pesos argentinos son: "+formatearMoneda.format(ouput)+" "+nombrePlural);
        }

        public void cambiarDesdePesos(double input) {
                double ouput= input/equivalencia;
                DecimalFormat formatearMoneda = new DecimalFormat("#.##");
                JOptionPane.showMessageDialog(null, input+" "+nombrePlural+" son: "+formatearMoneda.format(ouput)+" pesos argentinos");

        }

//        public Coin () {
//                setSize( 500, 450 ); // SIZE of the winddow
//                setDefaultCloseOperation(EXIT_ON_CLOSE);
//                setTitle("Coin converter");
//                setLocation(100,200);
////                setBounds(100,200,500,450);
////                setLocationRelativeTo(null); //establecer la ventana al centro de la pantalla
//        }
//
//        public double quantity;
//
//
//        public double convertQuantity;
//
////fucntion to convert one value to  differents type of coins
////        Así, a * b = c, y a = c/b.
//
////93*0.93     93/0.93 exchange euros
////        a = money i have
////        b - exchange rate
////        c= money after exchange
//        public void convert(double input) {
//                System.out.println(input);
//        }

}

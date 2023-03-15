package com.conversor.entity;

import javax.swing.*;

public class Coin  extends JFrame {

        public Coin () {
                setSize( 500, 450 ); // SIZE of the winddow
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setTitle("Coin converter");
                setLocation(100,200);
//                setBounds(100,200,500,450);
//                setLocationRelativeTo(null); //establecer la ventana al centro de la pantalla
        }

        public double quantity;


        public double convertQuantity;

//fucntion to convert one value to  differents type of coins
//        Así, a * b = c, y a = c/b.

//93*0.93     93/0.93 exchange euros
//        a = money i have
//        b - exchange rate
//        c= money after exchange
        public void convert(double input) {
                System.out.println(input);
        }

}

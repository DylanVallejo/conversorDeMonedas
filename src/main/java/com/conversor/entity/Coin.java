package com.conversor.entity;

import javax.swing.*;

public class Coin  extends JFrame {

        public Coin () {
                this.setSize( 500, 450 ); // SIZE of the winddow
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

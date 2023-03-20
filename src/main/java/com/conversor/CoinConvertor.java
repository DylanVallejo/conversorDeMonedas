package com.conversor;

import com.conversor.entity.Coin;

import javax.swing.*;
//import com.conversor.entity.WonSulCoreano;

public class CoinConvertor {
    private static int abrirMenuPrincipal() {
        String[] options = {"Conversor de divisas", "Conversor de Temperatura","Salir"};
        return JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }
    public static void main(String[] args) {

        int x=0;
        try {
            x = abrirMenuPrincipal();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//        System.out.println("Conversor de monedas");


//        Coin setCoin = new Coin();

//        Coin coinWindow = new Coin();
//        coinWindow.setVisible(true);//making visible the window

//        setCoin.quantity = 100;


//        setCoin.convert(10);

//        System.out.println(setCoin.quantity);

//        double quantity = 100;
//        setCoin.setQuantity(quantity);


//        System.out.println(setCoin.getQuantity());



    }
}

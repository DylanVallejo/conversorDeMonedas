package com.conversor;

import com.conversor.entity.Coin;
//import com.conversor.entity.WonSulCoreano;

public class CoinConvertor {
    public static void main(String[] args) {
        System.out.println("Conversor de monedas");


        Coin setCoin = new Coin();

        setCoin.quantity = 100;


        setCoin.convert(10);

        System.out.println(setCoin.quantity);

//        double quantity = 100;
//        setCoin.setQuantity(quantity);


//        System.out.println(setCoin.getQuantity());



    }
}

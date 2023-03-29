package com.conversor;


import javax.swing.*;


public class CoinConvertor {
//    private static int abrirMenuPrincipal() {
//        String[] options = {"Conversor de divisas", "Conversor de Temperatura","Salir"};
//        return JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
//    }
//    public static void main(String[] args) {
//
//        int x=0;
//        try {
//            x = abrirMenuPrincipal();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//MENU PRINCIPAL
private static int abrirMenuPrincipal() {
    String[] options = {"Conversor de divisas", "Conversor de Temperatura","Salir"};
    return JOptionPane.showOptionDialog(null, "Seleccione una opcion:", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
}

    public static void main(String[] args) {

        Divisas dolar = new Divisas("Dolar", "USD", "Dolares", 0.0049,"Pesos argentinos a Dolares", "Dolares a Pesos argentinos");
        Divisas euro = new Divisas("Euro", "EUR", "Euros", 0.0047,"Pesos argentinos a Euros", "Euros a Pesos argentinos");
        Divisas libra = new Divisas("Libra", "GBP", "Libras", 0.0041,"Pesos argentinos a Libras", "Libras a Pesos argentinos");
        Divisas yen = new Divisas("Yen", "JPY", "Yenes", 0.66,"Pesos argentinos a Yenes", "Yenes a Pesos argentinos");
        Divisas won = new Divisas("Won", "KRW", "Wones", 6.48,"Pesos argentinos a Wones", "Wones a Pesos argentinos");
        int x=abrirMenuPrincipal();
        if (x==2) {
            JOptionPane.showMessageDialog(null, "Cerrando programa");
            System.exit(0);
        }else if(x==0) {
            Operaciones.abrirMenuDivisas(dolar,euro,libra,yen,won);
        }else if(x==1) {
            Operaciones.abrirMenuTemperatura();
        }
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


package com.mycompany.poo.cursoemvideo;
public class PooCursoemvideo {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.rabiscar();
        c1.tampar();
        c1.rabiscar();
    }
    
}

package org.example;

public class Conta {
    public double saldo;

    public void sacar(double valorASacar){
        saldo = saldo - valorASacar;
        System.out.println("Saldo " + saldo);
    }

    public void depositar(double valorADepositar){
        saldo = saldo + valorADepositar;
        System.out.println("Saldo " + saldo);
    }
}

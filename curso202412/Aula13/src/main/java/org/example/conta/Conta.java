package org.example.conta;

import org.example.pessoa.Pessoa;

public class Conta {

    private Pessoa titular;
    private int numero;
    private double saldo;

    public Conta(int numero, Pessoa titular){
        this.numero = numero;

    }

    public Conta(int numero, Pessoa titular, double saldoInicial){
        this.numero = numero;
        this.saldo = saldoInicial;
        // this.depositar(saldoInicial); outra forma
    }

    public boolean sacar(double valorASacar){
        if(saldo >= valorASacar){
            saldo = saldo - valorASacar;
            return true;
        }
        return false;
    }

    public void depositar(double valorADepositar){
        saldo = saldo + valorADepositar;
    }

    public boolean transferir(Conta contaDestino, double valorATransferir) {
        boolean foiPossivelSacar = this.sacar(valorATransferir);
        if (foiPossivelSacar) {
            contaDestino.depositar(valorATransferir);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}

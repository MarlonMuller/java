package org.example;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero){
        this.numero = numero;
    }

    public Conta(int numero, double saldoInicial){
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
}

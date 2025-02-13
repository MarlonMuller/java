package com.mycompany.aula05;

import com.mycompany.aula05.Pessoa;

public class ContaBanco {
    private int numConta;
    private String tipoConta;
    private Pessoa pessoa;
    private int saldo = 0;
    
    public ContaBanco(int numConta, String tipoConta, Pessoa pessoa){
        this.numConta = numConta;
        this.pessoa = pessoa;
        this.tipoConta = tipoConta;
    }
    
    public void depositar(int valor){
        this.saldo = saldo + valor;
    }
    
    public void sacar(int valor) {
        this.saldo = saldo - valor;
    }
    
    public String getNome(){
        return this.pessoa.getNome();
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public String getTipoConta(){
        return this.tipoConta;
    }
    
    public void extratoBancario(){
        System.out.println("A conta do(a) " + getNome() + " possui "+ getSaldo() + " reais e é uma conta do tipo " + getTipoConta());
    }
}

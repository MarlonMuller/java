package com.mycompany.aula05;

public class Aula05 {

    public static void main(String[] args) {
        Pessoa jubileu = new Pessoa("Jubileu", 123);
        Pessoa creusa = new Pessoa("Creusa", 456);
        
        ContaBanco contaJubileu = new ContaBanco(1, "poupança", jubileu);
        ContaBanco contaCreusa = new ContaBanco(2, "corrente", creusa);
        
        contaJubileu.depositar(300);
        
        contaCreusa.depositar(500);
        contaCreusa.sacar(100);
        
        contaJubileu.extratoBancario();
        contaCreusa.extratoBancario();
        
    }
}

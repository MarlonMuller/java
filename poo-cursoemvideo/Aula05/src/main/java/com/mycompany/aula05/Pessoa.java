package com.mycompany.aula05;


public class Pessoa {
    private String nome;
    private int CPF;    
    
    public Pessoa(String nome, int CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return this.nome;
    }
    
}

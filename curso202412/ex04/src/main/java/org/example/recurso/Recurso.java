package org.example.recurso;

public class Recurso {

    private final String nome;
    private final int valor;
    private final int peso;

    public Recurso(String nome, int valor, int peso){
        if(valor <= 0 || peso <= 0){
            throw new IllegalArgumentException("Valor e peso devem ser maiores que zero.");
        }
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }
    public int getValor(){
        return valor;
    }
    public int getPeso(){
        return peso;
    }

}

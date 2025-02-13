package org.example;

public class Pessoa {
    // Atributos -> dados
    public String nome;
    public int idade;
    public double altura;
    public char sexo;
    public boolean possuiDeficienca;

    // Comportamentos -> métodos
    public void apresentarse() {
        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");
    }
    }

package org.example.planeta;

import org.example.recurso.Recurso;

import java.util.List;

public class Planeta {

    private int posicao;
    private List<Recurso> recursos;

    public Planeta(int posicao, List<Recurso> recursos){
        this.posicao = posicao;
        this.recursos = recursos;
    }

    public int getPosicao(){
        return posicao;
    }
    public List<Recurso> getRecursos(){
        return recursos;
    }

    public int getValorTotal(){
        return recursos.stream().mapToInt(Recurso::getValor).sum();
    }

    public double getValorPorPeso(){
        return recursos.stream().mapToDouble(recurso -> (double) recurso.getValor() / recurso.getPeso()).sum();
    }
}

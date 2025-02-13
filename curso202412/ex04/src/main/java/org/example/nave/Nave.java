package org.example.nave;

import org.example.planeta.Planeta;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private int posicao = 0;
    private int quantidadeDeCombustivel;

    public Nave(int quantidadeDeCombustivel){
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public int getPosicao(){
        return posicao;
    }
    public int getQuantidadeDeCombustivel(){
        return quantidadeDeCombustivel;
    }

    public List<String> explorar(Planeta planeta){

        int distancia = Math.abs(planeta.getPosicao() - posicao);
        int combustivelNecessario = distancia * 3;

        if(combustivelNecessario > quantidadeDeCombustivel){
            posicao += (quantidadeDeCombustivel / 3) * Integer.signum(planeta.getPosicao() - posicao);
            quantidadeDeCombustivel = 0;
            return new ArrayList<>();
        }

        posicao = planeta.getPosicao();
        quantidadeDeCombustivel -= combustivelNecessario;

        List<String> recursosExplorados = new ArrayList<>();
        planeta.getRecursos().forEach(recurso -> recursosExplorados.add(recurso.getNome()));

        int combustivelParaRetornar = planeta.getPosicao();
        if(quantidadeDeCombustivel >= combustivelParaRetornar){
            quantidadeDeCombustivel -= combustivelParaRetornar;
            posicao = 0;
        }

        return recursosExplorados;
    }
}

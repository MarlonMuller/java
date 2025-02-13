package org.example;

public class CalculadorComissao {
    // Qual é o problema? Criar um sistema que calcule o valor de comissão de um vendedor a partir do valor vendido
    // Quais são os dados necessários? Valor vendido e o percentual de comissão
    // Quais as operações necessárias? Calcular o valor da comissão com a fómula = (valorVendido * percentualComissão) / 100

    public double valorVendido;
    public double percentualComissao;

    public double calcularValorComissao(){
        return (valorVendido * percentualComissao) / 100;
    }
}

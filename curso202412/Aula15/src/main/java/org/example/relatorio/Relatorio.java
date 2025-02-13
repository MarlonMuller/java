package org.example.relatorio;

import org.example.pessoa.Gerente;
import org.example.pessoa.Vendedor;
import org.example.pessoa.Funcionario;

public class Relatorio {
    public void imprimirDados(Funcionario funcionario) {
        System.out.println("Nome funcionario: " + funcionario.getNome() +
                " | Salário: " + funcionario.getSalario() +
                " | Salário com bonificação: " + funcionario.getSalarioComBonus());
    }

}

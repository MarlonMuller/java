package org.example.pessoa;

public class Gerente extends Funcionario{

    private boolean gerenteRegional;

    public Gerente(String nome, String cpf, String rg, String matricula){
        super(nome, rg, cpf, matricula);
    }

    public Gerente(String nome, String cpf, String rg, String matricula, boolean isGerenteRegional){
        super(nome, rg, cpf, matricula);
        this.gerenteRegional = isGerenteRegional;
    }

    public boolean isGerenteRegional() {
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional) {
        this.gerenteRegional = gerenteRegional;
    }
}

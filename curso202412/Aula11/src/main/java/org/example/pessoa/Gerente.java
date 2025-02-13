package org.example.pessoa;

public class Gerente extends Funcionario{
    public static final double PERCENTUAL_PADRAO_BONUS_GERENTE_REGIONAL = 20;

    private boolean gerenteRegional;

    public Gerente(String nome, String cpf, String rg, String matricula){
        super(nome, rg, cpf, matricula);
    }

    public Gerente(String nome, String cpf, String rg, String matricula, boolean isGerenteRegional){
        super(nome, rg, cpf, matricula);
        this.gerenteRegional = isGerenteRegional;
    }

    public double getSalarioComBonus(){

        if(isGerenteRegional()){
            return this.salario + ((this.salario * PERCENTUAL_PADRAO_BONUS_GERENTE_REGIONAL) / CEM);
        }
        return super.getSalarioComBonus();
    }

    public boolean isGerenteRegional() {
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional) {
        this.gerenteRegional = gerenteRegional;
    }
}

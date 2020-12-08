package br.com.comissaoAbstrata;

import br.com.comissaoAbstrata.Funcionario.Atendente;
import br.com.comissaoAbstrata.Funcionario.FuncionarioAbstract;
import br.com.comissaoAbstrata.Funcionario.Gerente;

public enum EnumCargo {
    ATENDENTE("A","Atendente"),
    GERENTE("G","Gerente"),
     VENDEDOR("V", "Vendedor") ;

    private String sigla;
    private String descricao;

    EnumCargo(String sigla, String descricao) {
        this.sigla = sigla;
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

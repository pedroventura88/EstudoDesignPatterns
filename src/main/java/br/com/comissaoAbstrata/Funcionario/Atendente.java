package br.com.comissaoAbstrata.Funcionario;

import br.com.comissaoAbstrata.EnumCargo;

import java.util.Objects;

public class Atendente extends FuncionarioAbstract {

    @Override
    public String getCargo() {
        return EnumCargo.ATENDENTE.getDescricao();
    }

    @Override
    public double calcularComissao() {
        return this.getVendas() * 0.1;
    }
}

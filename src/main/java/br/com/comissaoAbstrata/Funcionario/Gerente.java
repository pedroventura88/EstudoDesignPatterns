package br.com.comissaoAbstrata.Funcionario;

import br.com.comissaoAbstrata.EnumCargo;

import java.util.Objects;

public class Gerente extends FuncionarioAbstract {

    @Override
    public String getCargo() {
        return EnumCargo.GERENTE.getDescricao();
    }

    @Override
    public double calcularComissao() {
        return (this.getVendas() * 0.5) + 10;
    }
}

package br.com.comissaoAbstrata.Funcionario;

import br.com.comissaoAbstrata.EnumCargo;

public class Vendedor extends FuncionarioAbstract {
    @Override
    public String getCargo() {
        return EnumCargo.VENDEDOR.getDescricao();
    }

    @Override
    public double calcularComissao() {
        return this.getVendas() * 0.1;
    }
}

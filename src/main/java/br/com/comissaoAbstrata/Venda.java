package br.com.comissaoAbstrata;

import br.com.comissaoAbstrata.Funcionario.FuncionarioAbstract;

public class Venda {
    private final FuncionarioAbstract funcionarioAbstract;

    public Venda(FuncionarioAbstract funcionarioAbstract) {
        this.funcionarioAbstract = funcionarioAbstract;
    }

    public double calcularComissao() {
        return funcionarioAbstract.calcularComissao();
    }
}

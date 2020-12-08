package br.com.comissaoAbstrata;

import br.com.comissaoAbstrata.Funcionario.Atendente;
import br.com.comissaoAbstrata.Funcionario.FuncionarioAbstract;
import br.com.comissaoAbstrata.Funcionario.Gerente;

import java.util.Arrays;
import java.util.List;

public class FuncionarioDBMock {
    public static List<FuncionarioAbstract> listaDeFuncionarios() {
        FuncionarioAbstract gerente = FuncionarioFactory.getInstance(EnumCargo.GERENTE);
        gerente.setSalario(2000.0);
        gerente.setNome("Zézim");
        Vendas vendas = new Vendas();
        vendas.setValor(3000);
        gerente.setVenda(Arrays.asList(vendas));

        FuncionarioAbstract atendente = FuncionarioFactory.getInstance(EnumCargo.ATENDENTE);
        atendente.setSalario(1000.0);
        Vendas vendas2 = new Vendas();
        vendas2.setValor(3000);
        atendente.setVenda(Arrays.asList(vendas2));
        atendente.setNome("carlos");

        FuncionarioAbstract atendente2 = FuncionarioFactory.getInstance(EnumCargo.ATENDENTE);
        atendente2.setSalario(1000.0);
        atendente2.setNome("maria");

        FuncionarioAbstract gerente2 = FuncionarioFactory.getInstance(EnumCargo.GERENTE);
        gerente2.setSalario(3000.0);
        gerente2.setNome("Joao");

        FuncionarioAbstract vendedor = FuncionarioFactory.getInstance(EnumCargo.VENDEDOR);
        vendedor.setSalario(1000.0);
        vendedor.setNome("Mario");

        return Arrays.asList(gerente, atendente, atendente2, gerente2, vendedor);
    }
}

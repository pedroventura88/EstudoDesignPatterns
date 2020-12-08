package br.com.comissaoAbstrata;

import java.util.Arrays;
import java.util.List;

public class FuncionarioDBMock {
    public static List<FuncionarioAbstract> listaDeFuncionarios() {
        Gerente gerente = new Gerente();
        gerente.setSalario(2000.0);
        gerente.setNome("Zézim");
        gerente.setCargo(FuncionarioFactory.GERENTE.name());

        Atendente atendente = new Atendente();
        atendente.setSalario(1000.0);
        atendente.setNome("carlos");
        atendente.setCargo(FuncionarioFactory.ATENDENTE.name());

        Atendente atendente2 = new Atendente();
        atendente2.setSalario(1200.0);
        atendente2.setNome("maria");
        atendente2.setCargo(FuncionarioFactory.ATENDENTE.name());

        Gerente gerente2 = new Gerente();
        gerente2.setSalario(3000.0);
        gerente2.setNome("Joao");
        gerente2.setCargo(FuncionarioFactory.GERENTE.name());

        return Arrays.asList(gerente, atendente, atendente2, gerente2);
    }
}

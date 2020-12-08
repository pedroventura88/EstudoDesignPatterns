package br.com.comissaoAbstrata;

import br.com.comissaoAbstrata.Funcionario.Atendente;
import br.com.comissaoAbstrata.Funcionario.FuncionarioAbstract;
import br.com.comissaoAbstrata.Funcionario.Gerente;
import br.com.comissaoAbstrata.Funcionario.Vendedor;

public class FuncionarioFactory {

    public static FuncionarioAbstract getInstance(EnumCargo cargo) {
        switch (cargo) {
            case GERENTE:
                return new Gerente();
            case ATENDENTE:
                return new Atendente();
            case VENDEDOR:
                return new Vendedor();
        }
        return null;
    }
}

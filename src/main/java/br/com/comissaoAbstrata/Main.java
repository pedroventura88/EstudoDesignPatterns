package br.com.comissaoAbstrata;

import br.com.comissaoAbstrata.Funcionario.FuncionarioAbstract;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FuncionarioAbstract> listaDb = FuncionarioDBMock.listaDeFuncionarios();

        listaDb.forEach(funcionario -> {
            Venda venda = new Venda(funcionario);
            double comissao = venda.calcularComissao();

            System.out.println("Funcionário: " + funcionario.getNome() + " -  Comissão: " + comissao + " | Salario: "
                    + funcionario.getSalario() + " | TOTAL = " + (funcionario.getSalario() + comissao) + " | Cargo: " + funcionario.getCargo());
        });

    }
}

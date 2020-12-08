package br.com.comissaoAbstrata;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FuncionarioAbstract> listaDb = FuncionarioDBMock.listaDeFuncionarios();

        listaDb.forEach(objeto -> {
            Venda venda = new Venda(objeto, objeto.getSalario());
            double comissao = venda.calcularComissao();

            System.out.println("Funcionário: " + objeto.getNome() + " -  Comissão: " + comissao + " | Salario: "
                    + objeto.getSalario() + " | TOTAL = " + (objeto.getSalario() + comissao) + " | Cargo: " + objeto.getCargo());
        });

    }
}

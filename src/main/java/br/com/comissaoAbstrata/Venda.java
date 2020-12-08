package br.com.comissaoAbstrata;

public class Venda {
    private final FuncionarioAbstract funcionarioAbstract;
    private final Double valor;

    public Venda(FuncionarioAbstract funcionarioAbstract, Double valor) {
        this.funcionarioAbstract = funcionarioAbstract;
        this.valor = valor;
    }

    public double calcularComissao() {
        return funcionarioAbstract.calcularComissao(this.valor);
    }
}

package br.com.comissaoAbstrata;

public class Atendente extends FuncionarioAbstract {
    @Override
    public double calcularComissao(double valor) {
        return valor * 0.1;
    }
}

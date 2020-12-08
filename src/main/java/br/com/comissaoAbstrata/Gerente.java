package br.com.comissaoAbstrata;

public class Gerente extends FuncionarioAbstract{
    @Override
    public double calcularComissao(double valor) {
        return (valor * 0.5) + 10;
    }
}

package br.com.comissaoAbstrata.Funcionario;

import br.com.comissaoAbstrata.Vendas;

import java.util.List;
import java.util.Objects;

public abstract class FuncionarioAbstract {
    private String nome;
    private Double salario;
    private List<Vendas> vendas;

    abstract public  String getCargo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    abstract public double calcularComissao();


    public void setVenda(List<Vendas> vendas) {
        this.vendas = vendas;
    }

    public Integer getVendas() {
        if(Objects.isNull(vendas)){
            return 0;
        }
        return vendas
                .stream()
                .map(x -> x.getValor())
                .reduce(0, Integer::sum);
    }
}

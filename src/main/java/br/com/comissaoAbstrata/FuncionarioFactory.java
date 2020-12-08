package br.com.comissaoAbstrata;

public enum FuncionarioFactory {
    ATENDENTE {
        public FuncionarioAbstract obterFuncionario() {
            return new Atendente();
        }
    },
    GERENTE {
        public FuncionarioAbstract obterFuncionario() {
            return new Gerente();
        }
    };

}

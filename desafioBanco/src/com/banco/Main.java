package com.banco;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");
        ContaCorrente cc = new ContaCorrente(cliente1, 500.0);
        ContaPoupanca cp = new ContaPoupanca(cliente2);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1000.00);
        cp.depositar(200.00);

        cc.sacar(1200.00);
        cc.imprimirExtrato();

        cc.transferir(200.00, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.listarContas();

    }
}

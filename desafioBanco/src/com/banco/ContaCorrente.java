package com.banco;

public class ContaCorrente extends Conta {
    private  double limiteCredito;

    public ContaCorrente(Cliente cliente, double limiteCredito) {
        super(cliente);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor){
        if(this.saldo + this.limiteCredito >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente com o Limite de Credito");
        }
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite de crédito: " + this.limiteCredito);
    }

}

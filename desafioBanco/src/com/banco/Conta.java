package com.banco;

public abstract class Conta implements IConta{
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    @Override
    public  void sacar(double valor) {
        if(valor > 0 ){
            this.saldo -= valor;
        }else {
            System.out.println("Valor de saque inválido");
        }
    }

    @Override
    public void transferir(double valor, IConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

}

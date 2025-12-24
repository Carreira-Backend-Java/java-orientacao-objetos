package br.com.alura.screenmatch.desafios.contaBancaria;

public class ContaBancaria {
    protected double saldo;

    // Método para Depositar
    public void depositar (double valorDeposito) {
        saldo += valorDeposito;
        System.out.println("Depósito de " + valorDeposito + "realizado. Saldo atual: " + saldo);
    }

    // Método para sacar
    public void sacar (double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque no valor  de " + valorSaque + "realizado com sucesso");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque");
        }
    }

    // Método para consultar saldo
    public void consultarSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }

}

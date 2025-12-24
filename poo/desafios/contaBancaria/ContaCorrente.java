package br.com.alura.screenmatch.desafios.contaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    // Método para descontar uma tarifa mensal
    public void tarifaMensal (double tarifaMensal) {
        if (saldo >= tarifaMensal) {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal descontada com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para a tarifa mensal, seu nome esta SUJO");
        }
    }
}

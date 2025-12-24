package br.com.alura.screenmatch.desafios.contaBancaria;

public class TesteConta {
    static void main() {
        // Inicializando conta bancária
        ContaBancaria cb = new ContaBancaria();
        cb.depositar(500);
        cb.consultarSaldo();

        // Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        cc.tarifaMensal(8);
        cc.consultarSaldo();
        cc.sacar(100);
        cc.consultarSaldo();
    }
}

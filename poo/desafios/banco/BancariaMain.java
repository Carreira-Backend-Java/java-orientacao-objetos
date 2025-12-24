package br.com.alura.screenmatch.desafios.banco;

public class BancariaMain {
    static void main() {

        // Instanciar a classe
        ContaBancaria cb = new ContaBancaria();

        // Dados (SET)
        cb.titular = "Henrique";
        cb.setNumeroConta(1);
        cb.setSaldo(9422.53);

        // Imprimir Informações (GET)
        cb.Titulo();
        System.out.println("\nTitular: " + cb.titular);
        System.out.println("Número da Conta: " + cb.getNumeroConta());
        System.out.println("Saldo: " + cb.getSaldo());

        cb.setSaldo(7000);
        System.out.println("Novo Saldo: " + cb.getSaldo());
    }
}

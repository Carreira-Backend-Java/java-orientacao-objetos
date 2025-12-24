package br.com.alura.screenmatch.desafios.carro;

public class TesteCarro {
    static void main() {
        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.definirModelo("Chevrolet Celta");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}

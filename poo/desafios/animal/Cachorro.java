package br.com.alura.screenmatch.desafios.animal;

public class Cachorro extends Animal{

    // Método sobrescrito
    @Override
    public void emitirSom() {
        System.out.println("AUAU");;
    }

    // Método próprio do cachorro
    public void abanarRabo() {
        System.out.println("Abana o Rabo");
    }
}

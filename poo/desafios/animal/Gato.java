package br.com.alura.screenmatch.desafios.animal;

public class Gato extends Animal {

    // Método sobrescrito
    @Override
    public void emitirSom() {
        System.out.println("MIAU");;
    }

    // Método próprio do gato
    public void arranharMoveis() {
        System.out.println("Arranha Moveis");
    }
}

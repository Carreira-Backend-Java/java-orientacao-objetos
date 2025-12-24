package br.com.alura.screenmatch.desafios.animal;

public class TesteAnimal {
    static void main() {
        // Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        // Gato
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}

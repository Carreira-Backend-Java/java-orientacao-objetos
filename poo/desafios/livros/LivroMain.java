package br.com.alura.screenmatch.desafios.livros;

public class LivroMain {
    static void main() {
        Livro livro = new Livro();

        livro.setTitulo("O Principe");
        livro.setAutor("Maquiavel");

        livro.exibirDetalhes();
    }
}

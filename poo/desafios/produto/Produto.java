package br.com.alura.screenmatch.desafios.produto;

public class Produto {
    // Visibilidade, tipo e atributo
    private String nome;
    private double preco;
    public double desconto;

    // Método Setter e Getter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Aplicar Desconto
    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }
}

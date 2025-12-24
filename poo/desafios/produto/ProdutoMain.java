package br.com.alura.screenmatch.desafios.produto;

public class ProdutoMain {
    static void main() {
        Produto p = new Produto();

        p.setNome("Camisa Nike Dry-Fit");
        p.setPreco(249.99);

        System.out.println("\n\n***********************");
        System.out.println("PRODUTO: " + p.getNome());
        System.out.println("PRECO: " + p.getPreco());
        System.out.println("**************************");

        p.aplicarDesconto(50);
        System.out.println("\nNovo Preço após Desconto: " + p.getPreco());

    }
}

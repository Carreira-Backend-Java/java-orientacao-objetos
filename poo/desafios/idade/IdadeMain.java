package br.com.alura.screenmatch.desafios.idade;

public class IdadeMain {
    static void main() {
        // PESSOA 1
        IdadePessoa ip1 = new IdadePessoa();

        ip1.setNome("Henrique Backend");
        ip1.setIdade(18);

        // PESSOA 2
        IdadePessoa ip2 = new IdadePessoa();

        ip2.setNome("Henrique Frontend");
        ip2.setIdade(11);

        // Imprimir Dados da Pessoa 1
        System.out.println("NOME: " + ip1.getNome());
        System.out.println("IDADE: " + ip1.getIdade());

        System.out.println("\n**********************");
        System.out.println("VERIFICANDO ENTRADA...");
        System.out.println("**********************");

        ip1.verificarIdade();

        // Imprimir Dados Da Pessoa 2
        System.out.println("NOME: " + ip2.getNome());
        System.out.println("IDADE: " + ip2.getIdade());

        System.out.println("\n**********************");
        System.out.println("VERIFICANDO ENTRADA...");
        System.out.println("**********************");

        ip2.verificarIdade();

    }
}

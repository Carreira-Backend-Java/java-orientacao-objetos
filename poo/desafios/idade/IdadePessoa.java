package br.com.alura.screenmatch.desafios.idade;

public class IdadePessoa {

    private String nome;
    private int idade;

    // Método Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para verificar se a pessoa é maior de idade
    public void verificarIdade () {
        if (idade >= 18) {
            System.out.println("Maior de idade | Entrada Liberada");
        }else {
            System.out.println("Menor de idade | Entrada Negada");
        }
    }

}

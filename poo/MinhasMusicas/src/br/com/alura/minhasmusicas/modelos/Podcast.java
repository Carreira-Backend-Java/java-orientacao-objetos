package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{

    // Visibilidade, tipo e atributo
    private String apresentador;
    private String descricao;

    // Método Setter e Getter
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 0;
        }
    }
}

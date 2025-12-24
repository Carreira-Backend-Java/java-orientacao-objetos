package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtro (Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momentos");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }

}

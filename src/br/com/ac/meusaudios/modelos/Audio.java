package br.com.ac.meusaudios.modelos;

public abstract class Audio {
    protected String titulo;
    protected int totalReproducoes;
    protected int totalCurtidas;
    protected int classificacao;
    protected int totalAvaliacoes;
    protected int somaNotas;

    public Audio(String titulo) {
        this.titulo = titulo;
    }

    public void curte() {
        totalCurtidas++;
    }

    public void reproduz() {
        totalReproducoes++;
    }

    public void avalia(int nota) {
        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida!\nInforme um valor de 1 a 5.");
            return;
        }
        somaNotas += nota;
        totalAvaliacoes++;
        classificacao = somaNotas / totalAvaliacoes;
    }

    public abstract void exibeDetalhes();

    public int getClassificacao() {
        return classificacao;
    }
}

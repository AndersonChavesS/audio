package br.com.ac.meusaudios.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public Podcast(String titulo, String host, String descricao) {
        super(titulo);
        this.host = host;
        this.descricao = descricao;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Podcast: " + titulo);
        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
        System.out.println("Total de Curtidas: " + totalCurtidas);
        System.out.println("Total de Reproduções: " + totalReproducoes);
        System.out.println("Classificação: " + classificacao);
        System.out.println();
    }
}

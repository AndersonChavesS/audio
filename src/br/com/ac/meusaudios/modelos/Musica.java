package br.com.ac.meusaudios.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String genero;

    public Musica(String titulo, String album, String artista, String genero) {
        super(titulo);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Música: " + titulo);
        System.out.println("Álbum: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        System.out.println("Total de Curtidas: " + totalCurtidas);
        System.out.println("Total de Reproduções: " + totalReproducoes);
        System.out.println("Classificação: " + classificacao);
        System.out.println();
    }
}

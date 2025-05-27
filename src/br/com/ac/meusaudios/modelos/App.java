package br.com.ac.meusaudios.modelos;

public class App {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Fear of the Dark", "Fear of the Dark", "Iron Maiden", "Metal");
        Podcast podcast1 = new Podcast("DevTalks", "Anderson Chaves", "Discussões sobre desenvolvimento.");

        musica1.reproduz();
        musica1.curte();
        musica1.avalia(5);
        musica1.avalia(4);
        musica1.exibeDetalhes();

        podcast1.reproduz();
        podcast1.reproduz();
        podcast1.curte();
        podcast1.avalia(5);
        podcast1.avalia(3);
        podcast1.exibeDetalhes();
    }
}



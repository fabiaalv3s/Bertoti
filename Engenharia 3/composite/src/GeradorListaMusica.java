public class GeradorListaMusica {
    public static void main(String[] args){
        ComponentMusica todaMusica = new GrupoMusica("Lista Musical", "todas musica disponiveis");

        ComponentMusica industrialMusic = new GrupoMusica
                ("Industrial", "é um estilo de música experimental que se baseia em temas transgressivos e provocativos.");


        ComponentMusica heavyMetalMusic = new GrupoMusica
            ("\nHeavy Metal", "é um gênero de rock que se desenvolveu no final dos anos 1960, principalmente no Reino Unido e nos Estados Unidos.\n");


        ComponentMusica sertanejoMusic = new GrupoMusica
                ("\nSertanejo", " é um gênero musical do Brasil produzido a partir da década de 1910 por compositores urbanos e rurais.\n");

        todaMusica.add(industrialMusic);

        industrialMusic.add(new Musica("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Musica("Headhunter", "Front 242", 1988));


        industrialMusic.add(sertanejoMusic);

        sertanejoMusic.add(new Musica("Vestido de Seda", "Teodoro e Sampaio", 1984));
        sertanejoMusic.add(new Musica("Pagode em Brasília", "Tião Carreiro e Pardinho", 1960));

        // This is a SongGroup that just holds Songs

        todaMusica.add(heavyMetalMusic);

        heavyMetalMusic.add(new Musica("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Musica("Ace of Spades", "Motorhead", 1980));

        DiscJockey crazyLarry = new DiscJockey(todaMusica);

        crazyLarry.getListaMusica();



    }
}

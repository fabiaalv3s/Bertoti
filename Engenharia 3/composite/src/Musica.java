public class Musica implements ComponentMusica{
    String nomeMusica;
    String nomeBanda;
    int anoLancamento;

    public Musica(String newNomeMusica, String newNomeBanda, int newAnoLancamento){

        nomeMusica = newNomeMusica;
        nomeBanda = newNomeBanda;
        anoLancamento = newAnoLancamento;

    }

    public String getNomeMusica(){
        return nomeMusica;
    }

    public String getNomeBanda(){
        return nomeBanda;
    }

    public int getAnoLancamento(){
        return anoLancamento;
    }
    public void displayInfoMusica(){
        System.out.println(getNomeMusica() + " foi gravado por " +
                getNomeBanda() + " em " + getAnoLancamento());

    }
}



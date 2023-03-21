public class DiscJockey {
    ComponentMusica listaMusica;

    public DiscJockey(ComponentMusica newListaMusica) {
        listaMusica = newListaMusica;
    }

    public void getListaMusica(){
        listaMusica.displayInfoMusica();
    }
}

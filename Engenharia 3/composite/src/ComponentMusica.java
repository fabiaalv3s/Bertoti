public interface ComponentMusica {
    default void add(ComponentMusica componentMusica){
        throw new UnsupportedOperationException();
    }

    //REMOVENDO COMPONENTS
    private void remove(ComponentMusica newComponentMusica){
        throw new UnsupportedOperationException();
    }

    //PEGANDO COMPONENTS
    private ComponentMusica getComponent(int componentIndex){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME DA MUSICA
    private String getNomeMusica(){
        throw new UnsupportedOperationException();
    }

    //RETORNA NOME DA BANDA
    private String getNomeBanda(){
        throw new UnsupportedOperationException();
    }

    //RETORNA O ANO
    private int getAnoLancamento(){
        throw new UnsupportedOperationException();
    }

    default void displayInfoMusica(){
        throw new UnsupportedOperationException();
    }
}

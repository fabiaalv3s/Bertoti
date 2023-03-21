import java.util.ArrayList;
import java.util.Iterator;

public class GrupoMusica implements ComponentMusica {

    ArrayList componentsMusica = new ArrayList();

    String nomeGrupo;
    String descricaoGrupo;

    public GrupoMusica(String newNomeGrupo, String newDescricaoGrupo) {
        nomeGrupo = newNomeGrupo;
        descricaoGrupo = newDescricaoGrupo;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    public void add(ComponentMusica newComponentMusica) {
        componentsMusica.add(newComponentMusica);
    }

    public void remove(ComponentMusica newComponenMusica) {
        componentsMusica.remove(newComponenMusica);
    }

    public ComponentMusica getComponent(int componentIndex) {
        return (ComponentMusica) componentsMusica.get(componentIndex);

    }

    public void displayInfoMusica() {
        System.out.println(getNomeGrupo() + " " +
                getDescricaoGrupo() + "\n");

        Iterator musicaIterator = componentsMusica.iterator();


        while(musicaIterator.hasNext()){
            ComponentMusica infoMusica = (ComponentMusica) musicaIterator.next();
            infoMusica.displayInfoMusica();

        }
    }

}

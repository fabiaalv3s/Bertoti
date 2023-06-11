package controler;

import model.Catalogo;
import view.View;

public class TipoInteira implements Ingresso{

    private View v;
    private Catalogo c;

    public void setV(View view){
        v = view;
    }

    public void emitirIngresso(){
        v.imprimirDadosFilme();
    }

}
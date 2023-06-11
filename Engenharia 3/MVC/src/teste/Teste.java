package teste;

import controler.TipoMeiaItau;
import view.View;
import model.Filme;
import model.Catalogo;

public class Teste {

    public static void main(String[] args) {

        System.out.println("===  Ingresso para o filme  ===");

        Catalogo c = new Catalogo();
        c.adicionarFilme("Interestelar", 2014);
        c.adicionarFilme("O Predestinado", 2014);

        View v = new View();
        c.registerObserver(v);

        TipoMeiaItau tmi = new TipoMeiaItau();
        v.setI(tmi);
        tmi.setV(v);

        c.buscarFilmePorTitulo("Interestelar");

    }

}


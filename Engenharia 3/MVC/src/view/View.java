package view;

import java.util.List;

import model.Filme;

import controler.Ingresso;

public class View implements Observer{

    private Ingresso i;
    private List listaFilmes;

    public void setI(Ingresso ingresso){
        i = ingresso;
    }

    public void update(List l){
        listaFilmes = l;
        i.emitirIngresso();

    }

    public void imprimirDadosFilme(){
        if(!listaFilmes.isEmpty()){
            for(Object j: listaFilmes){
                Filme f = (Filme)j;
                System.out.println(f.getTitulo()+" "+f.getAno());
            }
        }

    }

    public void imprimirTipoMeiaItau(){
        System.out.println("\nTipo: meia (itaú)");
        System.out.println("CPF do portador: xxx.xxx.xxx-xx");
    }

}


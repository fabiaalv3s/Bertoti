package model;

public class Filme {

    private String titulo;
    private int ano;

    public Filme(String t, int a){
        titulo = t;
        ano = a;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getAno(){
        return ano;
    }

    public boolean matches(Filme f){
        if(!titulo.equals(f.titulo)) return false;
        if(ano!=f.ano) return false;
        return true;
    }

}


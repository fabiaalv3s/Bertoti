public class Tarefa {
    private String titulo;
    private String professor;

    public Tarefa(String titulo, String professor){
        this.titulo = titulo;
        this.professor = professor;

    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getProfessor(){
        return this.professor;
    }

}

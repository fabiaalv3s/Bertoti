
import java.util.ArrayList;
import java.util.List;

public class Teams {
    private List<Observer> observers;
    private List<Tarefa> tarefas;

    public Teams(){
        this.observers = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
    public List<Observer> getObservers(){
        return this.observers;
    }

    public void notificarTodos(String msg){
        this.observers.stream().forEach(item -> {
            System.out.println(msg);
        });
    }

    public void addTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
        notificarTodos(String.format("Olá, uma nova tarefa de " + tarefa.getTitulo() + " foi adicionada ao canal pelo professor " + tarefa.getProfessor()));
    }

    public void removeTarefa(Tarefa tarefa){
        this.tarefas.remove(tarefa);
        notificarTodos(String.format("Olá, a tarefa " + tarefa.getTitulo() + " foi removida do canal pelo professor " + tarefa.getProfessor()));
    }

    public List<Tarefa> getTarefas(){
        return this.tarefas;
    }
}

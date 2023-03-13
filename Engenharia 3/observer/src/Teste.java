public class Teste {
    public static void main(String[] args) {

        Teams t = new Teams();
        DisplayDesktop tela = new DisplayDesktop();
        DisplayMobile cel = new DisplayMobile();

        t.addObserver(tela);
        t.addObserver(cel);

        Tarefa tarefa = new Tarefa("Quimica", "Fabio");
        t.addTarefa(tarefa);

        t.removeObserver(tela);
        t.removeObserver(cel);


        t.removeTarefa(tarefa);

    }
}

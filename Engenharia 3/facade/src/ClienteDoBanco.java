public class ClienteDoBanco {
    private String nome;

    public String obterNomeDoCliente(){
        return this.nome;
    }

    public ClienteDoBanco(){}

    public ClienteDoBanco (String nome){
        this.nome = nome;
    }

}

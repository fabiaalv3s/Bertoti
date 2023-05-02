public class ContaBancaria {
    private String conta;
    private int saldo;

    public int depositar(int valor){
        System.out.println("Depositando...");
        return this.setSaldo(this.getSaldo() + valor);
    }

    public String obterNumConta(){
        System.out.println("Obtendo número de conta...");
        return this.conta;
    }

    public int obterSaldo(){
        System.out.println("Obtendo saldo...");
        return this.getSaldo();
    }

    public ContaBancaria(){}

    public ContaBancaria(String conta){
        this.conta = conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public int setSaldo(int saldo) {
        this.saldo = saldo;
        return saldo;
    }
}
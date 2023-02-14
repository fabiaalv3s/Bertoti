public class main {
    public static void main(String[] args) {
        System.out.println("---- ANÁLISE CARRO ----");
        System.out.println("#Câmbio");
        Carro carro = new Carro();
        carro.setCambio(new Automatico());
        carro.utilizarCambio();

        carro.setCambio(new Manual());
        carro.utilizarCambio();
    }
}

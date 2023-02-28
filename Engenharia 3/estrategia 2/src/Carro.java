public class Carro {
    private Cambio cambio;
    private Combustivel combustivel;
    public void setCambio(Cambio scambio){
        cambio = scambio;
    }

    public void utilizarCambio(){
        cambio.acelerar();

    }

    public void setCombustivel(Combustivel scombustivel){
        combustivel = scombustivel;
    }

    public void injetarCombustivel(){
        combustivel.injetar();
    }



}

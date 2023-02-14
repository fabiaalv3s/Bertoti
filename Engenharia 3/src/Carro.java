public class Carro {
    private Cambio cambio;
    public void setCambio(Cambio scambio){
        cambio = scambio;
    }

    public void utilizarCambio(){
        cambio.acelerar();

    }


}

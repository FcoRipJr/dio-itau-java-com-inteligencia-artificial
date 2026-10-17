package exercicios.e4.q3;

public class RelogioBrasileiro extends Relogio {

    public RelogioBrasileiro(int hora, int minuto, int segundo){
        super(0, 23, hora, minuto, segundo);
    }

    @Override
    public void sincronizar(Relogio relogio){
        setHora(relogio.getHoraEm24h());
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());
    }
}

package exercicios.e4.q3;

public class RelogioAmericano extends Relogio {
    private boolean pm; // true: PM, false: AM

    public RelogioAmericano(int hora, int minuto, int segundo, boolean pm){
        super(1, 12, hora, minuto, segundo);
        this.pm = pm;
    }

    public boolean isPm(){
        return this.pm;
    }

    public void setPm(boolean pm){
        this.pm = pm;
    }

    @Override
    public int getHoraEm24h(){
        if(this.hora == 12){
            return this.pm ? 12 : 0;
        }
        return this.pm ? this.hora + 12 : this.hora;
    }

    @Override
    public void sincronizar(Relogio relogio){
        int horaEm24h = relogio.getHoraEm24h();
        this.pm = horaEm24h >= 12;
        int horaEm12h = horaEm24h % 12;
        setHora(horaEm12h == 0 ? 12 : horaEm12h);
        setMinuto(relogio.getMinuto());
        setSegundo(relogio.getSegundo());
    }

    @Override
    public String getFormatada(){
        return super.getFormatada() + (this.pm ? " PM" : " AM");
    }
}

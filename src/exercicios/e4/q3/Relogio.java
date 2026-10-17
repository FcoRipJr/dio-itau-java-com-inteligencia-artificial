package exercicios.e4.q3;

public abstract class Relogio {
    protected final int segundoEMinutoMaximo = 59;
    protected final int horaMinima;
    protected final int horaMaxima;
    protected int hora;
    protected int minuto;
    protected int segundo;

    protected Relogio(int horaMinima, int horaMaxima, int hora, int minuto, int segundo){
        this.horaMinima = horaMinima;
        this.horaMaxima = horaMaxima;
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora){
        validar("Hora", hora, this.horaMinima, this.horaMaxima);
        this.hora = hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto){
        validar("Minuto", minuto, 0, segundoEMinutoMaximo);
        this.minuto = minuto;
    }

    public int getSegundo(){
        return this.segundo;
    }

    public void setSegundo(int segundo){
        validar("Segundo", segundo, 0, segundoEMinutoMaximo);
        this.segundo = segundo;
    }

    public int getHoraEm24h(){
        return this.hora;
    }

    public String getFormatada(){
        return formatar(this.hora)+":"+formatar(this.minuto)+":"+formatar(this.segundo);
    }

    public abstract void sincronizar(Relogio relogio);

    static String formatar(int valor){
        return String.format("%02d", valor);
    }

    private static void validar(String campo, int valor, int minimo, int maximo){
        if(valor < minimo || valor > maximo){
            throw new IllegalArgumentException(
                String.format("%s inválido(a): %s (permitido de %s a %s)", campo, valor, minimo, maximo));
        }
    }
}

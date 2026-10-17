package exercicios.e4.q1;

public abstract class Ingresso {
    protected double valor; 
    protected String nomeFilme; 
    protected boolean isDubladoOuLegendado; // true: dublado, false: legendado 
    
    public Ingresso( double valor, String nomeFilme, boolean isDubladoOuLegendado){
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.isDubladoOuLegendado = isDubladoOuLegendado;
    }

    public boolean getIsDubladoOuLegendado(){
        return this.isDubladoOuLegendado;
    }

    public void setIsDubladoOuLegendado(boolean isDubladoOuLegendado){
        this.isDubladoOuLegendado = isDubladoOuLegendado;
    }

    public String getTipoLinguagem(){
        return this.isDubladoOuLegendado ? "Dublado" : "Legendado";
    }

    public abstract double getValorReal();
}

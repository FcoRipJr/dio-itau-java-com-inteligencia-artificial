package exercicios.e4.q1;

public class IngressoMeiaEntrada extends Ingresso {
    final private String tipoMeia;

    public IngressoMeiaEntrada( String tipoMeia, double valor, String nomeFilme, boolean isDubladoOuLegendado){
        super(valor, nomeFilme, isDubladoOuLegendado);
        this.tipoMeia = tipoMeia;
    }

    public double getValorReal(){
        if(this.valor>0){
            return this.valor / 2;
        }
        return 0;
    }

    public String getTipoMeia(){
        return this.tipoMeia;
    }
}

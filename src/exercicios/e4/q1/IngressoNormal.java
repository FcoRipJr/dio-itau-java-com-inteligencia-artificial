package exercicios.e4.q1;

public class IngressoNormal extends Ingresso {

    public IngressoNormal( double valor, String nomeFilme, boolean isDubladoOuLegendado){
        super(valor, nomeFilme, isDubladoOuLegendado);
    }

    public double getValorReal(){
        if(this.valor>0){
            return this.valor;
        }
        return 0;
    }
}

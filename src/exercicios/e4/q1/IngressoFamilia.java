package exercicios.e4.q1;

public class IngressoFamilia extends Ingresso {
    final private int quantidadePessoas;

    public IngressoFamilia( int quantidadePessoas, double valor, String nomeFilme, boolean isDubladoOuLegendado){
        super(valor, nomeFilme, isDubladoOuLegendado);
        this.quantidadePessoas = quantidadePessoas;
    }

    public double getValorReal(){
        if(this.valor>0){
            double valorReal = this.valor * this.quantidadePessoas; 
            if(this.quantidadePessoas>3) valorReal -= (valorReal * 0.05);
            return valorReal;
        }
        return 0;
    }

    public int getQuantidadePessoas(){
        return this.quantidadePessoas;
    }
}

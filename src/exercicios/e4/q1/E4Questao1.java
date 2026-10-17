package exercicios.e4.q1;

public class E4Questao1 {
    public void main(){
        double valorBase = 25;
        String nomeFilme = "Avatar";
        boolean isDubladoOuLegendadoTrue = true;
        boolean isDubladoOuLegendadoFalse = false;
        String tipoMeia = "Estudante";
        int tamanhoFamiliaSemDesconto = 3;
        int tamanhoFamiliaComDesconto = 4;
        IngressoNormal normal = new IngressoNormal(valorBase,nomeFilme,isDubladoOuLegendadoFalse);
        System.err.println("\n\n############################");
        System.err.println("Ingresso Normal");
        System.err.printf("\nLinguagem: %s",normal.getTipoLinguagem());
        System.err.printf("\nValor Real: %s",normal.getValorReal());
        System.err.println("############################");

        IngressoMeiaEntrada meiaEntrada = new IngressoMeiaEntrada(tipoMeia,valorBase,nomeFilme,isDubladoOuLegendadoTrue);
        System.err.println("\n\n############################");
        System.err.println("Ingresso Meia Entrada");
        System.err.printf("\nTipo de Meia: %s",meiaEntrada.getTipoMeia());
        System.err.printf("\nLinguagem: %s",meiaEntrada.getTipoLinguagem());
        System.err.printf("\nValor Real: %s",meiaEntrada.getValorReal());
        System.err.println("############################");

        IngressoFamilia Familia1 = new IngressoFamilia(tamanhoFamiliaSemDesconto,valorBase,nomeFilme,isDubladoOuLegendadoTrue);
        System.err.println("\n\n############################");
        System.err.println("Ingresso Familia 1");
        System.err.printf("\nQuantidade de Pessoas: %s",Familia1.getQuantidadePessoas());
        System.err.printf("\nLinguagem: %s",Familia1.getTipoLinguagem());
        System.err.printf("\nValor Real: %s",Familia1.getValorReal());
        System.err.println("############################");

        IngressoFamilia Familia2 = new IngressoFamilia(tamanhoFamiliaComDesconto,valorBase,nomeFilme,isDubladoOuLegendadoTrue);
        System.err.println("\n\n############################");
        System.err.println("Ingresso Familia 2");
        System.err.printf("\nQuantidade de Pessoas: %s",Familia2.getQuantidadePessoas());
        System.err.printf("\nLinguagem: %s",Familia2.getTipoLinguagem());
        System.err.printf("\nValor Real: %s",Familia2.getValorReal());
        System.err.println("############################");
    }
}

package exercicios.e4.q2;

public class Atendente extends Usuario {
    private double valorEmCaixa;
    public boolean isAdmin() { return false;}

    public Atendente (String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.valorEmCaixa = valorEmCaixa;
    }

    public double getValorEmCaixa(){
        return this.valorEmCaixa;
    }

    public boolean receberPagamento(double valor){
        if(! (valor > 0)){
            return false;
        }
        this.valorEmCaixa += valor;
        return true;
    }

    public String fecharCaixa(){
        return "Valor em Caixa: "+this.valorEmCaixa;
    }

    @Override
    public String consultarVendas() {
        throw new UnsupportedOperationException("Este método não é suportado nesta classe filha.");
    }


}

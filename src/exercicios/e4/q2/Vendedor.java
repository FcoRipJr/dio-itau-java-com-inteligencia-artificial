package exercicios.e4.q2;

public class Vendedor extends Usuario {
    private int quantidadeVendas = 0;
    public boolean isAdmin() { return false;}

    public Vendedor (String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean realizarVenda(){
        this.quantidadeVendas++;
        return true;
    }

    @Override 
    public String consultarVendas(){
        return super.consultarVendas() + " "+this.quantidadeVendas;
    }
    
}

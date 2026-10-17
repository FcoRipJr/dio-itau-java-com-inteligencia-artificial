package exercicios.e4.q2;

public class Gerente extends Usuario {
    public boolean isAdmin() { return true;}
    public Gerente (String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public String gerarRelatiorioFinanceiro() {
        return "Relatório Financeiro";
    }
}

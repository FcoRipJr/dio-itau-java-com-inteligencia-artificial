package exercicios.e4.q2;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean logado = false;
    public abstract boolean isAdmin();

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){
        return this.nome;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    protected void setEmail(String email){
        this.email = email;
    }

    public String getSenha(){
        return this.senha;
    }

    protected void setSenha(String senha){
        this.senha = senha;
    }

    public boolean realizarLogin(String email, String senha){
        this.logado = this.email.equals(email) && this.senha.equals(senha);
        return this.logado;
    }

    public boolean realizarLogoff(){
        this.logado = false;
        return !this.logado;
    }

    public boolean alterarDados(String novoEmail){
        this.email = novoEmail; 
        return true;
    }
    
    public boolean alterarSenha(String novaSenha){
        this.senha = novaSenha;
        return true;
    }

    public String consultarVendas(){
        return "Vendas Realizadas: ";
    }

}

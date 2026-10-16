package exercicios.e3.q3;

public class Pet {
    private final String nome;
    private boolean limpo = false;

    public Pet( String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setLimpo(boolean limpo){
        this.limpo = limpo;
    }

    public Boolean isLimpo(){
        return this.limpo;
    }

    public Boolean isSujo(){
        return ! this.limpo;
    }
}

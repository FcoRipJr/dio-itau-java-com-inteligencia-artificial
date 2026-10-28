package desafios_de_projeto.ddp1.estudos.gof.strategy;

public class Robo {
    private Comportamento strategy;


    public Robo(Comportamento strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){
        if ( this.strategy != null) this.strategy.mover();
    }
}

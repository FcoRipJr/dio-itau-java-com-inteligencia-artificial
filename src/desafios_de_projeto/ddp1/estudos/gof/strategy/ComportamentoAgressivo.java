package desafios_de_projeto.ddp1.estudos.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
    @Override 
    public void mover(){
        System.out.println("Movendo-se agressivamente...");
    }
}

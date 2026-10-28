package desafios_de_projeto.ddp1.estudos.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
    @Override 
    public void mover(){
        System.out.println("Movendo-se defensivamente...");
    }
}

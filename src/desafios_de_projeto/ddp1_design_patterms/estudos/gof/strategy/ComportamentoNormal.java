package desafios_de_projeto.ddp1_design_patterms.estudos.gof.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override 
    public void mover(){
        System.out.println("Movendo-se normalmente...");
    }
}

package desafios_de_projeto.ddp1_design_patterms.estudos.gof.strategy;

public class TestStrategy {
    public void main(){
        Robo robo = new Robo(new ComportamentoNormal());
        robo.mover();
        
        robo.setStrategy(new ComportamentoDefensivo());
        robo.mover();

        robo.setStrategy(new ComportamentoAgressivo());
        robo.mover();
    }
}

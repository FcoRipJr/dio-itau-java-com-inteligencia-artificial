package desafios_de_projeto.ddp1.estudos.gof.singleton;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}

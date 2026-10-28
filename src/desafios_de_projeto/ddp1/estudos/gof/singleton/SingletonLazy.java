package desafios_de_projeto.ddp1.estudos.gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instance == null) instance = new SingletonLazy();
        return instance;
    }
}

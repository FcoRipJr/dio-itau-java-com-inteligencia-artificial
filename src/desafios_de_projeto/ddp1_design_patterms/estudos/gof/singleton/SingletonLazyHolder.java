package desafios_de_projeto.ddp1_design_patterms.estudos.gof.singleton;

public class SingletonLazyHolder {
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}

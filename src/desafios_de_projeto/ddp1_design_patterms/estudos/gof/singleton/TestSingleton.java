package desafios_de_projeto.ddp1_design_patterms.estudos.gof.singleton;

public class TestSingleton {
    public void main(){

        SingletonLazy instanceLazy = SingletonLazy.getInstance(); 
        System.out.println(instanceLazy);
        SingletonLazy instanceLazy2 = SingletonLazy.getInstance(); 
        System.out.println(instanceLazy2);

        SingletonLazyHolder instanceLazyHolder = SingletonLazyHolder.getInstance(); 
        System.out.println(instanceLazyHolder);
        SingletonLazyHolder instanceLazyHolder2 = SingletonLazyHolder.getInstance(); 
        System.out.println(instanceLazyHolder2);

        
        SingletonEager instanceEager = SingletonEager.getInstance(); 
        System.out.println(instanceEager);
        SingletonEager instanceEager2 = SingletonEager.getInstance(); 
        System.out.println(instanceEager2);

        
    }
}

package desafios_de_projeto.ddp1.estudos.subsistema2_facade.cep;

public class CepApi {

    private static CepApi instance = new CepApi();
    
    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Manaus";
    }

    public String recuperarEstado(String cep) {
        return "AM";
    }
}

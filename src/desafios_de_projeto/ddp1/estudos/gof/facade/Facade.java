package desafios_de_projeto.ddp1.estudos.gof.facade;

import desafios_de_projeto.ddp1.estudos.subsistema1_facade.crm.CrmService;
import desafios_de_projeto.ddp1.estudos.subsistema2_facade.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        CepApi cepApi = CepApi.getInstance();
        CrmService.gravarCliente(nome, cep, cepApi.recuperarCidade(cep), cepApi.recuperarEstado(cep));
    }
}

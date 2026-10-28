package desafios_de_projeto.ddp1_design_patterms.estudos.subsistema1_facade.crm;

public class CrmService {
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema CRM:");
        System.out.printf("Nome: %s\nEndereço: %s - %s/%s", nome,cep, cidade, estado);
    }
}

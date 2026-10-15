package exercicios.e3;

public class OpcaoMenu {
    public final String descricao;
    public final int numero;
    public OpcaoMenu(String descricao, int numero) {
        this.descricao = descricao;
        this.numero = numero;
    }

    public void printOption() {
        System.out.printf("\n %s - %s", numero, descricao);
    }

}

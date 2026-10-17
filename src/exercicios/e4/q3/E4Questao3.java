package exercicios.e4.q3;

public class E4Questao3 {
    public static void main(String[] args){
        RelogioBrasileiro brasileiro = new RelogioBrasileiro(15, 30, 45);
        RelogioAmericano americano = new RelogioAmericano(9, 0, 0, false);
        System.out.println("\n\n############################");
        System.out.println("Relógios iniciais");
        System.out.printf("\nBrasileiro: %s", brasileiro.getFormatada());
        System.out.printf("\nAmericano: %s", americano.getFormatada());
        System.out.println("\n############################");

        americano.sincronizar(brasileiro);
        System.out.println("\n\n############################");
        System.out.println("Americano sincronizado com o Brasileiro");
        System.out.printf("\nBrasileiro: %s", brasileiro.getFormatada());
        System.out.printf("\nAmericano: %s", americano.getFormatada());
        System.out.println("\n############################");

        RelogioAmericano americanoNoite = new RelogioAmericano(11, 5, 0, true);
        brasileiro.sincronizar(americanoNoite);
        System.out.println("\n\n############################");
        System.out.println("Brasileiro sincronizado com outro Americano");
        System.out.printf("\nAmericano: %s", americanoNoite.getFormatada());
        System.out.printf("\nBrasileiro: %s", brasileiro.getFormatada());
        System.out.println("\n############################");

        RelogioAmericano americanoMeiaNoite = new RelogioAmericano(12, 0, 0, false);
        brasileiro.sincronizar(americanoMeiaNoite);
        System.out.println("\n\n############################");
        System.out.println("Meia-noite");
        System.out.printf("\nAmericano: %s", americanoMeiaNoite.getFormatada());
        System.out.printf("\nBrasileiro: %s", brasileiro.getFormatada());
        System.out.println("\n############################");

        System.out.println("\n\n############################");
        System.out.println("Validações");
        try {
            americano.setHora(13);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nAmericano: %s", e.getMessage());
        }
        try {
            brasileiro.setHora(24);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nBrasileiro: %s", e.getMessage());
        }
        try {
            brasileiro.setMinuto(60);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nBrasileiro: %s", e.getMessage());
        }
        System.out.println("\n############################");
    }
}

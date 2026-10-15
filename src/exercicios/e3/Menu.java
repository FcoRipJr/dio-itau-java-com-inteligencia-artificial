package exercicios.e3;

import java.util.Scanner;

public class Menu {
    public static int printMenu(Scanner scanner, OpcaoMenu[] opcoes){
        System.out.println("\n#####################################");
        System.out.println("Escolha uma opção: ");
        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i].printOption();
        }
        System.out.print("\nDigite o número da opção desejada: ");
        int opcao = scanner.nextInt();
        System.out.println("\n#####################################");
        return opcao;
    }   
}

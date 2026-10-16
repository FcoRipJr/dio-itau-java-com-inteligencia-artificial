package exercicios.e3.q3;

import exercicios.e3.OpcaoMenu;
import exercicios.e3.Menu;
import java.util.Scanner;

// Referência: docs/exercicios-java-basico/exercicios/3 - Java e a Arte da Abstração com Classes e Encapsulamento.md

public class E3Questao3 {
    public static void main(String[] args) {
       

        System.out.println("\n#####################################");
        System.out.println("Exercício 3 -  Java e a Arte da Abstração com Classes e Encapsulamento");
        System.out.println("Questão 3 -  Banho Petshop. ");

         OpcaoMenu[] opcoes = new OpcaoMenu[]{
            new OpcaoMenu("Dar banho no pet", 1),
            new OpcaoMenu("Abastecer com água", 2),
            new OpcaoMenu("Abastecer com shampoo", 3),
            new OpcaoMenu("Verificar nível de água", 4),
            new OpcaoMenu("Verificar nível de shampoo", 5),
            new OpcaoMenu("Verificar se tem pet no banho", 6),
            new OpcaoMenu("Colocar pet na máquina", 7),
            new OpcaoMenu("Retirar pet da máquina", 8),
            new OpcaoMenu("Limpar máquina", 9),
            new OpcaoMenu("Sair", 0)
        };
        try (Scanner scanner = new Scanner(System.in)) {    
            MaquinaBanho maquinaBanho = new MaquinaBanho();
            int opcao = -1;
             do {
                opcao = Menu.printMenu(scanner, opcoes);
                switch (opcao) {
                    case 1:
                        System.out.println("Dar banho no pet selecionado.");
                        maquinaBanho.darBanho();
                        break;
                    case 2:
                        System.out.println("Abastecer com água selecionado.");
                        maquinaBanho.abastecerAgua();
                        break;
                    case 3:
                        System.out.println("Abastecer com shampoo selecionado.");
                        maquinaBanho.abastecerShampoo();
                        break;
                    case 4: 
                        System.out.println("Verificar nível de água selecionado.");
                        maquinaBanho.verificarAgua();
                        break;
                    case 5:
                        System.out.println("Verificar nível de shampoo selecionado.");
                        maquinaBanho.verificarShampoo();
                        break;
                    case 6:
                        System.out.println("Verificar se tem pet no banho selecionado.");
                        maquinaBanho.verificarPet();
                        break;
                    case 7: 
                        System.out.println("Colocar pet na máquina selecionado.");
                        System.out.print("\nDigite o nome do pet que quer colocar na maquina de banho:");
                        maquinaBanho.colocarPet(scanner.next());
                        break;
                    case 8:
                        System.out.println("Retirar pet da máquina selecionado.");
                        maquinaBanho.retirarPet();
                        break;
                    case 9:
                        System.out.println("Limpar máquina selecionado.");
                        maquinaBanho.limparMaquina();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);
        };
    }
}

package exercicios.e3.q2;

import exercicios.e3.OpcaoMenu;
import exercicios.e3.Menu;
import java.util.Scanner;

// Referência: docs/exercicios-java-basico/exercicios/3 - Java e a Arte da Abstração com Classes e Encapsulamento.md

public class E3Questao2 {

    public static Carro trocarMarcha(Scanner scanner, Carro carro){
        OpcaoMenu[] opcoes = new OpcaoMenu[]{
            new OpcaoMenu("Proxima marcha", 1),
            new OpcaoMenu("Reduzir marcha", 2),
            new OpcaoMenu("Acelerar até o limite da marcha", 3),
            new OpcaoMenu("Reduzir velocidade até o mínimo da marcha", 4),
            new OpcaoMenu("Menu Anterior", 0)
        };
        int opcao = -1;
        do {
            System.out.println("########## Trocar a marcha ##########");
            opcao = Menu.printMenu(scanner, opcoes);
            switch (opcao) {
                case 1:
                    carro.proximaMarcha();
                    break;
                case 2:
                    carro.reduzirMarcha();
                    break;
                case 3:
                    carro.acelerarAteLimiteMarcha();
                    break;
                case 4:
                    carro.diminuirAteLimiteMarcha();
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        return carro;
    }
    public static void main(String[] args) {
       

        System.out.println("\n#####################################");
        System.out.println("Exercício 3 -  Java e a Arte da Abstração com Classes e Encapsulamento");
        System.out.println("Questão 2 -  Funções de um carro. ");
        
        OpcaoMenu[] opcoes = new OpcaoMenu[]{
            new OpcaoMenu("Ligar o carro", 1),
            new OpcaoMenu("Desligar o carro", 2),
            new OpcaoMenu("Acelerar", 3),
            new OpcaoMenu("Diminuir velocidade", 4),
            new OpcaoMenu("Virar para esquerda", 5),
            new OpcaoMenu("Virar para direita", 6),
            new OpcaoMenu("Verificar velocidade", 7),
            new OpcaoMenu("Trocar a marcha", 8),
            new OpcaoMenu("Sair", 0)
        };
        try (Scanner scanner = new Scanner(System.in)) {    
            Carro carro = new Carro();
            int opcao = -1;
            do {
                opcao = Menu.printMenu(scanner, opcoes);
                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a opção 1 - Ligar o carro");
                        carro.ligar();
                        break;
                    case 2:
                        System.out.println("Você escolheu a opção 2 - Desligar o carro");
                        carro.desligar();
                        break;
                    case 3:
                        System.out.println("Você escolheu a opção 3 - Acelerar");
                        carro.acelerar();
                        break;
                    case 4:
                        System.out.println("Você escolheu a opção 4 - Diminuir velocidade");
                        carro.diminuir();
                        break;
                    case 5:
                        System.out.println("Você escolheu a opção 5 - Virar para esquerda");
                        carro.virarParaEsquerda();
                        break;
                    case 6:
                        System.out.println("Você escolheu a opção 6 - Virar para direita");
                        carro.virarParaDireita();
                        break;
                    case 7:
                        System.out.println("Você escolheu a opção 7 - Verificar velocidade");
                        carro.exibirVelocidade();
                        break;
                    case 8:
                        System.out.println("Você escolheu a opção 8 - Trocar a marcha");
                        trocarMarcha(scanner, carro);
                        break;
                        
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }
    }
}

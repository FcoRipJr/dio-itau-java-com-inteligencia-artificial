package exercicios.e3.q1;

import exercicios.e3.OpcaoMenu;
import exercicios.e3.Menu;
import java.util.Scanner;

// Referência: docs/exercicios-java-basico/exercicios/3 - Java e a Arte da Abstração com Classes e Encapsulamento.md

public class E3Questao1 {

    public static void main(String[] args) {
        System.out.println("\n#####################################");
        System.out.println("Exercício 3 -  Java e a Arte da Abstração com Classes e Encapsulamento");
        System.out.println("Questão 1 -  Menu de opções de um banco. ");
        
        OpcaoMenu[] opcoes = new OpcaoMenu[]{
            new OpcaoMenu("Consultar saldo", 1),
            new OpcaoMenu("Consultar cheque especial", 2),
            new OpcaoMenu("Depositar dinheiro", 3),
            new OpcaoMenu("Sacar dinheiro", 4),
            new OpcaoMenu("Pagar um boleto", 5),
            new OpcaoMenu("Verificar se a conta está usando cheque especial", 6),
            new OpcaoMenu("Sair", 0)
        };
        try (Scanner scanner = new Scanner(System.in)) {    
            System.out.println("Informe o saldo inicial da conta: ");
            ContaBancaria conta = new ContaBancaria(scanner.nextDouble());
    
            int opcao = -1;
            do {
                opcao = Menu.printMenu(scanner, opcoes);
                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a opção 1 - Consultar saldo");
                        conta.consultarSaldo();
                        break;
                    case 2:
                        System.out.println("Você escolheu a opção 2 - Consultar cheque especial");
                        conta.consultarChequeEspecial();
                        break;
                    case 3:
                        System.out.println("Você escolheu a opção 3 - Depositar dinheiro");
                        System.out.print("Informe o valor a ser depositado: ");
                        conta.depositar(scanner.nextDouble());
                        break;
                    case 4:
                        System.out.println("Você escolheu a opção 4 - Sacar dinheiro");
                        System.out.print("Informe o valor a que deseja sacar: ");
                        conta.sacar(scanner.nextDouble());
                        break;
                    case 5:
                        System.out.println("Você escolheu a opção 5 - Pagar um boleto");
                        System.out.print("Informe o valor do boleto: ");
                        conta.pagarBoleto(scanner.nextDouble());
                        break;
                    case 6:
                        System.out.println("Você escolheu a opção 6 - Verificar se a conta está usando cheque especial");
                        conta.verificarChequeEspecial();
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

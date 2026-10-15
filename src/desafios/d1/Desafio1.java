package desafios.d1;

import java.util.Scanner;

// Referência: docs/exercicios-java-basico/desafios/1 - Desafios de Código sobre Fundamentos do Java no Setor Bancário.md
// 1 / 2 - Validacao de Operacao Bancaria em Java
public class Desafio1 {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {

            String operacao = scanner.nextLine();

            // A validacao deve ser exata, respeitando maiusculas e minusculas.
            // Compare a entrada com os tres codigos permitidos.
            boolean operacaoValida = false;

            // TODO: atualize a variavel operacaoValida para true se a operacao for DEPOSITO, SAQUE ou TRANSFERENCIA.
            operacaoValida =  operacao.equals("DEPOSITO") || operacao.equals("SAQUE") || operacao.equals("TRANSFERENCIA");
            System.out.println(operacaoValida ? "VALID" : "INVALID");

            scanner.close();
        }
    }
}

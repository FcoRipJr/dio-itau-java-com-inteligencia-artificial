package desafios.d2;

import java.util.Scanner;

public class Desafio2 {
    
    static class Conta {
        private int saldo;

        public Conta(int saldoInicial) {
            this.saldo = saldoInicial;
        }

        public String processarOperacao(String tipoOperacao, int valor) {
            if (!tipoOperacao.equals("DEPOSITAR") && !tipoOperacao.equals("SACAR")) {
                return "ERRO: OPERACAO INVALIDA";
            }

            if (valor <= 0) {
                return "ERRO: VALOR INVALIDO";
            }

            if (tipoOperacao.equals("DEPOSITAR")) {
                saldo += valor;
                return "OK " + saldo;
            }

            if (valor > saldo) {
                return "ERRO: SALDO INSUFICIENTE";
            }

            saldo -= valor;
            return "OK " + saldo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("(?i)\\s*<br\\s*/?>\\s*|\\s+");

        String tipoOperacao = scanner.next();
        int saldoInicial = scanner.nextInt();
        int valorOperacao = scanner.nextInt();

        Conta conta = new Conta(saldoInicial);
        String resultado = conta.processarOperacao(tipoOperacao, valorOperacao);

        System.out.println(resultado);
        scanner.close();
    }
}

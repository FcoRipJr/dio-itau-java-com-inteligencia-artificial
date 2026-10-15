package exercicios.e3.q1;

public class ContaBancaria {
    private double saldo;
    private final double limiteChequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
        this.limiteChequeEspecial = calcularLimiteChequeEspecialInicial();
        this.chequeEspecialUsado = 0.0;
    }

    public double getSaldo() {
        return saldo+(limiteChequeEspecial-chequeEspecialUsado);
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    private double calcularLimiteChequeEspecialInicial() {
        if (this.saldo > 500) {
            return this.saldo * 0.5;
        } else {
            return 50.0;
        }
    }

    private double chequeEspecialComTaxa() {
        if (this.chequeEspecialUsado > 0) {
            return this.chequeEspecialUsado * 1.2;
        } else {
            return 0.0;
        }
    }

    public void consultarSaldo() {
        System.out.printf("\n Saldo disponível: %s \n", this.getSaldo());
    }

    public void consultarChequeEspecial() {
        System.out.printf("\n Cheque especial Usado: %s \n", chequeEspecialUsado);
        System.out.printf("\n Limite de cheque especial: %s \n", limiteChequeEspecial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("\n Depósito de %s realizado com sucesso! Novo saldo: %s \n", valor, this.getSaldo());
            double taxaChequeEspecial = this.chequeEspecialComTaxa();
            if(taxaChequeEspecial > 0) {
                if(saldo >= taxaChequeEspecial) {
                    saldo -= taxaChequeEspecial;
                    System.out.printf("\n Quitado valor utilizado do Cheque Especial + 20%% de taxa totalizando: %s  \n", taxaChequeEspecial);
                    this.chequeEspecialUsado = 0;
                    this.consultarSaldo();
                }
            }
        } else {
            System.out.println("\n Valor de depósito inválido! \n");
        }
    }

    private void debitar(double valor, String acao ) {
        if (valor > 0 && valor <= this.getSaldo()) {
            if(valor <= saldo) {
                saldo -= valor;
            } else {
                double valorChequeEspecial = valor - saldo;
                saldo = 0;
                chequeEspecialUsado += valorChequeEspecial;
            }
            switch (acao) {
                case "sacar":
                    System.out.printf("\n Saque de %s realizado com sucesso! Novo saldo: %s \n", valor, this.getSaldo());
                    break;
                case "pagarBoleto":
                    System.out.printf("\n Pagamento de boleto de %s realizado com sucesso! Novo saldo: %s \n", valor, this.getSaldo());
                    break;
                default:
                    System.out.printf("\n Débito de %s realizado com sucesso! Novo saldo: %s \n", valor, this.getSaldo());
            }
        } else {
            System.out.println("\n Valor a debitar inválido ou saldo insuficiente! \n");
        }
    }

    public void sacar(double valor) {
        debitar(valor, "sacar");
    }

    public void pagarBoleto(double valor) {
        debitar(valor, "pagarBoleto");
    }

    public void verificarChequeEspecial() {
        if (chequeEspecialUsado > 0) {
            System.out.printf("\n A conta está usando cheque especial. Valor usado: %s \n", chequeEspecialUsado);
        } else {
            System.out.println("\n A conta não está usando cheque especial.");
        }
    }
}

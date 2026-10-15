package exercicios;
import java.util.Scanner;

// Referência: docs/exercicios-java-basico/exercicios/2 - Estruturas de Controle em Java.md
public class Exercicio2 {

    public static void questao1(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 1 - Tabuada 1 a 10. ");
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.printf("\n %s * %s = %s", numero, i, resultado);
        }
        System.out.println("\n#####################################");
    }

    public static void questao2(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 2 - Resultado IMC. ");
        System.out.print("Informe sua altura: ");
        float altura = scanner.nextFloat();
        System.out.print("\nInforme seu peso: ");
        float peso = scanner.nextFloat();
        float imc = peso / ( altura * altura );
        String mensagem = "";
        if(imc <= 18.5){
            mensagem = "Abaixo do peso";
        } else if(imc > 18.5 && imc < 25){
            mensagem = "Peso ideal";
        } else if(imc >= 25 && imc < 30){
            mensagem = "Levemente acima do peso";
        } else if(imc >= 30 && imc < 35){
            mensagem = "Obesidade Grau l";
        } else if(imc >= 35 && imc < 40){
            mensagem = "Obesidade Grau II (Severa)";
        } else {
            mensagem = "Obesidade III (Mórbida)";
        }
        System.out.printf("\n Seu IMC é: %s - %s", imc, mensagem);
        System.out.println("\n#####################################");
    }

    public static void questao3(Scanner scanner){
        System.out.println("\n#####################################");
            System.out.println("Questão 3 - Listar Pares ou impares decrescente entre intervalo. ");
            System.out.print("Informe o primeiro número: ");
            int numero1 = scanner.nextInt();
            int numero2 = 0;
            do {
                System.out.print("\nInforme o segundo número: ");
                numero2 = scanner.nextInt();
                if(numero2 <= numero1) 
                    System.out.printf("\nO segundo número deve maior que %s !\n",numero1);
            } while (numero2 <= numero1);
            Boolean respostaValida = false;
            int respostaParImpar = 0;
            do {
                System.out.print("Digite:\n 0 para listar números pares \n 1 para listar números impares \n: ");
                respostaParImpar = scanner.nextInt();
                respostaValida = respostaParImpar == 0 || respostaParImpar == 1;
                if(!respostaValida) 
                    System.out.printf("\nValor informado inválido! \n Responda apenas com 0 ou 1.\n",numero1);
            } while (!respostaValida);
            String paresImpares = respostaParImpar == 0 ? "pares" : "impares";
            System.out.printf("\nListando números %s entre %s e %s :\n",paresImpares, numero2, numero1);
            for (int i = numero2; i >= numero1; i--) {
                if(! ((i % 2) == respostaParImpar)){
                    continue;
                }
                System.out.printf("\n %s", i);
            }
            System.out.println("\n#####################################");
    }

    public static void questao4(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 4 - Loop Condicionado a resto de divisao. ");
        System.out.print("Informe o primeiro número: ");
        int numero1 = scanner.nextInt();
        int numero2 = 0;
        int resto = 0;
        do {
            System.out.print("\nInforme o segundo número: ");
            numero2 = scanner.nextInt();
            if(numero2 <= numero1){
                System.out.printf("\nO segundo número deve maior que %s !\n",numero1);
                continue;
            }
            resto = numero2 % numero1;
            System.out.printf("\n %s %% %s = %s ",numero2,numero1,resto);
        } while (resto == 0);
        System.out.println("\n#####################################");
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            questao1(scanner);
            questao2(scanner);
            questao3(scanner);
            questao4(scanner);
        }
    }
}

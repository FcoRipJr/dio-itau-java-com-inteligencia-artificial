import java.time.LocalDate;
import java.util.Scanner;

// Referência: docs/exercicios-java-basico/exercicios/1 - Fundamentos da Linguagem de Programação Java.md
public class Exercicio1 {

    public static void questao1(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 1 - Calculo de idade. ");
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        System.out.printf("Olá %s você tem %s anos", nome, idade);
        System.out.println("\n#####################################");
    }

    public static void questao2(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 2 - Calculo Area quadrado. ");
        System.out.print("Informe o tamanho do lado do quadrado: ");
        int lado = scanner.nextInt();
        int area = lado * lado;
        System.out.printf("A area do quadrado é: %s ", area);
        System.out.println("\n#####################################");
    }

    public static void questao3(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 3 - Calculo Area retângulo. ");
        System.out.print("Informe o tamanho do base do retângulo: ");
        int base = scanner.nextInt();
        System.out.print("Informe o tamanho do altura do retângulo: ");
        int altura = scanner.nextInt();
        int area = base * altura;
        System.out.printf("A area do retângulo é: %s ", area);
        System.out.println("\n#####################################");
    }

    public static void questao4(Scanner scanner){
        System.out.println("\n#####################################");
        System.out.println("Questão 4 - Calculo diferenca de idade. ");
        System.out.print("Informe o nome da primeira pessoa: ");
        String nome1 = scanner.next();
        System.out.print("Informe a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Informe o nome da sugunda pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Informe a idade da sugunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = idade1 - idade2;
        if(diferenca < 0 ){
            diferenca *= -1;
        }
        System.out.printf("A diferença de idade entre %s e %s é de : %s ano(s)",nome1, nome2, diferenca);
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

package desafios.d1;

import java.util.Scanner;

// Referência: docs/exercicios-java-basico/desafios/1 - Desafios de Código sobre Fundamentos do Java no Setor Bancário.md
// 2 / 2 - Validacao de Codigo Bancario em Java
public class Desafio2 {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
            String codigoInformado = scanner.nextLine();
            String codigoEsperado = scanner.nextLine();

            // Compare os dois textos exatamente como foram lidos.
            // Se forem identicos, exiba "ACESSO LIBERADO"; caso contrario, "ACESSO NEGADO".
            // TODO: imprima o resultado da validacao em uma unica linha.
            Boolean codigosIdenticos = codigoInformado.equals(codigoEsperado);
            System.out.println(codigosIdenticos ? "ACESSO LIBERADO" : "ACESSO NEGADO");
          
            scanner.close();
        }
    }
}

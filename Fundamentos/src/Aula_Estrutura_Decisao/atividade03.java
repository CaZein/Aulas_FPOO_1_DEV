package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class atividade03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o prato desejado:");
        System.out.println("1 - Arroz, feijão, bife acebolado - R$ 19,99");
        System.out.println("2 - Arroz, feijão, filé de frango - R$ 18,99");
        System.out.println("3 - Arroz, feijão, brajola - R$ 23,99");
        int opcao = scanner.nextInt();

        System.out.println("Escreva a quantidade de pratos:");
        int quantidade = scanner.nextInt();

        double valorTotal = 0.0;

        switch (opcao) {
            case 1:
                valorTotal = quantidade * 19.99;
                break;
            case 2:
                valorTotal = quantidade * 18.99;
                break;
            case 3:
                valorTotal = quantidade * 23.99;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.println("Total a pagar: R$ " + valorTotal);

        scanner.close();

    }
}

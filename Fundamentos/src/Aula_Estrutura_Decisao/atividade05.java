package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o veículo desejado:");
        System.out.println("1 - Fiat Argo");
        System.out.println("2 - Fiat Mobi");
        System.out.println("3 - Hyundai Hb20");
        int opcao = scanner.nextInt();

        System.out.println("Informe a quantidade de diárias:");
        int diarias = scanner.nextInt();

        System.out.println("Informe a quantidade de km rodados:");
        int kmRodados = scanner.nextInt();

        double valorDiaria = 0.0;
        double valorPorKm = 0.0;

        switch (opcao) {
            case 1:
                valorDiaria = 98.00;
                valorPorKm = 2.39;
                break;
            case 2:
                valorDiaria = 79.00;
                valorPorKm = 1.99;
                break;
            case 3:
                valorDiaria = 102.00;
                valorPorKm = 2.99;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        double valorAluguel = (valorDiaria * diarias) + (valorPorKm * kmRodados);

        System.out.println("Valor total do aluguel: R$ " + valorAluguel);

        scanner.close();
    }
}

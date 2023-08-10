package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor total que você deseja economizar:");
        double valorEconomizar = scanner.nextDouble();

        System.out.println("Escolha um item para calcular:");
        System.out.println("1 - Notebook Lenovo (R$ 3299,00) - 5%");
        System.out.println("2 - Celular MotoG22 (R$ 1789,00) - 10%");
        System.out.println("3 - Carro Hb20 (R$ 68000,00) - 2%");
        System.out.println("4 - Apartamento (R$ 180000,00) - 1%");
        int opcao = scanner.nextInt();

        double percentualEconomia = 0.0;

        switch (opcao) {
            case 1:
                percentualEconomia = 0.05;
                break;
            case 2:
                percentualEconomia = 0.10;
                break;
            case 3:
                percentualEconomia = 0.02;
                break;
            case 4:
                percentualEconomia = 0.01;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        double mesesNecessarios = valorEconomizar / (valorEconomizar * percentualEconomia);

        System.out.println("Valor a economizar por mês: R$ " + (valorEconomizar * percentualEconomia));
        System.out.println("Quantidade de meses necessários: " + mesesNecessarios);

        scanner.close();
    }
}

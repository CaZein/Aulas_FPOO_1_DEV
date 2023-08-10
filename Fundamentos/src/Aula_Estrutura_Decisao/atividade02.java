package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a largura do terreno (em metros):");
        double largura = scanner.nextDouble();

        System.out.println("Escreva o comprimento do terreno (em metros):");
        double comprimento = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double valorMetroQuadrado = 0;

        if (areaTotal <= 250) {
            valorMetroQuadrado = 8.50;
        } else if (areaTotal <= 350) {
            valorMetroQuadrado = 9.50;
        } else {
            valorMetroQuadrado = 11.50;
        }

        double valorTotal = areaTotal * valorMetroQuadrado;

        System.out.println("Área Total do Terreno: " + areaTotal + " m²");
        System.out.println("Valor por m²: R$ " + valorMetroQuadrado);
        System.out.println("Valor Total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}


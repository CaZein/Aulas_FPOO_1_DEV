package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class exemplo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Voce pode colar na resenha do Zein");
        } else {
            System.out.println("Nao vai colar na resenha do Zein ");
        }

    }

}

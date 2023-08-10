package Aula_Estrutura_Decisao;

import java.util.Scanner;

public class atividade01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o seu cargo? (Gerente,Supervisor,Tecnico,Auxiliar)");
        String cargo = scanner.nextLine();

        double salarioBase = 0;
        double inssPercent = 0;
        double convenioValue = 0;

        switch (cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inssPercent = 8.0;
                convenioValue = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inssPercent = 7.0;
                convenioValue = 239.00;
                break;
            case "técnico":
                salarioBase = 3789.00;
                inssPercent = 4.0;
                convenioValue = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inssPercent = 2.0;
                convenioValue = 156.00;
                break;
            default:
                System.out.println("Cargo inválido.");
                scanner.close();
                return;
        }

        double inss = salarioBase * (inssPercent / 100);
        double salarioDescontado = salarioBase - inss - convenioValue;

        System.out.println("Cargo: " + cargo);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Valor Convênio: R$ " + convenioValue);
        System.out.println("Salário Líquido: R$ " + salarioDescontado);

        scanner.close();
    }

}

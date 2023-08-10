package Aula_Estrutura_Decisao;

public class exemplo02 {

    public static void main(String[] args) {

        int temperature = 15;

        if (temperature == 15) {
            System.out.println("Esta ficando frio");
        } else if (temperature == 20) {
            System.out.println("Esta ficando agradavel");
        } else if (temperature == 30) {
            System.out.println("Esta ficando calor");
        }

        switch (temperature) {
            case 15:
                System.out.println("Esta ficando frio");
                break;
            case 20:
                System.out.println("Esta ficando agradavel");
                break;
            case 30:
                System.out.println("Esta ficando calor");
                break;
            default:
                System.out.println("Nao identifiquei a temperatura");

                throw new AssertionError();

        }
    }
}

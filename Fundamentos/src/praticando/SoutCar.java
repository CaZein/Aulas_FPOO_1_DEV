package praticando;

public class SoutCar {
    public static void main(String[] args) {


        Car lambo = new Car("Aventador", "Lamborghini Aventador SVJ", "Lamborghini", EnumCarColor.BLACK, true, 4, 2020);

        System.out.println(lambo);

        lambo.ligandoCarro();
        System.out.println(lambo);

        lambo.trocarDeMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        lambo.andando();
        System.out.println(lambo);
        lambo.trocarDeMarcha(MarchaEnum.SEGUNDA_MARCHA);
        System.out.println(lambo);
        lambo.trocarDeMarcha(MarchaEnum.TERCEIRA_MARCHA);
        System.out.println(lambo);
        lambo.trocarDeMarcha(MarchaEnum.QUARTA_MARCHA);
        System.out.println(lambo);
        lambo.trocarDeMarcha(MarchaEnum.QUINTA_MARCHA);
        System.out.println(lambo);
        lambo.trocarDeMarcha(MarchaEnum.SEXTA_MARCHA);
        System.out.println(lambo);


    }


}
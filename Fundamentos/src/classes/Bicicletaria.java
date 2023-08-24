package classes;

public class Bicicletaria {

    public static void main(String[] args) {

        Bike caloiCross = new Bike(2, true, 12, "CaloiCross", true, "Black");

        System.out.println(caloiCross);

        caloiCross.andar(100);
        caloiCross.andar(50);

        System.out.println(caloiCross);

    }


}

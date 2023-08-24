package praticando;

public class SoutCar {
    public static void main(String[] args) {


        Car car = new Car("Aventador SVJ", "Lamborghini Aventador SVJ", "Lamborghini", "Black", true, 4, 2020, "");

        System.out.println(car);

        car.ligandoCarro();
        System.out.println(car);

        car.andando();
        System.out.println(car);

    }
}
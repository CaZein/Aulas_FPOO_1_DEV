package praticando.atividadeClasses;

public class SoutComputer {

    public static void main(String[] args) {

     Computer soutcomputer = new Computer(EnumComputerMemory.HYPERX, EnumComputerProcessor.INTEL_I5, "256gb", "Windows 10");

        System.out.println(soutcomputer);

        soutcomputer.turnOnTheComputer();
        System.out.println(soutcomputer);

        soutcomputer.turnOffTheComputer();
        System.out.println(soutcomputer);

    }

}

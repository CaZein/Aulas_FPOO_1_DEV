package praticando.atividadeClasses;

public class Computer {

    private EnumComputerMemory enumComputerMemory;
    private EnumComputerProcessor enumComputerProcessor;
    private String HardDriveCapacity;
    private String Operatingystem;
    private String situation;

    public Computer(String situation) {
        this.situation = situation;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Computer(EnumComputerMemory enumComputerMemory, EnumComputerProcessor enumComputerProcessor, String hardDriveCapacity, String operatingystem) {
        this.enumComputerMemory = enumComputerMemory;
        this.enumComputerProcessor = enumComputerProcessor;
        HardDriveCapacity = hardDriveCapacity;
        Operatingystem = operatingystem;
    }

    public EnumComputerMemory getEnumComputerMemory() {
        return enumComputerMemory;
    }

    public void setEnumComputerMemory(EnumComputerMemory enumComputerMemory) {
        this.enumComputerMemory = enumComputerMemory;
    }

    public EnumComputerProcessor getEnumComputerProcessor() {
        return enumComputerProcessor;
    }

    public void setEnumComputerProcessor(EnumComputerProcessor enumComputerProcessor) {
        this.enumComputerProcessor = enumComputerProcessor;
    }

    public String getHardDriveCapacity() {
        return HardDriveCapacity;
    }

    public void setHardDriveCapacity(String hardDriveCapacity) {
        HardDriveCapacity = hardDriveCapacity;
    }

    public String getOperatingystem() {
        return Operatingystem;
    }

    public void setOperatingystem(String operatingystem) {
        Operatingystem = operatingystem;
    }

    public void turnOnTheComputer(){
       this.situation = "Ligado";
    }
    public void turnOffTheComputer(){
        this.situation = "Desligado";
    }

    @Override
    public String toString() {
        return "Computer{" +
                "enumComputerMemory=" + enumComputerMemory +
                ", enumComputerProcessor=" + enumComputerProcessor +
                ", HardDriveCapacity='" + HardDriveCapacity + '\'' +
                ", Operatingystem='" + Operatingystem + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }
}

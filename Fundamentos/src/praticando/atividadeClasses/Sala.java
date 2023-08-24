package praticando.atividadeClasses;

public class Sala {

    private int numberOfChairs;
    private int numberOfTables;
    private int numberOfClass;
    private boolean projetor;
    private int numberOfComputers;
    private String situation;

    public void ligarProjetor(){

       this.situation = "Ligado";

    }

    public void desligarProjetor(){

    this.situation = "Desligado";

    }

    public Sala(int numberOfChairs, int numberOfTables, int numberOfClass, boolean projetor, int numberOfComputers, String situation) {
        this.numberOfChairs = numberOfChairs;
        this.numberOfTables = numberOfTables;
        this.numberOfClass = numberOfClass;
        this.projetor = projetor;
        this.numberOfComputers = numberOfComputers;
        this.situation = situation;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public int getNumberOfClass() {
        return numberOfClass;
    }

    public void setNumberOfClass(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }

    public boolean isProjetor() {
        return projetor;
    }

    public void setProjetor(boolean projetor) {
        this.projetor = projetor;
    }

    public int getNumberOfComputers() {
        return numberOfComputers;
    }

    public void setNumberOfComputers(int numberOfComputers) {
        this.numberOfComputers = numberOfComputers;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }


    @Override
    public String toString() {
        return "Sala{" +
                "numberOfChairs=" + numberOfChairs +
                ", numberOfTables=" + numberOfTables +
                ", numberOfClass=" + numberOfClass +
                ", projetor=" + projetor +
                ", numberOfComputers=" + numberOfComputers +
                ", situation='" + situation + '\'' +
                '}';
    }
}

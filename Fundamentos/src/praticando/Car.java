package praticando;

public class Car {

    private String model;
    private String name;
    private String marca;
    private String color;
    private boolean temRodas;
    private int qtdRodas;
    private int ano;
    private String situation;


    public Car(String model, String name, String marca, String color, boolean temRodas, int qtdRodas, int ano, String situation) {
        this.model = model;
        this.name = name;
        this.marca = marca;
        this.color = color;
        this.temRodas = temRodas;
        this.qtdRodas = qtdRodas;
        this.ano = ano;
        this.situation = "Carro ligado";
    }



    public void ligandoCarro(){
        this.situation = "Ligando";
    }
    public void andando(){
        this.situation = "Andando";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTemRodas() {
        return temRodas;
    }

    public void setTemRodas(boolean temRodas) {
        this.temRodas = temRodas;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", temRodas=" + temRodas +
                ", qtdRodas=" + qtdRodas +
                ", ano=" + ano +
                ", situation='" + situation + '\'' +
                '}';
    }
}

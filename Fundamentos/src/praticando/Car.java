package praticando;

public class Car {

    private String model;
    private String name;
    private String marca;
    private EnumCarColor enumCarColor;
    private boolean temRodas;
    private int qtdRodas;
    private int ano;
    private String situation;
    private MarchaEnum marchaEnum;
    private int marcha;

    public Car(int marcha) {
        this.marcha = marcha;
    }

    public MarchaEnum getMarchaEnum() {
        return marchaEnum;
    }

    public void setMarchaEnum(MarchaEnum marchaEnum) {
        this.marchaEnum = marchaEnum;
    }

    public Car(MarchaEnum marchaEnum) {
        this.marchaEnum = marchaEnum;
    }

    public MarchaEnum marchaEnum() {
        return marchaEnum;
    }

    public void setMarcha(MarchaEnum marchaEnum) {
        this.marchaEnum = marchaEnum;
    }

    public Car(String model, String name, String marca, EnumCarColor enumCarColor, boolean temRodas, int qtdRodas, int ano) {
        this.model = model;
        this.name = name;
        this.marca = marca;
        this.enumCarColor = enumCarColor;
        this.temRodas = temRodas;
        this.qtdRodas = qtdRodas;
        this.ano = ano;
        this.situation = "Carro ligado";
        this.marchaEnum = MarchaEnum.NEUTRO;
    }



    public void ligandoCarro(){
        this.situation = "Ligando";

    }
    public void trocarDeMarcha(MarchaEnum marcha){
        this.marcha = marcha.getNumeroMarcha();
        this.marchaEnum = marcha;
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

    public EnumCarColor getEnumCarColor() {
        return enumCarColor;
    }

    public void setEnumCarColor(EnumCarColor enumCarColor) {
        this.enumCarColor = enumCarColor;
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
                ", enumCarColor=" + enumCarColor +
                ", temRodas=" + temRodas +
                ", qtdRodas=" + qtdRodas +
                ", ano=" + ano +
                ", situation='" + situation + '\'' +
                ", marchaEnum=" + marchaEnum +
                ", marcha=" + marcha +
                '}';
    }
}

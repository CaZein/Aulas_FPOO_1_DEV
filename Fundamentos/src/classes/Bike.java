package classes;

public class Bike {

    private int qtdRodas;
    private boolean temMarchas;
    private int qtdMarchas;
    private String modelo;
    private boolean temFreio;
    private String cor;
    private String situation;
    private int velocidade;

    public Bike() {

    }

    public Bike(int qtdRodas, boolean temMarchas, int qtdMarchas, String modelo, boolean temFreio, String cor) {
        this.qtdRodas = qtdRodas;
        this.temMarchas = temMarchas;
        this.qtdMarchas = qtdMarchas;
        this.modelo = modelo;
        this.temFreio = temFreio;
        this.cor = cor;
        this.situation = "Parada";
        this.velocidade = 0;

    }


    public void andar(int Velocidade) {
        this.situation = "Andando;";
        this.velocidade += 2;
        this.velocidade =Velocidade;
    }

    public void freiar() {
        this.situation = "Freiando";
        this.velocidade -=1;
    }

    public boolean verificaSeTemFreio() {
        return this.temFreio;
    }


    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public boolean isTemMarchas() {
        return temMarchas;
    }

    public void setTemMarchas(boolean temMarchas) {
        this.temMarchas = temMarchas;
    }

    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isTemFreio() {
        return temFreio;
    }

    public void setTemFreio(boolean temFreio) {
        this.temFreio = temFreio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



}


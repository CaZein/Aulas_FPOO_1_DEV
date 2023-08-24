package praticando;

public enum MarchaEnum {

    PRIMEIRA_MARCHA("Primeira Marcha", 1),
    SEGUNDA_MARCHA("Sgunda Marcha", 2),
    TERCEIRA_MARCHA("Tercira Marcha", 3),
    QUARTA_MARCHA("Quarta Marcha",4),
    QUINTA_MARCHA("Quinta Marcha", 5),
    SEXTA_MARCHA("Sexta Marcha", 6),
    MARCHA_RE("Ré", -1),
    NEUTRO("Neutro", 0);

    private String marcha;
    private int numeroMarcha;
    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;

    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroMarcha(){
        return numeroMarcha;
    }





}

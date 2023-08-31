package atividade31_09_23;

public class Post implements ClassificacaoPost {

    private boolean curtida;
    private boolean adicionarFavorito;
    private boolean comentar;
    private int Estrela;

    public Post(boolean curtida, boolean adicionarFavorito, boolean comentar, int estrela) {
        this.curtida = curtida;
        this.adicionarFavorito = adicionarFavorito;
        this.comentar = comentar;
        Estrela = estrela;
    }

    public boolean isCurtida() {
        return curtida;
    }

    public boolean isAdicionarFavorito() {
        return adicionarFavorito;
    }

    public boolean isComentar() {
        return comentar;
    }

    public int getEstrela() {
        return Estrela;
    }


    @Override
    public String toString() {
        return "Post{" +
                "curtida=" + curtida +
                ", adicionarFavorito=" + adicionarFavorito +
                ", comentar=" + comentar +
                ", Estrela=" + Estrela +
                '}';
    }

    @Override
    public void comum() {
        System.out.println("Post comum " + ESTRELA_1);

    }

    @Override
    public void legal() {
        System.out.println("Post legal " + ESTRELA_3);
    }

    @Override
    public void superLegal() {
        System.out.println("Post super legal " + ESTRELA_5);

    }
}

package orientacao_objetos;

public class Cliente {

    private String name;
    private String email;

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Cliente(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        if (this.email == null) {
            return "Cliente{ " + "name" + name + '}';
        } else {
            return "Cliente{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }


    public double CalcularLocacao(int qtdeDias) {

        return qtdeDias * 3.99;
    }


    public double ValorCalcularLocacao(int qtdeDias, boolean lancamento) {

        return qtdeDias * 6.99;

    }

}


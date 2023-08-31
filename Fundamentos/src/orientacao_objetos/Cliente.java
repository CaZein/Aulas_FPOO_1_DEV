package orientacao_objetos;

public class Cliente implements AluguelFilme, CadastroCliente {

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

        return qtdeDias * VALOR_FILME_SIMPLES;
    }


    public double ValorCalcularLocacao(int qtdeDias, boolean lancamento) {

        return qtdeDias * VALOR_FILME_LANCAMENTO;

    }

    @Override
    public boolean validarNome(String name) {
        if (name.length() > 7) {
            System.out.println("Nome" + name + "do cliente é valido");
            return true;
        } else {
            System.out.println("Nome" + name + "do cliente é invalido");
            return false;
        }
    }

    @Override
    public boolean verificarEmailDominioGoogle(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@gmail.com")) {
            System.out.println("O email " + email + "é do google");
            return false;

        } else {
            System.out.println("O email " + email + "não é do google");
            return false;
        }
    }


}

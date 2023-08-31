package orientacao_objetos;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Locadora {

    public static void main(String[] args) throws UnsupportedEncodingException {

        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        Cliente c1 = new Cliente("Cliente 01");
        System.out.println(c1);
        c1.CalcularLocacao(3);
        double valorLocacaoSimples = c1.CalcularLocacao(3);
        System.out.println("O valor para locação do filme"
                + "simples é " + valorLocacaoSimples);


        Cliente c2 = new Cliente("Cliente 02", "caiozein07@gmail.com");
        System.out.println(c2);
        double valorLocacaoLancamento = c1.ValorCalcularLocacao(3, true);
        System.out.println("O valor para locação do filme"
                + "lançamento é: " + valorLocacaoLancamento);

    }

}

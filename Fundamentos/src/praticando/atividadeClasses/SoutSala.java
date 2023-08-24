package praticando.atividadeClasses;

public class SoutSala {

    public static void main(String[] args) {

        Sala room = new Sala(30, 30, 667, true, 30, "");

        System.out.println(room);

        room.ligarProjetor();
        System.out.println(room);

        room.desligarProjetor();
        System.out.println(room);

    }

}

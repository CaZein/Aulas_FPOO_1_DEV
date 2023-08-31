package orientacao_objetos;

import atividade31_09_23.ClassificacaoPost;
import atividade31_09_23.Post;

public class PostRedesSociais {
    public static void main(String[] args) {


        Post post1 = new Post(true,false,false,1);
        Post post2 = new Post(true,false,true,3);
        Post post3 = new Post(true,true,true,5);

        post1.comum();
        post2.legal();
        post3.superLegal();



    }
}
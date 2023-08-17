/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eenumeracao;

/**
 *
 * @author Aluno
 */
public class Enumeracao {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Caio",
                "caiozein@icloud.com", true, TipoUsuarioEnum.TECNICO);
        System.out.println(usuario);

        Pedido pedido = new Pedido(
                "Pedido do Usuario",
                59.90,
                StatusEnum.EM_PREPARACAO.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.Em_TRANSPORTE.getStatus());
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.ENTREGUE.getStatus());
        System.out.println(pedido);

    }

}

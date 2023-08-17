/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eenumeracao;

/**
 *
 * @author Aluno
 */
public class Pedido {
    
    
private String desc;
private double price;
private String status;

    public Pedido(String desc, double price, String status) {
        this.desc = desc;
        this.price = price;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Pedido(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" + "desc=" + desc + ", price=" + price + ", status=" + status + '}';
    }


    
    
}

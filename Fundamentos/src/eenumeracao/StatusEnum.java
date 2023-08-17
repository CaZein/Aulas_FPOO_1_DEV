/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eenumeracao;

/**
 *
 * @author Aluno
 */
public enum StatusEnum {

    EM_PREPARACAO("Em prepararcao"),
    Em_TRANSPORTE("Em Transporte"),
    ENTREGUE("Entregue ao cliente");

    private String status;

    private StatusEnum(String status) {
        this.status = status;
    
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   


}




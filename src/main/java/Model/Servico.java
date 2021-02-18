/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Simpress
 */
public class Servico {
    
    private int id;
    private String descrição;
    private float valor;

    public Servico(int id, String descrição, float valor) {
        this.id = id;
        this.descrição = descrição;
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}


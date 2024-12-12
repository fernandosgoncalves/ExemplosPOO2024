/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author aluno
 */
public abstract class Pessoa {
    private String nome;
    protected double renda;

    public Pessoa() {
    }

    public Pessoa(String nome, double renda) {
        this.nome = nome;
        this.renda = renda;
    }
    
    public abstract double valorImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() + " Imposto: " + valorImposto();
    }
}

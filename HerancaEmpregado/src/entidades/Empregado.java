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
public class Empregado {
    private String nome;
    private int horas;
    private double valorHora;
    
    public Empregado(){
    }

    public Empregado(String nome, int horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Empregado{" + " Nome: " + nome + " Horas: " + 
                horas + " Valor Hora: " + valorHora + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double pagamento(){
        return this.horas * this.valorHora;
    }
    
    public String mostraPagamento(){
        return this.nome + " - R$ " + this.pagamento();
    }
}

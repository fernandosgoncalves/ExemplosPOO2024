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
public class Terceirizado extends Empregado{
    private double valorAdicional;
    
    public Terceirizado(){
    }

    public Terceirizado(double valorAdicional, String nome, int horas, double valorHora) {
        super(nome, horas, valorHora);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Terceirizado{ Nome: " + super.getNome() +
                " Horas: " + super.getHoras() + " Valor hora:" +
                super.getValorHora() + " Valor Adicional: " + 
                valorAdicional + '}';
    }
    
    @Override
    public double pagamento(){
        return super.pagamento() + this.valorAdicional*1.1;
        //return this.valorAdicional*1.1 + this.horas * this.valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public String mostraPagamento(){
        return super.getNome() + " - R$ " + this.pagamento();
    }
}

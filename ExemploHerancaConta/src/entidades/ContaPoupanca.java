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
public final class ContaPoupanca extends Conta{
    private double taxaJuros;
    
    public ContaPoupanca(){
        super();
    }

    public ContaPoupanca(int numero, String proprietario, 
            float saldo, double taxaJuros) {
        super(numero, proprietario, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public void atualizaSaldo(){
        super.saldo += super.saldo*taxaJuros;
    }
    
    @Override
    public void saque(float montante){
        this.saldo -= montante;
    }
    
}

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
public class Fatura {
    private Double taxaBasica;
    private Double imposto;

    public Fatura() {
    }

    public Fatura(Double taxaBasica, Double imposto) {
        this.taxaBasica = taxaBasica;
        this.imposto = imposto;
    }

    public Double getTaxaBasica() {
        return taxaBasica;
    }

    public void setTaxaBasica(Double taxaBasica) {
        this.taxaBasica = taxaBasica;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
    
    public Double getTotalFatura(){
        return this.taxaBasica + this.imposto;
    }
}

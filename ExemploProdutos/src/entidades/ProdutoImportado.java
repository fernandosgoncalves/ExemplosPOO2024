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
public class ProdutoImportado extends Produto{
    private double taxa;

    public ProdutoImportado() {
    }

    public ProdutoImportado(String nome, double preco, double taxa) {
        super(nome, preco);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public double getPreco() {
        return super.preco + taxa;
    }
    
    @Override
    public String etiqueta(){
        return super.getNome() + " - R$: " + this.getPreco() + "(Taxas: R$ "+
               taxa +")";
    }
   
}

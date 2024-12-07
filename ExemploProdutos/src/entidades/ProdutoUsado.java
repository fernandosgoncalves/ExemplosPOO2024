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
public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado() {
    }

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public String etiqueta(){
        return super.getNome() + " (usado) - R$: " + 
                this.getPreco() + "(Data Fabricacao: "+
               dataFabricacao +")";
    }
    
}

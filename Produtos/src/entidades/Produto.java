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
public class Produto {
    public String nome;
    public float preco;
    public int quantidade;
    
    public void mostraDados(){
        System.out.println("Nome: " + nome + " Quant: "+ quantidade 
                + " Preco UN: " + preco + " Valor Total: " +
                valorTotalemEstoque());
    }
    
    public float valorTotalemEstoque(){
        return quantidade*preco;
    }
    
    public void adicionaProduto(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removeProduto(int quantidade){
        if(this.quantidade >= quantidade)
            this.quantidade -= quantidade;
        else
            System.out.println("Não há saldo suficiente!");
    }
}

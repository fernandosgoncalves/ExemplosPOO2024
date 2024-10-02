/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entidades.Produto;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Produtos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        int quant;
        
        Scanner lerTexto = new Scanner(System.in);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto: ");
        p1.nome = lerTexto.nextLine();
        System.out.println("Informe a quantidade: ");
        p1.quantidade = ler.nextInt();
        System.out.println("Informe o preco unitario: ");
        p1.preco = ler.nextFloat();
        
        p1.mostraDados();
        
        System.out.println("Informe o nome do produto: ");
        p2.nome = lerTexto.nextLine();
        System.out.println("Informe a quantidade: ");
        p2.quantidade = ler.nextInt();
        System.out.println("Informe o preco unitario: ");
        p2.preco = ler.nextFloat();
        
        p2.mostraDados();
        
        System.out.println("Informe a quantidade de produtos que deseja inseir:");
        quant = ler.nextInt();
        
        p1.adicionaProduto(quant);
                
        System.out.println("Informe a quantidade de produtos que deseja inseir:");
        quant = ler.nextInt();
        
        p2.adicionaProduto(quant);
        
        p1.mostraDados();
        p2.mostraDados();
        
        System.out.println("Informe a quantidade que deseja remover: ");
        quant = ler.nextInt();
        
        p1.removeProduto(quant);
        
        System.out.println("Informe a quantidade que deseja remover: ");
        quant = ler.nextInt();
        
        p2.removeProduto(quant);
        
        p1.mostraDados();
        p2.mostraDados();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploprodutos;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExemploProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto[] lista = new Produto[10];
        int quant;
        String opcao, auxNome, auxData;
        double auxPreco, auxTaxa;
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        System.out.println("Informe quantos produtos:");
        quant = ler.nextInt();
        
        for(int i=0; i<quant; i++){
            System.out.println("Novo, Usado ou Importado (n/u/i)?");
            opcao = lerTexto.nextLine();
            System.out.print("Nome: ");
            auxNome =  lerTexto.nextLine();
            System.out.print("Preco: ");
            auxPreco = ler.nextDouble();
            if(opcao.equalsIgnoreCase("n")){
                lista[i] = new Produto(auxNome, auxPreco);
            }else if(opcao.equalsIgnoreCase("u")){
                System.out.print("Data fabricacao:");
                auxData = lerTexto.nextLine();
                lista[i] = new ProdutoUsado(auxNome, auxPreco, auxData);
            }else if(opcao.equalsIgnoreCase("i")){
                System.out.print("Taxas: ");
                auxTaxa = ler.nextDouble();
                lista[i] = new ProdutoImportado(auxNome, auxPreco, auxTaxa);
            }
        }
        
        System.out.println("TAG DE PRECOS");
        for(int i=0; i<quant; i++){
            System.out.println(lista[i].etiqueta());
        }
        
    }
    
}

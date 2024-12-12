/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ExePessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        System.out.print("Informe a quantidade de pessoas que deseja cadastrar:");
        int qtde = ler.nextInt();
        
        Pessoa[] p = new Pessoa[qtde];
        
        for(int i=0; i<qtde; i++){
            System.out.println("Pessoa " + (i+1));
            System.out.print("Fisica ou Juridica (PF/PJ):");
            String opcao = lerTexto.nextLine();
            System.out.print("Nome: ");
            String nome = lerTexto.nextLine();
            System.out.print("Renda Anual: ");
            double renda = ler.nextDouble();
            if(opcao.equalsIgnoreCase("PF")){
                //Pessoa Fisica
                System.out.print("Gastos Saude: ");
                double gSaude = ler.nextDouble();
                p[i] = new PessoaFisica(gSaude, nome, renda);
            }else{
                //Pessoa Juridica
                System.out.println("Qtde Funcionarios: ");
                int qtdeF = ler.nextInt();
                p[i] = new PessoaJuridica(qtdeF, nome, renda);
            }
        }
        
        double totalImposto = 0;
        System.out.println("Contribuintes");
        for(int i=0; i< qtde; i++){
            System.out.println(p[i]);
            totalImposto += p[i].valorImposto();
        }
        
        System.out.println("Total Arrecadado: " + totalImposto);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaempregado;

import entidades.Empregado;
import entidades.Terceirizado;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class HerancaEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado[] empregados = new Empregado[15];
        //Terceirizado[] ter = new Terceirizado[15];
        int quantidade, auxHoras;
        String tipo, auxNome;
        double auxValorHoras, auxAdicional;
        //int qtdeEmp = 0, qtdeTer = 0;
        
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        
        System.out.println("Informe quantos deseja cadastar (max 15):");
        quantidade = ler.nextInt();
        
        for(int i=0; i< quantidade; i++){
            System.out.println("Empregado #"+i+" dados:");
            System.out.println("Terceirizado(s/n)?");
            tipo = lerTexto.nextLine();
            System.out.println("Nome: ");
            auxNome = lerTexto.nextLine();
            System.out.println("Horas: ");
            auxHoras = ler.nextInt();
            System.out.println("Valor por hora: ");
            auxValorHoras = ler.nextDouble();
            if(tipo.equalsIgnoreCase("s")){
                System.out.println("Adicional: ");
                auxAdicional = ler.nextDouble();
                empregados[i] = new Terceirizado(auxAdicional, 
                        auxNome, auxHoras, auxValorHoras);
                //qtdeTer++;
            }else{
                empregados[i] = new Empregado(auxNome, auxHoras, 
                        auxValorHoras);
                //qtdeEmp++;
            }
        }
        
        System.out.println("PAGAMENTOS");
        for(int x=0; x<quantidade; x++){
            System.out.println(empregados[x].mostraPagamento());
        }
        /*for(int y=0; y<qtdeTer; y++){
            System.out.println(ter[y].mostraPagamento());
        }*/
    }
    
}

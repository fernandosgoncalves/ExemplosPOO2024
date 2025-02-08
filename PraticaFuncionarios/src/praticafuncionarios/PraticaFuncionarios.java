/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praticafuncionarios;

import entidades.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PraticaFuncionarios {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner lerTexto = new Scanner(System.in);
        int quantidade;
        ArrayList<Funcionario> lista = new ArrayList();
        
        System.out.print("Informe a quantidade de cadastros: ");
        quantidade = ler.nextInt();
        
        for(int i=0; i< quantidade; i++){
            System.out.print("Informe o Id: ");
            int id = ler.nextInt();
            System.out.print("Informe o nome: ");
            String nome = lerTexto.next();
            System.out.print("Informe o salario: ");
            float salario = ler.nextFloat();
            
            lista.add(new Funcionario(id, nome, salario));
        }
        
        System.out.print("Informe o funcionario que deseja atualizar o salario:");
        int cod = ler.nextInt();
        
        System.out.print("Informe o percentual:");
        float percentual = ler.nextFloat();
        
        int achou = 0;
        for(Funcionario f: lista){
            if(f.getId() == cod){
                f.aumentoSalarial(percentual);
                achou = 1;
                break;
            }
        }
        
        if(achou == 0)
            System.out.println("Funcionario não encontrado!");
        
        System.out.println("");
        System.out.println("Lista de Empregados:");
        for(Funcionario f: lista){
            System.out.println(f);
        }
    }
    
}

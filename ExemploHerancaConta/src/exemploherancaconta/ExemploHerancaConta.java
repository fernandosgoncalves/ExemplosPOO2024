/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherancaconta;

import entidades.Conta;
import entidades.ContaBusiness;

/**
 *
 * @author aluno
 */
public class ExemploHerancaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta pf1 = new Conta(123, "Joao da Silva", 15000);
        Conta pf2 = new Conta(321, "Maria da Gloria", 25000);
        ContaBusiness pj1 = new ContaBusiness(5000, 222, "IFSC", 1800);
        ContaBusiness pj2 = new ContaBusiness(180000, 
                333, "Diamante Energia", 350000);
        
        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pj1);
        System.out.println(pj2);
        
        pf1.deposito(250);
        pf1.saque(3500);
        
        pf2.saque(5000);
        
        pj1.deposito(300);
        pj1.saque(18500);
        pj1.emprestimo(450);
        
        pj2.emprestimo(2500);
        
        System.out.println("-------------");
        System.out.println(pf1);
        System.out.println(pf2);
        System.out.println(pj1);
        System.out.println(pj2);
        
    }
    
}

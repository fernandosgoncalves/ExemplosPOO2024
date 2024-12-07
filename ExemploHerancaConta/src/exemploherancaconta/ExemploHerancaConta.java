/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherancaconta;

import entidades.Conta;
import entidades.ContaBusiness;
import entidades.ContaPoupanca;

/**
 *
 * @author aluno
 */
public class ExemploHerancaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Gabriel", 0);
        ContaBusiness contaB = new ContaBusiness(500, 1002, 
                "Maria", 0);
        
        //UPCASTING
        Conta conta2 = contaB;
        Conta conta3 = new ContaBusiness(200, 1003, "Pedro", 200);
        Conta conta4 = new ContaPoupanca(1004, "Rosa", 200, 0.05);
        
        System.out.println(conta3);
        
        conta3.saque(50);
        conta4.saque(50);
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getSaldo());
        
        //DOWNCASTING
        ContaBusiness conta5 = (ContaBusiness)conta3;
        conta5.emprestimo(200);
        
        System.out.println(conta5);
        System.out.println(conta3);
        
        //ContaBusiness conta6 = (ContaBusiness) conta4;
        if(conta4 instanceof ContaBusiness){
            ContaBusiness conta6 = (ContaBusiness) conta4;
            conta6.emprestimo(150);
            System.out.println("Emprestimo!");
        }
        
        if(conta4 instanceof ContaPoupanca){
            ContaPoupanca conta6 = (ContaPoupanca) conta4;
            conta6.atualizaSaldo();
            System.out.println("Atualiza Saldo!");
            System.out.println(conta6.getSaldo());
            conta6.saque(25);
            System.out.println(conta6.getSaldo());
        }
        
        System.out.println(conta3.getSaldo());
        conta3.saque(50);
        System.out.println(conta3.getSaldo());
        
        
        
        
        
        
        
        
        
        /*Conta pf1 = new Conta(123, "Joao da Silva", 15000);
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
        System.out.println(pj2);*/
        
    }
    
}

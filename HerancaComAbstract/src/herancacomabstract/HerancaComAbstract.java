/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancacomabstract;

import entidades.Conta;
import entidades.ContaBusiness;
import entidades.ContaPoupanca;

/**
 *
 * @author aluno
 */
public class HerancaComAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta[] lista = new Conta[5];
        
        lista[0] = new ContaPoupanca(1001, "Luiz", 100, 0.04);
        lista[1] = new ContaBusiness(500, 1002, "Pedro", 2000);
        lista[2] = new ContaPoupanca(1003, "Maria", 800, 0.02);
        lista[3] = new ContaBusiness(850, 1004, "Julia", 450);
        
        float saldo = 0;
        
        for(int i=0; i<5; i++){
            if(lista[i] != null)
                saldo += lista[i].getSaldo();
        }
        
        System.out.println("Saldo Total: " + saldo);
        
        for(int i=0; i<5; i++){
            if(lista[i] != null)
                lista[i].deposito(10);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moeda;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Moeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double valor, cotacao, valorFinal;
        
        System.out.print("Informe o valor da cotação do dolar: ");
        cotacao = ler.nextDouble();
        
        System.out.println("Informe o valor que deseja compar: ");
        valor = ler.nextDouble();
        
        valorFinal = Calculadora.converteMoeda(valor, cotacao);
        
        System.out.println("O valor de compra de U$$: " + valor + " é de R$: " + 
                valorFinal);
    }
    
}

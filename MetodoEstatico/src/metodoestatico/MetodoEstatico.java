/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoestatico;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class MetodoEstatico {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Calculadora calc = new Calculadora();
        
        double raio;
        double c;
        double v;
        
        System.out.print("Informe o raio da circunferência: ");
        raio = ler.nextDouble();
        
        c = Calculadora.circunferencia(raio);
        v = Calculadora.volume(raio);
        
        System.out.println("Circ.: " + c);
        System.out.println("Volume: " + v);
  
    }
    
}

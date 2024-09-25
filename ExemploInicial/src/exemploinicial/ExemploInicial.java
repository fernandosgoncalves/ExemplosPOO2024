/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploinicial;

/**
 *
 * @author aluno
 */
public class ExemploInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Programação Orientada a Objetos";
        int a = 78, b = 43;
        float c = 3.45f, d = 8.99f;
        float result1, result2, result3, result4;
        
        System.out.println("Texto: " + texto);
        System.out.println("a: " + a + " b: " + b);
        System.out.println("c: " + c + " d: " + d);
        
        result1 = (a*b)/a;
        result2 = ((c*c)*d)-c;
        result3 = d/c;
        result4 = b-2*a;
        
        System.out.println("(a*b)/a = " + result1);
        System.out.println("((c*c)*d)-c = " + result2);
        System.out.println("d/c = " + result3);
        System.out.println("b-2*a = " + result4);
        
    }
    
}

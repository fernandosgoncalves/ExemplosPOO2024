/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolistas;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ExemploListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList();
        
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Joana");
        nomes.add("Cintia");
        
        System.out.println("Lista de nomes: " + nomes);
        System.out.println(nomes.size());
        nomes.remove(3);
        System.out.println("Lista de nomes: " + nomes);
        nomes.set(2, "julio");
        System.out.println("Lista de nomes: " + nomes);
    }
    
}

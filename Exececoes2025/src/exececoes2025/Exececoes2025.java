/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exececoes2025;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exececoes2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        metodo1();
        
        System.out.println("Fim do programa!");
        
    }
    
    public static void metodo1(){
        metodo2();
    }
    
    public static void metodo2(){
        Scanner ler = new Scanner(System.in);
        
        try{
            String[] lista = ler.nextLine().split(" ");
            int pos = ler.nextInt();
            System.out.println(lista[pos]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Posicao Inválida!");
            e.printStackTrace();
        }catch(InputMismatchException e){
            System.out.println("Valor inválido!");
        }
        ler.close();
    }
    
}

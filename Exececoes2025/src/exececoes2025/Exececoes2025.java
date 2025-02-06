/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exececoes2025;

import java.io.File;
import java.io.FileNotFoundException;
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
        int x=10 , y=0, z;
        
        File f = new File("C:\\temp\\aa.txt");
        Scanner sc = null;    
        metodo1();
        try{
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            z = x/y;
        }catch(ArithmeticException e){
            System.out.println("Divisão por zero!");
        }catch(FileNotFoundException e){
            System.out.println("Erro ao abrir arquivo!");
        }finally{
            if(sc != null)
                sc.close();
        }
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

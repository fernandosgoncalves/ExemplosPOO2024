/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Excecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        
        try
        {
            String[] vetor = ler.nextLine().split(" ");
            int posicao = ler.nextInt();

            System.out.println(vetor[posicao]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Erro de entrada!");
        }
        finally{
            System.out.println("Cadastro concluido com sucesso!");
        }

        //try {
        //    FileReader f = new FileReader("C:\\temp\\a.txt");
        //} catch (FileNotFoundException ex) {
        //    System.out.println(ex.getMessage());
        //}
        System.out.println("Fim do programa!");
    }
    
}

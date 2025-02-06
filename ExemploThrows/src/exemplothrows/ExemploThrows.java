/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplothrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ExemploThrows {

    
    
    public static void main(String[] args) throws IllegalArgumentException, ParseException {
        Date checkin;
        Date checkout;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o check-in:");
        checkin = sdf.parse(ler.next());
        System.out.println("Informe o check-out:");
        checkout = sdf.parse(ler.next());
        
        long diff = checkout.getTime() - checkin.getTime();
        System.out.println(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        
        System.out.println(sdf.format(checkin));
            
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
        
        if(valor2 == 0){
            throw new IllegalArgumentException("Operação Inválida! Divisão por zero!");
        }else{
            System.out.println(valor1 + " / " + valor2 + " = " + valor1/valor2);
        }
        
        System.out.println("Fim do programa!");
    }
    
}

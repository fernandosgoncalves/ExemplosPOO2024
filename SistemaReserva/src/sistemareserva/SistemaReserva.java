/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemareserva;

import entidades.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SistemaReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int quarto;
        Date checkin = new Date();;
        Date checkout = new Date();
        
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Scanner ler = new Scanner(System.in);

            System.out.print("Informe o quarto: ");
            quarto = ler.nextInt();

            System.out.print("Check-in (dd/mm/yyyy):");
            checkin = sdf.parse(ler.next());
            System.out.print("Chekc-out (dd/mm/yyyy):");
            checkout = sdf.parse(ler.next());

            Reserva r = new Reserva(quarto, checkin, checkout);

            System.out.println(r);

            System.out.println("");
            System.out.println("Entre com os dados para modificar a reserva:");
            System.out.print("Check-in (dd/mm/yyyy):");
            checkin = sdf.parse(ler.next());
            System.out.print("Chekc-out (dd/mm/yyyy):");
            checkout = sdf.parse(ler.next());

            r.atualizaReserva(checkin, checkout);

            System.out.println(r);
        }catch (ParseException e) {
            System.out.println("Formato de Data Inválida!");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim do programa!");
    }
    
}

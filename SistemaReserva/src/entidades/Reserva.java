/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import excecoes.DomainException;
import java.text.SimpleDateFormat;

/**
 *
 * @author aluno
 */
public class Reserva {
    private int quarto;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Reserva(int quarto, Date checkin, Date checkout) {
        if(!checkout.after(checkin)){
            throw new RuntimeException("A data de check-out deve ser posterior ao check-in!");
        }
            
        this.quarto = quarto;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }
    
    public int duracao(){
        long diff = checkout.getTime() - checkin.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    
    public void atualizaReserva(Date checkin, Date checkout){
        Date hoje = new Date();
        if(checkin.before(hoje) || checkout.before(hoje)){
            throw new RuntimeException("As datas de reserva para atualização devem ser datas futuras!");
        }
        if(!checkout.after(checkin)){
            throw new RuntimeException("A data de check-out deve ser superior ao check-in!");
        }
        
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reserva: " + 
                " Quarto: " + quarto + 
                ", Check-in:" + sdf.format(checkin) + 
                ", Check-out:" + sdf.format(checkout) +
                ", " + duracao() +
                " noites";
    }
            
}

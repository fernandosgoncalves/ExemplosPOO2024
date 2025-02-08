package servico;

import entidades.AluguelCarro;
import entidades.Fatura;
import java.time.Duration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class ServicoAluguel {
    private Double precoDiaria;
    private Double precoHora;
    
    private TaxaBrasil taxa;

    public ServicoAluguel(Double precoDiaria, Double precoHora, TaxaBrasil taxa) {
        this.precoDiaria = precoDiaria;
        this.precoHora = precoHora;
        this.taxa = taxa;
    }
    
    public void processaAluguel(AluguelCarro aluguel){
        double minutos = Duration.between(aluguel.getRetirada(), aluguel.getDevolucao()).toMinutes();
        double horas = minutos/60;
        
        double taxaBasica;
        if(horas <= 12)
            taxaBasica = precoHora * Math.ceil(horas);
        else
            taxaBasica = precoDiaria * Math.ceil(horas/24);
        
        double impostos = taxa.taxa(taxaBasica);
        
        aluguel.setFatura(new Fatura(taxaBasica, impostos));
    }
    
}

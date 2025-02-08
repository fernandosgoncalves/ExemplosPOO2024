/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguel;

import entidades.AluguelCarro;
import entidades.Veiculo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import servico.ServicoAluguel;
import servico.TaxaBrasil;

/**
 *
 * @author aluno
 */
public class Aluguel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        DateTimeFormatter fmt = new DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("Entre com os Dados:");
        System.out.print("Modelo:");
        String modelo = ler.nextLine();
        System.out.println("Data retirada:");
        LocalDateTime inicio = LocalDateTime.parse(ler.nextLine(),fmt);
        System.out.println("Data devolucao:");
        LocalDateTime devolucao = LocalDateTime.parse(ler.nextLine(),fmt);
        
        AluguelCarro cr = new AluguelCarro(inicio, devolucao, new Veiculo(modelo), null);
        
        System.out.println("Valor por hora:");
        double valorHora = ler.nextDouble();
        System.out.println("Valor da diaria: ");
        double diaria = ler.nextDouble();
        
        ServicoAluguel servicoAluguel = new ServicoAluguel(diaria, valorHora, new TaxaBrasil());
        
        servicoAluguel.processaAluguel(cr);
        
        System.out.println("FATURA");
        System.out.println("Taxa Basica: " + String.format("%.2f", cr.getFatura().getTaxaBasica()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getFatura().getImposto()));
        System.out.println("Total: " + String.format("%.2f", cr.getFatura().getTotalFatura()));
    }
    
}

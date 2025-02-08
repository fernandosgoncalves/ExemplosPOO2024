/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDateTime;

/**
 *
 * @author aluno
 */
public class AluguelCarro {
    private LocalDateTime retirada;
    private LocalDateTime devolucao;
    
    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro() {
    }

    public AluguelCarro(LocalDateTime retirada, LocalDateTime devolucao, Veiculo veiculo, Fatura fatura) {
        this.retirada = retirada;
        this.devolucao = devolucao;
        this.veiculo = veiculo;
        this.fatura = fatura;
    }

    public LocalDateTime getRetirada() {
        return retirada;
    }

    public void setRetirada(LocalDateTime retirada) {
        this.retirada = retirada;
    }

    public LocalDateTime getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(LocalDateTime devolucao) {
        this.devolucao = devolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
    
    
    
}

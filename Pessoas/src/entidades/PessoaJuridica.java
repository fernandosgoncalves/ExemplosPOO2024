/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author aluno
 */
public class PessoaJuridica extends Pessoa{
    private int qtdeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(int qtdeFuncionarios, String nome, double renda) {
        super(nome, renda);
        this.qtdeFuncionarios = qtdeFuncionarios;
    }

    public int getQtdeFuncionarios() {
        return qtdeFuncionarios;
    }

    public void setQtdeFuncionarios(int qtdeFuncionarios) {
        this.qtdeFuncionarios = qtdeFuncionarios;
    }
    
    @Override
    public double valorImposto() {
        if(this.qtdeFuncionarios > 10)
            return this.renda * 0.14;
        else
            return this.renda * 0.16;
    }
    
}

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
public class PessoaFisica extends Pessoa{
    private double gastosSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(double gastosSaude, String nome, double renda) {
        super(nome, renda);
        this.gastosSaude = gastosSaude;
    }
        
    @Override
    public double valorImposto() {
        if(this.renda < 20000){
            if(this.gastosSaude > 0)
                return (this.renda * 0.15) - (this.gastosSaude*0.5);
            else
                return (this.renda * 0.15);
        } else {
            if(this.gastosSaude > 0)
                return (this.renda * 0.25) - (this.gastosSaude*0.5);
            else
                return (this.renda * 0.25);
        }
    }
    
}

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
public class ContaBusiness extends Conta {
    private float limiteEmprestimo;
    
    public ContaBusiness(){
        super();
    }

    public ContaBusiness(float limiteEmprestimo, int numero, String proprietario, float saldo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public float getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(float limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public String toString() {
        return "ContaBusiness{Numero: " + super.getNumero() + 
                " Proprietario: " + super.getProprietario() + 
                " Saldo: " + saldo + " Limite Emprestimo: " + 
                limiteEmprestimo + '}';
    }
    
    public void emprestimo(float montante){
        if(this.limiteEmprestimo >= montante){
            saldo += montante;
        }
    }
    
    @Override
    public void saque(float montante){
        this.saldo -= (montante + 2);
    }

}
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
public class Conta {
    private int numero;
    private String proprietario;
    protected float saldo;
    
    public Conta(){
        this.saldo = 0;
    }
    
    public Conta(int numero, String proprietario, float saldo){
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "numero=" + numero + ", proprietario=" +
                proprietario + ", saldo=" + saldo + '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getSaldo() {
        return saldo;
    }

    public final void deposito(float montante){
        this.saldo += montante;
    }
    
    public void saque(float montante){
        this.saldo -= (montante + 5.00);
    }
}
